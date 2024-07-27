package multithreading.AdderSubtractorLock;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    Count x;
    Lock lock;
    Subtractor(Count x,Lock lock){
        this.x = x;
        this.lock = lock;
    }

    public void run(){
        for(int i=0;i<=10;i++){
            lock.lock();
            x.value--;
            lock.unlock();
        }
    }

}

