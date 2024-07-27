package multithreading.AdderSubtractorLock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Count{
    int value=0;
}

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        Lock lock = new ReentrantLock();
        Condition condition  = lock.newCondition();
        Adder adder = new Adder(count, lock );
        Subtractor subtractor = new Subtractor(count, lock );
       AdderSignal ads = new AdderSignal(count, lock, condition);
       SubtractorSignal sbs = new SubtractorSignal(count, lock, condition);
       SubtractorTryLock subtractorTryLock = new SubtractorTryLock(count, lock);
        Thread adderThread = new Thread(adder, "adder");
        Thread subtractorThread = new Thread(subtractor,"subtractor");

        Thread adsthread = new Thread(ads, "addrsignal");
        Thread subthread = new Thread(sbs, "subthread");

        Thread subTryLock = new Thread(subtractorTryLock, "subtrylock");

        Thread adderInterrupt = new Thread(new AdderLockInterruptibly(count, lock), "adderInterrupt");


//        adderThread.start();
//        subtractorThread.start();
        subthread.start();
        adsthread.start();

//        subTryLock.start();
//        adderInterrupt.start();

//        adderThread.join();
//        subtractorThread.join();
        adsthread.join();
        subthread.join();
//        subTryLock.join();
//        adderInterrupt.join();

        System.out.println("Count value : "+count.value);
    }
}
