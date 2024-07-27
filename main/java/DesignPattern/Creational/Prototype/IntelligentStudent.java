package DesignPattern.Creational.Prototype;

public class IntelligentStudent extends Student{
    private int iq;

    public void setIq(int iq) {
        this.iq = iq;
    }

    IntelligentStudent(){}

    private IntelligentStudent(IntelligentStudent student){
        super(student);
        this.setName(student.getName());
        this.setCity(student.getCity());
        this.iq = student.iq;
    }

    @Override
    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
    }
}
