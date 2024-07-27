package leetcode.contest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class RelativeRanks {
   static public String[] findRelativeRanks(int[] score) {
       /*
        [5,4,3,2,1] => we need to know all the values in max sorted order to label them
        1. sorting => but it changes the index values
        2. HashMap => but we need to know their rank.
        3. Heap => maxHeap . O(N) in converting the array to heap. but later we need to use Map or Array to store their rank
        Heapify them , then use the array or map to extract and map them

        */

        int n = score.length;
        String[] res = new String[n];
        List<Integer> arr = Arrays.asList(Arrays.stream(score).boxed().toArray(Integer[]::new));
        PriorityQueue<Integer> q = new PriorityQueue<>((x,y) -> y.compareTo(x));
        q.addAll(arr);

        for(int i=0;i<n;i++){
            int num = q.poll();
            int index = arr.indexOf(num);
            if(i>=3){
                res[index] = String.valueOf(i+1);
            }else{
               switch (i){
                   case 0 : res[index] = new String("Gold Medal");break;
                   case 1 : res[index] = new String("Silver Medal");break;
                   case 2 : res[index] = new String("Bronze Medal");break;
               }
            }
        }
return res;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findRelativeRanks(new int[]{10,3,8,9,4})));
    }
}
