package objects;

class Test{
    int a;
    int b;
}

class Test2 implements  Cloneable{
    int x;
    int y;
    Test t2 = new Test();
    public Object clone() throws CloneNotSupportedException {

        return super.clone();
    }
}

public class ShallowClone {

    public static void main(String[] args) throws CloneNotSupportedException {
        Test2 t1 = new Test2();
        t1.t2.a = 10;
        t1.t2.b = 20;
        t1.x = 30;
        t1.y = 40;

        System.out.println("Test  : "+t1.t2.a+","+t1.t2.b+" Test 2 : "+t1.x+","+t1.y);

        //clone
        Test2 t2 = (Test2)t1.clone();
        t2.t2.a = 100;
        System.out.println("After Cloning");
        System.out.println("Test of t2  : "+t2.t2.a+","+t2.t2.b+" Test 2 of t2: "+t2.x+","+t2.y);
        System.out.println("Test of t1 : "+t1.t2.a+","+t1.t2.b+" Test2 of t1 : "+t1.x+","+t1.y);
        System.out.println("Both t2.t2 and t1.t2 shares same address , so both are affected");
        System.out.println("HashCode of t1.t2 : "+t1.t2.hashCode());
        System.out.println("HashCode of t2.t2 : "+t2.t2.hashCode());
    }


}
