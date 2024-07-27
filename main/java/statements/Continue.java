package statements;

import java.util.Arrays;

public class Continue {
    //labels
    public static void main(String[] args) {
        int[][] arr = {{-1,2,3},{2,3,4}};
        process: for(int i=0;i<arr.length;i++){
           boolean post = true;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < 0) {
                    post = false;
                    continue process;
                }
            }
            if(post){
                System.out.println(Arrays.toString(arr[i]));
            }
        }
    }
}
