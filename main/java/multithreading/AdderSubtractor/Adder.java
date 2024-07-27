package multithreading.AdderSubtractor;

public class Adder implements Runnable {
    Count x;
    Adder(Count y){
        x=y;
    }
    @Override
    public void run(){
        for(int i=0;i<=100000;i++){
            x.value++;
        }

    }
}
