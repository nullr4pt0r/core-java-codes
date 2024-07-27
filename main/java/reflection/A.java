package reflection;

public class A {
    private String name;
    public String admin;
//    int number;
//    protected double amount;
//    static int mobile;

    private A(){}

    static public void msg(){
        System.out.println("static method");
    }

    public void message(){
        System.out.println("instance method");
    }
}
