package Djikstra_probelms.SleepingBarber;



public class Barber implements Runnable{
    int num;
    BarberShop bs;
    Barber(int n, BarberShop b){
        this.num = n;
        this.bs = b;
    }

    public void run(){
        while(true) {
            try {
                bs.cutHair();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
