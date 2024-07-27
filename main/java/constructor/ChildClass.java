package constructor;

class SuperClass {
    int age;

    public SuperClass(){
        System.out.println("No-arg cons of super constructor");
    }

    public SuperClass(int num){
        age = num;
        System.out.println("Parameterized cons fo super constructor with age params");
    }

}

public class ChildClass extends SuperClass{
    String name;
    public ChildClass(){
        name = "John";
        System.out.println("No-arg of child class");
    }

    public ChildClass(String name){
        super();
      this.name = name;
        System.out.println("Parameterized cons of child class");
    }
    public ChildClass(int num, String name){
        super(num);
        this.name = name;
        System.out.println("Parameterized constructor call of child class");
    }

    public String toString(){
        return this.name+" "+this.age;
    }
    public static void main(String[] args) {
        ChildClass cl = new ChildClass();
        System.out.println(cl);
        //explicit super call
        cl = new ChildClass("kay");
        System.out.println(cl);
        cl=new ChildClass(22,"weed" );
        System.out.println(cl);
    }
}
