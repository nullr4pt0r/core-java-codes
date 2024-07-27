package Djikstra_probelms.barberProblem;

public class Barber implements  Runnable{

    public void run(){

    }
    void sleep(Thread thread){
        try {
            thread.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println( Thread.currentThread()+" is Sleeping");

    }
}
