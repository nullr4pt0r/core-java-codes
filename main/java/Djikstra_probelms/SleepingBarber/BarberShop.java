package Djikstra_probelms.SleepingBarber;

import java.util.LinkedList;
import java.util.Queue;

public class BarberShop {

    int availabeBarber;
    int seat;

    int num = 0;

    //critical section
    Queue<Customer> queue;

    BarberShop(int barbercount, int seat, Queue<Customer> queue){
        this.queue = queue;
        this.seat = seat;
        this.availabeBarber = barbercount;
    }


    //task for barber
    void cutHair() throws InterruptedException {
        synchronized (queue) {
            while (queue.isEmpty()) {
                //barber sleeps
                queue.wait();
                System.out.println("barber sleeping");
            }
            //barber wakes
            System.out.println("Customer enters and wakes");
            Customer customer = queue.poll();
            availabeBarber--;
            num++;
            //do haricut
            Thread.sleep(1000);
            System.out.println("customer " + customer.id + " is enjoying haircut ");
            //after some times
            System.out.println("Haircut done for customer " + customer.id);

            availabeBarber++;

        }

    }

    //task for customer
     void addCustomer(Customer customer){
         synchronized(queue) {
             if (queue.size() == seat) {
                 System.out.println("No seat, customer gone");
             } else if (availabeBarber > 0) {
                 System.out.println(customer.id + " Wait in queue");
                 queue.offer(customer);
                 queue.notify();
             } else {
                 queue.offer(customer);
                 System.out.println("All barber(s) are busy so " +
                         customer.id +
                         " takes a chair in the waiting room");
                 if (queue.size() == 1) {
                     queue.notify();
                 }
             }
         }

    }
}
