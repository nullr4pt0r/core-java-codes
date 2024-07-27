package statickeyword;

public class StaticExample {
    //static variable
    static String msg;
    int num=10;

    StaticExample(){
        msg = "Hey";
        num = 11;
    }
    static void printMessage(){
        System.out.println(msg);
    }

   static {
        msg = "modified in first block";
        printMessage();
    }

    void messgae(){
        System.out.println(msg);
        printMessage();

    }

    static void dis(StaticExample s){
        msg = "hey";
        printMessage();
    }

    {
        msg = "modified in second block";
        printMessage();
    }
    public static void main(String[] args) {
        StaticExample.printMessage();
        StaticExample se = new StaticExample();
        //instance of the class can access static variable of the class
        //Vice versa is not allowed
        //because static variable is common to class, any instance can access but the value gonna be same
        //where as instance variables differs, so it is not allowed.
        //but instanceobj.staticvariable is not good method
        System.out.println(msg);


       
    }
}
