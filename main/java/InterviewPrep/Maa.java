package InterviewPrep;



 class Foo {
    public Foo() {
        doSomething();
    }

    public void doSomething() {
        System.out.println("do something acceptable");
    }
}

 class Bar extends Foo {
    public void doSomething() {
        System.out.println("yolo");
    }
}

public class Maa {
    public static void main(String[] args) {
        Bar bar  = new Bar();
        int a = 0, b = 0;
        System.out.println(a+" "+b);

    }
}