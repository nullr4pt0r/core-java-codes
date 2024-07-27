package objects;

class Testa{
    int a;
    int b;
}

class Testb implements  Cloneable{
    int x;
    int y;
    Testa aa = new Testa();
    public Object clone() throws CloneNotSupportedException {
        //assign shallow copy to new reference
        Testb t = (Testb) super.clone();
        //deep copy
        t.aa = new Testa();
        t.aa.a = aa.a;
        t.aa.b = aa.b;
        //assign values
//        Testa t3 = new Testa();
//        t3.a = t2.a;
//        t3.b = t2.b;

        return t;
    }
}

public class DeepClone {

    public static void main(String[] args) throws CloneNotSupportedException {
        Testb t1 = new Testb();
        t1.aa.a = 10;
        t1.aa.b = 20;
        t1.x = 30;
        t1.y = 40;

        System.out.println("Test  : "+t1.aa.a+","+t1.aa.b+" Test 2 : "+t1.x+","+t1.y);

        //deep clone
        Testb t2 = (Testb)t1.clone();
        t2.aa.a =100;
        System.out.println("After Cloning");
        System.out.println("Test of t2  : "+t2.aa.a+","+t2.aa.b+" Test 2 of t2: "+t2.x+","+t2.y);
        System.out.println("Test of t1 : "+t1.aa.a+","+t1.aa.b+" Test2 of t1 : "+t1.x+","+t1.y);
//        System.out.println("Both t2.t2 and t1.t2 shares same address , so both are affected");
        System.out.println("HashCode of t1.t2 : "+t1.aa.hashCode());
        System.out.println("HashCode of t2.t2 : "+t2.aa.hashCode());
    }

}
