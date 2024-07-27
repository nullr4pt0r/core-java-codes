package aaaa.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class GenerateParanthesis {

    static void gen(int open, int close, int n, List<String> list, Stack<Character> stack){

        //base
        if ((open == close) && (close == n)){
            StringBuilder sb =  new StringBuilder();
            for(Character ch:stack){
                sb.append(ch);
            }
            list.add(sb.toString());
            return;
        }

        if(open < n){
            stack.push('(');
            gen(open+1, close, n, list, stack);
            stack.pop();
        }

        if(close < open){
            stack.push(')');
            gen(open,close+1, n,list, stack);
            stack.pop();
        }
    }

    static List<String> genParenthesis(int n){
        List<String> gen = new ArrayList<>();
        gen(0,0,n,gen, new Stack<Character>());
        return gen;
    }

    public static void main(String[] args) {
        int n=3;
        genParenthesis(n).forEach(System.out::println);
    }
}
