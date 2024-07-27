package multithreading;

public class Clinet {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new SynchronizedExample(),"t1");
        Thread t2 = new Thread(new SynchronizedExample(),"t2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(new SynchronizedExample().count);
    }
}
