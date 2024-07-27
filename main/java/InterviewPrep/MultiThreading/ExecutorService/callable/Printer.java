package InterviewPrep.MultiThreading.ExecutorService.callable;

import java.util.concurrent.Callable;

public class Printer implements Callable<Integer> {
   static int num = 2;

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName()+" called this method with num :"+num);
        num -=1;
        return num;
    }
}
