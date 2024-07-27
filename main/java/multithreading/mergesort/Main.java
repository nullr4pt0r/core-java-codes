package multithreading.mergesort;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

            Instant time = Instant.now();


        List<Integer> list = List.of(5, 3, 2, 1, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        ExecutorService es = Executors.newCachedThreadPool();
       Future<List<Integer>> sortedListFuture = es.submit(new MergeSort(list,es));
       List<Integer> sortedList = sortedListFuture.get();
       es.shutdown();
        System.out.println(Duration.between(time, Instant.now()).toMillis());
       System.out.println(sortedList);
        System.out.println(list);


    }
}
