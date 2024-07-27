package InterviewPrep;

public class StaticOverriding {
    public static void main(String[] args) {
        Parent p = new Child();
        p.print();
        Child c =  new Child();
        c.print();
    }

}

class Parent{
    static void print(){
        System.out.println("Static from parent");
    }
}

class Child extends Parent{
    static void print(){
        System.out.println("Static from child");
    }

    void msg() throws Exception {
        try{

        }
        catch (Exception e){
            throw new Exception(e.getCause());
        }
    }
}
