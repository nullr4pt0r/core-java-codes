package Djikstra_probelms.SleepingBarber;

public class Customer implements  Runnable{
    int id;
    BarberShop bs;
    Customer(int n, BarberShop b){
        this.id = n;
        this.bs = b;

    }

    @Override
    public void run() {
        bs.addCustomer(this);
    }
}
