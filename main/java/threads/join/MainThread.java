package threads.join;

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new SubThread(),"t1");
        Thread t2 = new Thread(new SubThread(),"t2");
        Thread t3 = new Thread(new SubThread(), "t3");
        t1.start();
        t3.start();
       System.out.println("Main thread state before t1 join : "+Thread.currentThread().getState());
        System.out.println("Thread 1 state : "+t1.getState());
       System.out.println("Thread 2 state : "+t2.getState());
        System.out.println("Thread 3 state : "+t3.getState());
        t1.join(10000);
        System.out.println("Thread 2 state : "+t2.getState());
        System.out.println("Thread 3 state : "+t3.getState());
        System.out.println("Thread 1 state : "+t1.getState());
        t2.start();
        System.out.println("Main thread state after t1 join: "+Thread.currentThread().getState());
        System.out.println("Thread 2 state : "+t2.getState());
        System.out.println("Thread 3 state : "+t3.getState());
        System.out.println("Thread 1 state : "+t1.getState());
        System.out.println("Main thread state before t2 join : "+Thread.currentThread().getState());
        t2.join(30000);
        System.out.println("Main thread state : "+Thread.currentThread().getState());
        System.out.println("Thread 2 state : "+t2.getState());
    }
}
