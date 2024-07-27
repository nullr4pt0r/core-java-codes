package inheritance;

public class A {
    String name;
    int age;
    public A(){
        System.out.println("A's no-arg constructor");
    }
    public A(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("A's parameterized constructor");
    }

    public void display() {
        System.out.println("A's display method");
    }

    static void show() {
        System.out.println("A's show method");
    }
}
