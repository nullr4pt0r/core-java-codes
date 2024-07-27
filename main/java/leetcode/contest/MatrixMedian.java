package leetcode.contest;

public class MatrixMedian {
    static public int findMedian(int[][] A) {
        int row = A.length;
        int col = A[0].length;
        int total = row * col;
        int medianIndex = total/2;
        int countIndex = 0;
        int i = 0, j = 0;
        while(countIndex < medianIndex){
            int right = Integer.MAX_VALUE;
            int bottom = Integer.MAX_VALUE;

            if(j+1 < col){
                right = A[i][j+1];
            }
            if(i+1 < row){
                bottom = A[i+1][j];
            }

            //4 cases 1. right max, 2. leftmax,
            if(i+1 == row){
                i = 0;
                j = j+1;
                // continue;
            }
            else if(bottom <= right){
                i = i+1;
            }else {
                j = j+1;
            }
            countIndex++;
        }
        return A[i][j];
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,3,5},
                {2,6,9},
                {3,6,9}
        };
        System.out.println("Answer is "+findMedian(arr));
    }
}
