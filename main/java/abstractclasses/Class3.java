package abstractclasses;

import java.util.PriorityQueue;

public class Class3 extends  Abs2{
    public void print() {
        System.out.println("Hello from C");
    }

    @Override
    void print2() {
        System.out.println("Hello from print2 in C");
    }

    public static void main(String[] args) {
        Abs2 abs = new Class3();
        abs.print();
        Class3 c = new Class3();
        c.print();
        c.age = 10;
        c.name = "John";

        PriorityQueue<Integer> pq = new PriorityQueue<>();
    }
}
