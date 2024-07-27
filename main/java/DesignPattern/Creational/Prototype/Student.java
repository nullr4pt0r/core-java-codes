package DesignPattern.Creational.Prototype;

public class Student implements Prototype<Student> {
    private String name;
    private String city;

    private String college;
    private double avgclassmarks;

    private String country = "United Kingdom";

    Student(Student s1){
        this.avgclassmarks = s1.getAvgclassmarks();
        this.college = s1.college;
        this.country = s1.country;
    }

    Student(){}

    @Override
    public Student clone() {
        return new Student(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public double getAvgclassmarks() {
        return avgclassmarks;
    }

    public void setAvgclassmarks(double avgclassmarks) {
        this.avgclassmarks = avgclassmarks;
    }


}
