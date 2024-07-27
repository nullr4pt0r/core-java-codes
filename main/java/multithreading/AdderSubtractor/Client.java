package multithreading.AdderSubtractor;

class Count{
    int value=0;
}

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        Thread adderThread = new Thread(adder, "adder");
        Thread subtractorThread = new Thread(subtractor,"subtractor");
        adderThread.start();
        subtractorThread.start();
        adderThread.join();
        subtractorThread.join();
        System.out.println("Count value : "+count.value);
    }
}
