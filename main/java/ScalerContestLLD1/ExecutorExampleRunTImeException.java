package ScalerContestLLD1;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ExecutorExampleRunTImeException extends Thread{

        public static void main(String[] args) {
            ExecutorService executorService = Executors.newSingleThreadExecutor();

            Callable<String> task = () -> {
                throw new RuntimeException("Task failed");
            };
//    Thread a = new Thread();
//    a.wait();
//
//    ConcurrentHashMap


            Future<String> future = executorService.submit(task);

            try {
                String result = future.get();
                System.out.println(result);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }

            executorService.shutdown();
        }
    }

