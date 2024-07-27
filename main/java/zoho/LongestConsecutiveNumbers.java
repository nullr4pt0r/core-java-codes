package zoho;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveNumbers {
  static  public int longestConsecutive(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        int max = 0;
        for(int key:map.keySet()){
            int count = 0;

            if(map.containsKey(key+1)){
                //continue;
            }
            else if(map.containsKey(key-1)){
                while(key > Integer.MIN_VALUE){
                    count++;
                    key --;
                    if(!map.containsKey(key)){
                        max = Math.max(count,max);
                        break;
                    }

                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
       int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }
}
