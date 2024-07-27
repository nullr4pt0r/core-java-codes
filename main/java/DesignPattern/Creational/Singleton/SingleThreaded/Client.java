package DesignPattern.Creational.Singleton.SingleThreaded;

import java.time.Instant;

public class Client {
    public static void main(String[] args) throws InterruptedException {
       Thread th1 = new Thread(() -> System.out.println("TIme is : "+ Instant.now() +" "+System.identityHashCode(Data.getInstance())),"t1");
       Thread th2 = new Thread(() -> System.out.println("TIme is : "+ Instant.now() +" "+System.identityHashCode(Data.getInstance())),"t2");
        th1.start();
        th2.start();
       new Thread(() -> System.out.println("TIme is : "+ Instant.now() +" "+System.identityHashCode(Data.getInstance())),"t3").start();
        th1.join();
        new Thread(() -> System.out.println("TIme is : "+ Instant.now() +" "+System.identityHashCode(Data.getInstance())),"t3").start();



    }
}
