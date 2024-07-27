package InterviewPrep.MultiThreading.ExecutorService;

public class NumberPrinter implements Runnable{
    int num ;
    NumberPrinter(int n){
        num = n;
    }
    public void run(){
        for(int i=1;i<=num;i++){
            System.out.println(Thread.currentThread().getName()+" Number is : "+i);
        }
    }
}
