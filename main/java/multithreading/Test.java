package multithreading;

class A{
    static void print(){
        System.out.println("Print from static");
    }

    void printMsg(){
        System.out.println("Print from instance method");
    }

    void justPrint(){
        System.out.println("Just print");
    }
}
public class Test {
    A a = new A();
    A b = new A();


}
