package InterviewPrep.MultiThreading.ExecutorService.exe;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(10);
        for(int i=0;i<5;i++){
            es.submit(new Printer());
        }

        es.shutdownNow();
        System.out.println("Executor Service shutdown : "+es.isShutdown());
    }
}
