package leetcode.contest;

import java.util.Arrays;

public class Add1 {

        public static int[] plusOne(int[] digits) {
            int[] arr = new int[digits.length+1];
            int add = 1;
            int j = arr.length-1;
            for(int i=digits.length-1;i>=0;i--) {
                if(digits[i] < 9){
                    digits[i] ++;
                    return digits;
                }
                digits[i] = 0;
            }
            digits = new int[digits.length+1];
            digits[0] = 1;
            return digits;
        }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[] {9,9})));
    }
    }

