package ExecutorService;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exe {
    public static void main(String[] args) {
//        ExecutorService es = Executors.newFixedThreadPool(10);
        ExecutorService esc = Executors.newCachedThreadPool();


        Thread thread;
        for(int i=1;i<=100;i++){
            thread = new Thread(new SubThread());
//            es.submit(thread);
            esc.submit(thread);
        }
//        es.shutdown();
        esc.shutdown();
    }
}
