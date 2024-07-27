package ExecutorService;

public class SubThread implements Runnable{

    public void run(){
        System.out.println("Thread name & state : "+Thread.currentThread().getName() +" "+Thread.currentThread().getState());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
