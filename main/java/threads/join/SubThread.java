package threads.join;

public class SubThread implements Runnable{
    @Override
    public void run(){
        System.out.println("SubThread name : "+Thread.currentThread().getName()+" SubThread state : "+Thread.currentThread().getState());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("SubThread name : "+Thread.currentThread().getName()+" SubThread state : "+Thread.currentThread().getState());
    }
}
