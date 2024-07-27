package multithreading.AdderSubtractorLock;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
    Count x;

    Lock lock;
    Adder(Count y, Lock lock){
        x=y;
        this.lock = lock;
    }
    @Override
    public void run(){
        for(int i=0;i<=10;i++){
            lock.lock();
            x.value++;
            lock.unlock();
        }

    }
}
