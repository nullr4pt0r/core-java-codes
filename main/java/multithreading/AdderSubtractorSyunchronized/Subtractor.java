package multithreading.AdderSubtractorSyunchronized;

public class Subtractor implements Runnable{
   static Count x;

    Subtractor(Count x){
        this.x  = x;
    }

    public void run(){
        for(int i=0;i<=100000;i++){
            synchronized (x) {
                x.value--;
            }
        }
    }
}
