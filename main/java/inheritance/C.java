package inheritance;

public class C extends B{
    String company;
    String name = "jo";

    public C() {
        System.out.println("C's no-arg constructor");
    }

    public C(String company) {
        super("Stanford");
        this.company = company;
        System.out.println("C's parameterized constructor");
    }

    public void display() {
        System.out.println("C's display method");
    }

    public void abcd(String s) {
        System.out.println("C's display method with string parameter");
    }

    static void show() {
        System.out.println("C's show method");
    }

}
