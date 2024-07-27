package multithreading.AdderSubtractorSyunchronized;

public class Adder implements Runnable {
   static Count x;
    Adder(Count y){
        x=y;
    }
    @Override
    public void run(){
        synchronized (x){
            for(int i=0;i<=100000;i++){
                x.value++;
            }

        }


    }
}
