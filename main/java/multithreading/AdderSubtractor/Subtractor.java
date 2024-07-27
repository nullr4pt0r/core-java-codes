package multithreading.AdderSubtractor;

public class Subtractor implements Runnable{
    Count x;

    Subtractor(Count x){
        this.x  = x;
    }

    public void run(){
        for(int i=0;i<=100000;i++){
            x.value--;
        }
    }
}
