package completesearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneratePermutations {
 static   List<List<Integer>> result = new ArrayList<>();
    static void generatePermutations(int n, int[] source, boolean[] arr, List<Integer> list){

        if(list.size() == n){
            result.add(new ArrayList<>(list));
        }
        for(int i=0;i<n;i++){
           if(!arr[i]){
               int num = source[i];
               arr[i] = true;
               list.add(num);
               generatePermutations(n,source,arr,list);
               arr[i] = false;
               list.remove(list.size()-1);
           }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int n = arr.length;
        generatePermutations(n, arr, new boolean[n], new ArrayList<>());
        System.out.println("Permutations of "+Arrays.toString(arr)+" : ");
        for(List<Integer> lists:result){
            System.out.println(Arrays.toString(lists.toArray()));
        }
    }
}
