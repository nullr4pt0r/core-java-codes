package leetcode.contest;

import java.util.*;

public class TopKFreq {

    class Obj{
        int num;
        int freq;
    }

   static  public int[] topKFrequent(int[] nums, int k) {
        // 1 -> 3
        // 2 -> 2
        // 3 -> 1

        //k = 2

        Map<Integer, Integer> map = new HashMap<>();

        for(int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        //we have freq

        //I have to sort . but it will definitely takes NlogN as we need to compare the elements

        //if without sorting
        //use heap => but using heap leads to nlogn right

        List<Integer>[] arr = new List[nums.length+1];

        for(int key:map.keySet()){
            int freq = map.get(key);
            if(arr[freq] == null){
                arr[freq] = new ArrayList<Integer>();
            }

            arr[freq].add(key);
        }

        //build the max heap
        int[] res = new int[k];
        int m = k-1;
        for(int i = arr.length-1;i>=0;i--){
            if(arr[i] != null){
               for(int j=0;j<arr[i].size();j++){
                   res[m--] = arr[i].get(j);
               }
            }

            if(m<0){
                break;
            }
        }

        return res;

    }
    public static void main(String[] args) {
        int[] arr = {1,2};
        int[] res = topKFrequent(arr,2);
        System.out.println(Arrays.toString(res));
    }
}
