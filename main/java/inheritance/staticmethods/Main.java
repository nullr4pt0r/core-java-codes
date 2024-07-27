package inheritance.staticmethods;

public class Main {
    public static void main(String[] args) {
       Person p = new Person();
         p.staticMethod();
            p.instanceMethod();
        System.out.println("Name: " + p.name);

Student s = new Student();
s.staticMethod();
s.instanceMethod();
        System.out.println("Name: " + s.name);

     Person a = new Student();
        a.staticMethod();
        a.instanceMethod();
        System.out.println("Name: " + a.name);
    }
}
