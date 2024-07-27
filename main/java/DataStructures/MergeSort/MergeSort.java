package DataStructures.MergeSort;

import java.util.Arrays;

public class MergeSort {
    static void merge(int[] arr, int start, int end){
        if(end==start){
            return;
        }
        int mid = start+(end-start)/2;
        merge(arr, start,mid);
        merge(arr,mid+1, end);
        mergeArray(arr, start,mid, end);
    }

    static void mergeArray(int[] arr, int start, int mid, int end){
        System.out.println("sorting array => Start : "+start+" end : "+end+" mid : "+mid);
        int[] res = new int[end-start+1];
        int p1 = start;
        int p2 = mid+1;
        int p3=0;
        while(p1<=mid && p2<=end){
            if(arr[p1] < arr[p2]){
                res[p3] = arr[p1];
                p1++; p3++;
            }
            else {
                res[p3] = arr[p2];
                p2++;
                p3++;
            }
        }

        while(p1 <= mid){
            res[p3] = arr[p1];
            p1++;p3++;
        }
        while(p2<=end){
            res[p3] = arr[p2];
            p2++;p3++;
        }
        //copy in the original array

        for(int i=start,j=0;i<=end;i++,j++){
            arr[i] = res[j];
        }
    }

    public static void main(String[] args) {
    int[] arr = {1,4,2,9,6,3,7};
        merge(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
