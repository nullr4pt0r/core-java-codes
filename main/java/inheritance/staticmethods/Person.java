package inheritance.staticmethods;

public class Person {
    String name = "person";
    int age;
    public static void staticMethod() {
        System.out.println("Person: staticMethod");
    }

    public void instanceMethod() {
        System.out.println("Person: instanceMethod");
    }
}
