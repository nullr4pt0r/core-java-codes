package multithreading;

public class SynchronizedExample implements Runnable {
     Integer count = 0;
     String lock = "lock";

    public void run(){
        incrementCount();
        doSomething();
    }
    public void incrementCount() {
        synchronized (count) {
            for(int i=0;i<10;i++) {
                System.out.println("Locked content : " + count + ", Identity hash code: " + System.identityHashCode(count));

                count++;
            }
        }
    }

    public void doSomething() {
        synchronized (lock) {
            System.out.println("Locked content : " + lock + ", Identity hash code: " + System.identityHashCode(lock));

            lock = lock+1;
        }
    }

}