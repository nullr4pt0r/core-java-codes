package interfaces.Extends;

public class C implements I{
    public void fun1(){
        System.out.println("fun1");
    }
    public void fun2(){
        System.out.println("fun2");
    }
    public void fun(){

        System.out.println("fun");
    }
    public static void main(String[] args){
        C c = new C();
        c.fun1();
        c.fun2();
        c.fun();
    }
}

