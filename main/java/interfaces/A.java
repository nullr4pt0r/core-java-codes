package interfaces;

public interface A {
    public static final int a = 10;
    void printNow();
    default void print() {
        System.out.println("a = " + a);
    }
}
