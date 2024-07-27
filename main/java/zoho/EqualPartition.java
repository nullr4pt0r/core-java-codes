package zoho;

import interfaces.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EqualPartition {
 static   List<List<Integer>> result = new ArrayList<>();
    static boolean solve(int arr[]){
        int sum = Arrays.stream(arr).sum();

        if((sum&1)==1)//odd number
            return false;

        return findPartition(arr, sum/2, 0, new ArrayList<>());
    }

    static boolean findPartition(int[] arr, int sum, int index, List<Integer> indices){
        if(sum == 0){ //we got it
            result.add(new ArrayList<>(indices));
            return true;
        }

        if(index == arr.length)
            return false;

        indices.add(index);
        boolean taken = findPartition(arr, sum - arr[index], index+1, indices);
        indices.remove(indices.size()-1);
        boolean notTaken = findPartition(arr, sum, index+1, indices);

        return taken || notTaken;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,6,10};
        boolean value = solve(arr);
        System.out.println(value);
        if(value){

            List<Integer> part1 = result.get(0);
            List<Integer> part2 = result.get(1);

            System.out.println("partition 1 : ");
            for(int num:part1){

                System.out.print(arr[num]+" ");
            }
            System.out.println();
            System.out.println("Partition 2 : ");
            for(int num:part2){
                System.out.print(arr[num]+" ");
            }
        }

    }
}
