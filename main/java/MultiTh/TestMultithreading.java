package MultiTh;

 class SharedResource {
    private int counter = 0;

    synchronized void increment() {
        counter++;
    }

    synchronized int getCounter() {
        return counter;
    }
}

class MyIncrementThread extends Thread {
    private SharedResource sharedResource;

    MyIncrementThread(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            sharedResource.increment();
        }
    }
}

public class TestMultithreading {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        MyIncrementThread thread1 = new MyIncrementThread(sharedResource);
        MyIncrementThread thread2 = new MyIncrementThread(sharedResource);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Counter: " + sharedResource.getCounter());
    }
}
