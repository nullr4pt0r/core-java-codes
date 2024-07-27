package abstractclasses;

public abstract class Abs2 extends Abs1 {

    Abs2(){
        System.out.println("Hello from Abs2");
        name = "Jhn";
    }
    String name;

    abstract void print();
}
