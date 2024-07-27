package threads.NumberPrinter;

public class NumberPrinter implements Runnable{
int number;
NumberPrinter(int num){
    this.number = num;
}
    @Override
    public void run() {
        System.out.println(number +" is printed by "+Thread.currentThread().getName()+" and priority is "+Thread.currentThread().getPriority()+" and state is  "+Thread.currentThread().getState());
    }
}
