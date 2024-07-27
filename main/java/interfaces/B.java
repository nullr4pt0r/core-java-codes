package interfaces;

public interface B extends A {
       final int a = 10;
     static final int b = 20;

    default void print(){
        System.out.println("b = " + b);
    }
    default void printTwice() {
        print();
        print();
    }
}
