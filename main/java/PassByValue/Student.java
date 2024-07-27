package PassByValue;

public class Student {
    int age;
    String name;

    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student(Student s1) {
        this.age = s1.age;
        this.name = s1.name;
    }

    void display() {
        System.out.println("My name is " + this.name + ". I am " + this.age + " years old");
    }

    public void changeAddress(Student s1) {
        System.out.println(s1);
        s1.name = "John";
        System.out.println(s1);
    }

    public static void main(String[] args) {
        Student s1 = new Student(10, "Ragu");
        Student s2 = new Student();
        System.out.println(s1);
        s1.display();
        s1.changeAddress(s1);
        s1.display();
        System.out.println(s1);
    }
}
