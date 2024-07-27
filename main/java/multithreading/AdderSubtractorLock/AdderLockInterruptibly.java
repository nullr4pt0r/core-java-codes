package multithreading.AdderSubtractorLock;

import java.util.concurrent.locks.Lock;

public class AdderLockInterruptibly implements Runnable{
    Count x;

    Lock lock;
    AdderLockInterruptibly(Count y, Lock lock){
        x=y;
        this.lock = lock;
    }
    @Override
    public void run(){
        for(int i=0;i<=10;i++){
            try{
                lock.lockInterruptibly();
                x.value++;
            }catch (InterruptedException e){
                System.out.println("InterruptedException Thrown");
            }
            finally {
                lock.unlock();
//                can throw IllegalMonitorException
            }
//            lock.lock();


        }

    }
}
