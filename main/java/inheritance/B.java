package inheritance;

public class B extends A{
    String college;

    public B() {
        System.out.println("B's no-arg constructor");
    }

    public B(String College){
        super("John", 20);
        this.college = College;
        System.out.println("B's parameterized constructor");
    }

    static void show() {
        System.out.println("B's show method");
    }
}

