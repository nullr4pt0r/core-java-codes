package DesignPattern.Creational.Builder;

public class Helper {
    String name;
    int age;

    public Helper(){}
    public Helper(String name, int age) {

        this.name = name;
        this.age = age;

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public Student build(){
//        if(this.age<10){
//            throw new RuntimeException("Age is below 10");
//        }
//        return new Student(this);
//    }
}
