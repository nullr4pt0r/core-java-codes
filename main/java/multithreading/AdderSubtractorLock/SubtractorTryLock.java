package multithreading.AdderSubtractorLock;

import java.util.concurrent.locks.Lock;

public class SubtractorTryLock implements Runnable{
    Count x;
    Lock lock;
    SubtractorTryLock(Count x,Lock lock){
        this.x = x;
        this.lock = lock;
    }

    public void run(){
        for(int i=0;i<=10;i++){
            if(lock.tryLock()) {
                try {
                    x.value--;
                } finally {
                    lock.unlock();
                }
            }else{
                System.out.println("Lock is not available");
            }
        }
    }
}