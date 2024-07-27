package multithreading.mergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSort implements Callable<List<Integer>> {
   private final List<Integer> listToSort;
    private final ExecutorService es;
   MergeSort(List<Integer> list, ExecutorService ed){
       this.listToSort = list;
         this.es = ed;
   }

    @Override
    public List<Integer> call() throws Exception {
       if(listToSort.size() <= 1){
           return listToSort;
       }
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for(int i = 0; i< listToSort.size()/2; i++){
            left.add(listToSort.get(i));
        }
        for(int i = listToSort.size()/2; i< listToSort.size(); i++){
            right.add(listToSort.get(i));
        }

        //now we need to recursively call
//        ExecutorService es = Executors.newCachedThreadPool();
       Future<List<Integer>> leftHalfFuture = es.submit(new MergeSort(left, es));
       Future<List<Integer>> rightHalfFuture = es.submit(new MergeSort(right, es));

//        System.out.println("called future");

        List<Integer> leftHalf = leftHalfFuture.get();
        List<Integer> rightHalf = rightHalfFuture.get();

        //merge

        int p1 = 0;
        int p2 = 0;
        List<Integer> sortedList = new ArrayList<>();
        while(p1< left.size() && p2<right.size()){
            if(leftHalf.get(p1) <= rightHalf.get(p2)){
                sortedList.add(leftHalf.get(p1));
                p1++;
            }else{
                sortedList.add(rightHalf.get(p2));
                p2++;
            }
        }

        while(p1<leftHalf.size()){
            sortedList.add(leftHalf.get(p1));
            p1++;
        }
        while(p2< rightHalf.size()){
            sortedList.add(rightHalf.get(p2));
            p2++;
        }
        return sortedList;
    }
}
