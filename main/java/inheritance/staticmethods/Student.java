package inheritance.staticmethods;

public class Student extends Person{
    String name = "student";
    String college = "Stanford";

    public static void staticMethod() {
        System.out.println("Student: staticMethod");
    }

    public void instanceMethod() {
        System.out.println("Student: instanceMethod");
    }
}
