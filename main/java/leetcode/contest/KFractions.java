package leetcode.contest;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class KFractions {
    static public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int[] res = new int[2];


        Map<Double, String> map = new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                map.put( ((double)arr[i]/arr[j]), arr[i]+","+arr[j]);
            }
        }
        int i = 0;
        for(double key:map.keySet()){
            i++;
            if(i == k){
                String[] ar = map.get(key).split(",");
                res[0] = Integer.parseInt(ar[0]);
                res[1] = Integer.parseInt(ar[1]);
                break;
            }

        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        System.out.println(Arrays.toString(kthSmallestPrimeFraction(arr,3)));
    }
}
