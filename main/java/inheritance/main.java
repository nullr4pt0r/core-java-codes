package inheritance;

public class main {
    public static void main(String[] args) {
//          B b = new C("Google");
//            b.display();
//
//            A a = new C();
//            ((C) a).abcd("Hello");

                A a = new C();
        System.out.println(a.name);
        a.display();
        a.show();

        C c = new C();
        System.out.println(c.name);
        c.display();
        c.show();

    }
}
