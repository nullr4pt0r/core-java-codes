package DesignPattern.Creational.Builder;

public class Client {
    public static void main(String[] args) {
        //we need to do valiudate before the Stduent creations

        //we used a helper class
        //but why not we
//        Helper h = new Helper("john",8);
        //if we need to create student, get bbuilder first
        Student.Helper h = Student.getHelper();
        h.setAge(100);
        h.setName("John");

//        Student s = new Student(h);
        //instead of this , new Student (h). better we deal via builder.
//        Student s = h.build();


        //we can do optimization now.
        //still we can create student objects now. which is not allowed.
//        Student ss = new Student();
        Student ss = h.build();
        //or
        Student sss = Student.getHelper().setAge(10).setName("john").build();
        System.out.println("Debug");
    }
}
