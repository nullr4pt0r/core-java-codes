package InterviewPrep;

import java.io.InputStream;
import java.util.Scanner;

public class Source {
    static void abc(){
        System.out.println("abc");
        {
            int x = 3;

            System.out.println("x is "+~x);
            int v1 = 5;
            int v2 = 6;
            int v3= ++v2*v1/v2+v2;
            System.out.println("v3 "+v3);
        }
        System.out.println("abc");
        finaliz();
    }
    protected static void finaliz(){
        String s = "TRUE FALSE";
        boolean x = Boolean.valueOf(s);
        System.out.println(x);
//        InputStream;
    }
    public static int makePalindrome(String s1, String s2){
        StringBuilder sb = new StringBuilder(s1);
        sb.reverse();
        int count = 0;
        for(int i=0;i <sb.length();i++){
            if(sb.charAt(i) != s2.charAt(i)){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
//        Scanner in = new Scanner(System.in);
//        String s1 = in.nextLine();
//        String s2 = in.nextLine();
//
//        if(s1.length() != s2.length()){
//            System.out.println("-1");
//        }
//        else{
//            System.out.println(makePalindrome(s1,s2));
//        }
abc();

    }
}

enum  Enum {

}