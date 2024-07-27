package TwoPointers;

import java.util.Arrays;

public class ValidTriangle {
   static public int triangleNumber(int[] nums) {
        //using 2 pointers
        Arrays.sort(nums);
        int count = 0;
        for(int i=0;i<nums.length-2;i++){
            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                if(nums[left] + nums[right] > nums[i]){
                    //valid
                    count += right - left;
                    right--;
                }else{
                    left++;
                }
            }

        }

        return count;

    }

    public static void main(String[] args) {
        System.out.println(triangleNumber(new int[]{2,3,2,4}));
    }
}
