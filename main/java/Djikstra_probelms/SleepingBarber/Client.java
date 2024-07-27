package Djikstra_probelms.SleepingBarber;

import java.util.LinkedList;
import java.util.Queue;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Queue<Customer> queue = new LinkedList<>();
        BarberShop bs = new BarberShop(1,5,queue);

        Barber b = new Barber(1,bs);
        Thread th = new Thread(b);
        th.start();
        for(int i=1;i<=10;i++){
            th = new Thread(new Customer(i, bs));
            th.start();
        }

//        System.out.println("Program finished");
    }
}
