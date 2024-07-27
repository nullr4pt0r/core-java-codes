package threads.HelloWorld;

public class Main {
    public static void main(String[] args) {
        System.out.println("Current thread : "+Thread.currentThread().getName());
        Thread thread = new Thread(new HelloWorldPrinter());

        thread.start();
  
        System.out.println("Current thread : "+Thread.currentThread().getName());
//        thread.stop();
    }
}
