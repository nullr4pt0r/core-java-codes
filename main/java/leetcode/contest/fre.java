package leetcode.contest;

import java.util.HashMap;
import java.util.Map;

public class fre {

        public static int maxFrequencyElements(int[] nums) {
            Map<Integer,Integer> map= new HashMap<>();
            for(int i:nums){

                map.put(i, map.getOrDefault(i,0)+1);

            }


            int[] arr = new int[nums.length+1];
            for(Integer key:map.keySet()){
                arr[map.get(key)]++;
            }

            int max = Integer.MIN_VALUE;
            int index = -1;
            for(int i=1;i<arr.length;i++){
                if(arr[i] >= max){
                    max = arr[i];
                    index = i;
                }
            }
            System.out.println(index +" "+max);
            return index * max;
        }

    public static void main(String[] args) {
            int[] arr = {1,2,2,3,1,4};
        System.out.println(maxFrequencyElements(arr));
    }
    }

