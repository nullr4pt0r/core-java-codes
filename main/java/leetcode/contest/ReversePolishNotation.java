package leetcode.contest;

import java.util.Stack;

public class ReversePolishNotation {
  static  public int evalRPN(String[] tokens) {
        //if we meet any symbol , take last 2 digit and compute it
        Stack<Integer> st = new Stack<>();

        for(String str:tokens){
            int value = 0;

            if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
                int num = st.pop();
                int num2 = st.pop();
                if(str.equals("+")){
                    value = num + num2;
                }else if(str.equals("-")){
                    value = num-num2;
                }else if(str.equals("*")){
                    value = num*num2;
                }else if(str.equals("/")){
                    value = num2/num;
                }
            }else{
                value = Integer.parseInt(str);
            }
            st.push(value);
        }
        return st.peek();
    }

    public static void main(String[] args) {
        String[] arr = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(arr));
    }
}
