package synchronized_programs;

public class Count implements Runnable{
    private int count;

    public void run(){
        incValue(10);
        getValue();
        decvalue(20);
        getValue();
    }

    public Count(int number){
        count = number;
    }

    public synchronized void incValue(int offset){
        System.out.println("incvalue by "+Thread.currentThread().getName());
        count += offset;
    }

    public synchronized void getValue(){
        System.out.println(count +" by "+Thread.currentThread().getName());
    }

    public synchronized void decvalue(int offset){

        System.out.println("decvalue by "+Thread.currentThread().getName());
        count -= offset;
    }


    public static void main(String[] args) {
        Thread t1 = new Thread(new Count(10),"t1");
        Thread t2 = new Thread(new Count(20),"t2");
        Thread t3 = new Thread(() -> {System.out.println("Thread 3 is running");});

        t1.start();
        t2.start();
        t3.start();



    }
}
