package Class;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 10;
        s1.name = "initial name";

        Student s2 = new Student(s1);
        s2.name = "changed name";
//        swap(s1, s2);
        s2.display();
       s1.display();

    }

    private static void swap(Student s1, Student s2) {
        Student temp = s1;
        s1 = s2;
        s2 = temp;
    }


}