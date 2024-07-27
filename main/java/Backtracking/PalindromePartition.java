package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromePartition {

    static boolean checkPalindrome(String s, int start, int end){
        while(start<=end){
            if(s.charAt(start++) != s.charAt(end)){
                return  false;
            }
        }
        return true;
    }

    //partition palindrome

    static void solve(String s, int index, List<String> path, List<List<String>> res){
        //base case
        if(s.length() == index){
            //we find a palindrome substring
            res.add(new ArrayList<>(path));
            return;
        }

        for(int i=index;i<s.length();i++){
            if(checkPalindrome(s, index, i)){
                path.add(s.substring(index,i+1));
                solve(s,i+1,path, res);
                path.remove(path.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        List<List<String>> res = new ArrayList<>();
        solve("aab",0,new ArrayList<>(), res);
        for(List<String> list:res){
            System.out.println(Arrays.toString(list.toArray()));
        }
    }
}
