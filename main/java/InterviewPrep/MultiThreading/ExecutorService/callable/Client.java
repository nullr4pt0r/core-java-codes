package InterviewPrep.MultiThreading.ExecutorService.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(2);
        for(int i=0;i<5;i++){
          Future<Integer> future =  es.submit( new Printer());
            System.out.println(future.get());
        }
    }
}
