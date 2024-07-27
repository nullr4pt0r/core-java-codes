//public class Solution {
//    public static void swap(int start, int end, char[] ch){
//        int temp = ch[start];
//        ch[start] = ch[end];
//        ch[end] = (char) temp;
//    }
//
//    public static void reverse(int start, int end, char[] ch){
//        while(start < end){
//            swap(start,end,ch);
//            start++;
//            end--;
//        }
//    }
//    public static String solve(String A) {
//        boolean found = false;
//        char[] ch = A.toCharArray();
//        int len = A.length();
//        int lastDigit = ch[len-1];
//        int lastIndex = len-1;
//        int index = -1;
//        for(int i=lastIndex-1;i>=0;i--){
//            int num = ch[i];
//            if(num < lastDigit){
//                found = true;
//                index = i;
//            }
//        }
//        if(!found){
//            return "-1";
//        }
//
//        swap(index, lastIndex,ch);
//        if((lastIndex - index - 1) > 0){
//            reverse(index+1, len, ch);
//        }
//
//        return String.valueOf(ch);
//
//    }
//
//    public static void main(String[] args) {
//        System.out.println();
//    }
//}
