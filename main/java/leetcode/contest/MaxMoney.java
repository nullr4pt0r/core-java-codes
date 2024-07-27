package leetcode.contest;

public class MaxMoney {
    static int rob(int[] arr, int index){
        if(index >= arr.length){
            return 0;
        }
        int pick = arr[index] + rob(arr, index+2);
        int unpick = 0 + rob(arr, index+1);
        return Math.max(pick, unpick);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(rob(arr, 0));
    }
}
