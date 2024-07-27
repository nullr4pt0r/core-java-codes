package InterviewPrep.MultiThreading.ExecutorService;

public class Client {
    //print numbers from 1-N
    public static void main(String[] args) {
        //using threads
        Thread thread = new Thread(new NumberPrinter(10),"thread1");
        thread.start();
        new Thread(new NumberPrinter(8),"thread2").start();
    }
}
