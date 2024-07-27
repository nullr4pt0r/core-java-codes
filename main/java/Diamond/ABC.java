package Diamond;

public class ABC implements  InterfaceB, InterfaceC{


    public void now() {
        System.out.println("Hello now");
    }

    public static void main(String[] args) {
        new ABC().now();
    }
}
