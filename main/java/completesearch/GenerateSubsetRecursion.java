package completesearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenerateSubsetRecursion {
   static List<List<Integer>> list = new ArrayList<>();
    static void generateSubset(int k,int n, List<Integer> arrayList){

        if(k == n){
            list.add(new ArrayList<>(arrayList));
            return;
        }
        generateSubset(k+1,n,arrayList);
        //pick
        arrayList.add(k);
        generateSubset(k+1,n,arrayList);
        //unpick
        arrayList.remove(arrayList.size()-1);

    }
    public static void main(String[] args) {
        int n = 3;
        generateSubset(0,n,new ArrayList<>());
        System.out.println("subsets of "+n+" : ");

        for(List<Integer> lists:list){
            System.out.println(Arrays.toString(lists.toArray()));
        }
    }
}
