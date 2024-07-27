package Djikstra_probelms.barberProblem;

public class SleepingBarberProblem {
    //barber
    //customer
    //barbershop
class BarberShop{

    void cutHair(){

    }

    void enterShop(){

    }
    }
    class Barber implements Runnable{
        int id;
        BarberShop bp;

       public Barber(int id, BarberShop bp){
           this.id = id;
           this.bp = bp;
       }

       @Override
       public void run(){

           cutHair();
       }
        //cut hair
        void cutHair(){
           while(true){
               this.bp.cutHair();
           }

        }
    }

    class Customer implements  Runnable{
        int id;

        BarberShop bp = new BarberShop();

        public Customer(int id, BarberShop bp){
            this.id = id;
            this.bp = bp;
        }

       public void run(){
            enterShop();
        }
        void enterShop(){
            this.bp.enterShop();
        }
    }
}
