package DesignPattern.Creational.Prototype;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAvgclassmarks(97.0);
        s1.setCollege("Harvard");
        s1.setName("John");
        s1.setCity("Chennai");
        //now create another obj
        //only name and city gonna change
        //but we need to do the setter from scratch. lets use Prototype pattern

        Student s2 = new Student();
        s2.setCollege(s1.getCollege());
        s2.setAvgclassmarks(s1.getAvgclassmarks());
        s2.setName("Kay");
        s2.setCity("Bombay");

        //but we are exposing the code or asking the client to do this. client may do error.
        //better we move this to object level - using copy constructor

       // after addition of copy constructor
        Student s3 = new Student(s1);
        s3.setCity("Kochi");
        s3.setName("Lop");

        //its good now. then what next ? we are creating the multiple student obj right ? using new keyword in client code
        //why not we just make an abstraction and reduce the client work
        //we have implemented an interface

        Student s4 = s1.clone();
        s4.setName("Weed");
        s4.setCity("Road");

        //what if we have multiple configured cases. like we have country common among all
        //we need to create another obj with this configuration and use it for cloning
        //better we create a configured one and make it available via registry


        //now we are using the central registry to work on
        fillRegistry();
        Student harvardStudent = Registry.get("harvard").clone();
        harvardStudent.setName("Johnny");
        harvardStudent.setCity("London");

        Student oxfordStudent = Registry.get("oxford").clone();
        oxfordStudent.setCity("Chennai");
        oxfordStudent.setName("Ragu");

        Prototype<Student> intelligent = Registry.get("intelligent").clone();
//        intelligent.setCollege("IITB");


        System.out.println("Debug");
    }

  static public  void fillRegistry(){
        Student student = new Student();
        student.setCollege("Harvard");
        student.setAvgclassmarks(94.6D);
        Registry.put("harvard", student);

        student = new Student();
        student.setCollege("Oxford");
        student.setAvgclassmarks(92.7D);
        Registry.put("oxford", student);

        IntelligentStudent stud = new IntelligentStudent();
        stud.setName("Intelligent Idiot");
        stud.setCity("India");
        stud.setAvgclassmarks(100D);
        stud.setIq(100);
        Registry.put("intelligent", stud);

    }
}
