package Class;

public class Student {
    int age;
    String name;

    public Student(){
    }
    public Student(Student s1){
        this.age = s1.age;
        this.name = s1.name;
    }
    void display(){
        System.out.println("My name is " + this.name + ". I am "  + this.age + " years old");
    }

    void sayHello(String name){
        System.out.println(this.name + " says hello to " + name);
    }
}