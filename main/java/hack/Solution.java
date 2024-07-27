package hack;


import java.util.*;
public class Solution {

    public static String run(int input) {
        /*
         * Write your code below; return type and arguments should be according to the problem's requirements
         */

        List<String> result = new ArrayList<>();
        dfs(input,"",1,result);
        return String.join(",", result);
    }

    static void dfs(int n, String current, int start, List<String> result){
        if(current.length() == n){
            result.add(current);
            return;
        }

        for(int i=start; i<=9;i++){
            dfs(n, current+i, i, result);
        }
    }

    public static void main(String[] args) {
        System.out.println(run(1));
    }

}
