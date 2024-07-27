package leetcode.contest;

import java.util.PriorityQueue;

class FindOps {
    int value, count;
    PriorityQueue<Long> q = new PriorityQueue<>();
    long calculate(long x, long y){
        count++;
        return  Math.min(x, y) * 2 + Math.max(x, y);
    }

    int minValues(int k){
        long first = q.poll();
        long second = q.poll();
        if(second >= k && first >= k){
            return count;
        }else{
            q.offer(calculate(first, second));
            return -1;
        }

    }
    public int minOperations(int[] nums, int k) {

        for(int i:nums){
            q.offer((long)i);
        }


        while(!q.isEmpty()){

            if(q.peek() >= k){
                break;
            }
            if(minValues(k) != -1){
                return count;
            }

        }

        return count;

    }

    public static void main(String[] args) {
        FindOps fp =  new FindOps();
        int[] arr = {999999999,999999999,999999999};

        System.out.println(fp.minOperations(arr, 1000000000));
    }
}