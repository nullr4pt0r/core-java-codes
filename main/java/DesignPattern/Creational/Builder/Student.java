package DesignPattern.Creational.Builder;

public class Student {
    String name;
    int age;

    public Student(){}
    private Student(String name, int age){

        this.name = name;
        this.age = age;
    }

    private Student (Helper h){
        if(h.age<10){
            throw new RuntimeException("Age is below 10");
        }
        this.name = h.name;
        this.age = h.age;

    }

    public static Helper getHelper(){
        return new Helper();
    }

    public static class Helper {
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

        public Helper setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Helper setAge(int age) {
            this.age = age;
            return this;
        }

        public Student build(){
            if(this.age<10){
                throw new RuntimeException("Age is below 10");
            }
            return new Student(this);
        }
    }

}
