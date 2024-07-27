package Djikstra_probelms.barberProblem;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class BarberShop {

    Barbers barbers;

    Queue<Thread> waitingQueue = new ConcurrentLinkedQueue<Thread>();
    int seats;

    //set the seat count
    BarberShop(int count, Barbers b){
        this.seats = count;
        this.barbers = b;
    }

    //add customer to the queue
    void addCustomer(Thread customer){
        if(waitingQueue.size() < seats){
            waitingQueue.add(customer);
            System.out.println(customer.getName()+" is waiting");
        }else{
            System.out.println("No seats available for "+customer.getName());
        }
    }

    //get the next customer from the queue
    Thread nextCustomer(){
        return waitingQueue.poll();
    }

    //get the seat count
    int getSeats(){
        return seats;
    }


}
