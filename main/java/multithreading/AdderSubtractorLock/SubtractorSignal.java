package multithreading.AdderSubtractorLock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class SubtractorSignal implements Runnable{
    Count x;
    Lock lock;
    Condition positiveSignal;

    SubtractorSignal(Count x, Lock lock, Condition condition){
        this.x = x;
        this.lock = lock;
        positiveSignal = condition;
    }


    public void run(){
        for(int i=0;i<=10;i++){
            lock.lock();
            System.out.println("SubtractorSignal acquired the lock");
            try {
                while (x.value <= 0) {
                    System.out.println("SubtractorSignal is waiting for a signal");
                    positiveSignal.await();
                    System.out.println("SubtractorSignal received a signal");
                }
                x.value--;
            }
            catch (InterruptedException e) {
                System.out.println("Interrupted");
            }finally {
                lock.unlock();
                System.out.println("SubtractorSignal released the lock");
            }

        }
    }
}
