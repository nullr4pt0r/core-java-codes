package Copy;

public class Student {
    int age;
    String name;

    public Student(){
    }
    public Student(Student s1) {
        this.age = s1.age;
        this.name = s1.name;
    }

    void display(){
        System.out.println("My name is " + this.name + ". I am "  + this.age + " years old");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 10;
        s1.name = "initial name";

        Student s2 = new Student(s1);
        s2.name = "changed name";

        s1.display();
        s2.display();
    }
}
