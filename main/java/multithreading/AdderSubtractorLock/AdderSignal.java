package multithreading.AdderSubtractorLock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class AdderSignal implements Runnable{
    Count x;
    Condition positiveSignal;
    Lock lock;
    AdderSignal(Count y, Lock lock, Condition condition){
        x=y;
        this.lock = lock;
        this.positiveSignal = condition;
    }
    @Override
    public void run(){
        for(int i=0;i<=10;i++){
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("=>AdderSignal acquired the lock");
            lock.lock();
            x.value++;
            System.out.println("=>AdderSignal increased the value");
            positiveSignal.signal();
            System.out.println("=>AdderSignal sends the signal");
            lock.unlock();
            System.out.println("=>AdderSignal released the lock");
        }

    }
}
