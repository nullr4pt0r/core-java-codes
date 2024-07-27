package leetcode.contest;

import java.util.*;

public class SlidingWindowMaximum {
    static public int[] maxSlidingWindoww(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        Map<Integer,Integer> map = new HashMap<>();
        int[] res = new int[nums.length-k+1];

        //we find the first set of max values
        for(int i=0;i<k;i++){
            if(nums[i] > max){
                max = nums[i];
                index = i;
            }
        }
        max = nums[index];
        map.put(index,max);


        //now move to find next
        int l = 0;
        int r = k-1;
        while(r<nums.length){
            res[l] = max;
            if(map.containsKey(l)){
                //remove
                map.remove(l);
                index = -1;
            }
            l++;r++;//move to next window
            if(!map.isEmpty()){ //if map has some value then compare new value to the existing max value
                max = map.get(index);
                if(nums[r] > max){
                    max = nums[r]; //and update the values
                    index = r;
                    map.remove(index);
                    map.put(index,max);
                }
            }else{ //else just make it m

            }
        }
        nums[l] = max;
        return nums;
    }

    static public int[] maxSlidingWindow(int[] nums, int k){
        int[] res = new int[nums.length-k+1];
        ArrayDeque<Integer> q = new ArrayDeque<>();



//        for(int i=0;i<k;i++){// for first window
//            while(!q.isEmpty() && q.peek() < nums[i]){
//                q.poll();
//            }
//
//                q.offer(nums[i]);
//
//        }
        //find the max {1, 3, -1, -3, 5, 3, 6, 7}
        int l = 0; int r = 0;
        while(r < nums.length){
            while(!q.isEmpty() && nums[q.peekLast()] < nums[r]){ // allow only greater value to the left end of queuq
                q.removeLast(); // remove index
            }
            q.offer(r); // insert index

            //removal of out of bound window
            if(l > q.peekFirst()){ //if l > q.getFirst
                q.removeFirst(); //remove
            }

            if(r+1 >= k){ // if we achieve the window
                res[l] = nums[q.peekFirst()]; //collect the max value
                l++; //slide the left end
            }
            r++; //slide the right end

        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,1,2,0,5};
        System.out.println(Arrays.toString(maxSlidingWindow(arr, 3)));
    }
}
