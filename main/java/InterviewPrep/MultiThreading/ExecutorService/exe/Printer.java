package InterviewPrep.MultiThreading.ExecutorService.exe;

public class Printer implements Runnable{
    public void run(){
        for(int i=1;i<50;i++)
            System.out.println(Thread.currentThread().getName()+" prints");
    }
}
