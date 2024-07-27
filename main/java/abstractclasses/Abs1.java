package abstractclasses;

public abstract class Abs1 {
    int age;
    abstract void print();

    abstract void print2();

    public static void main(String[] args) {
        Abs1 a = new Class3();
        a.print();
        a.age = 10;
        a.print2();
    }
}
