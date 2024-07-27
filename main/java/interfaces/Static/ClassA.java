package interfaces.Static;

public class ClassA implements interface1{

//    public boolean isNull(String str) {
//        System.out.println("Impl Null Check");
//
//        return str == null ? true : false;
//    }

    public static void main(String args[]){
        ClassA obj = new ClassA();
        obj.print("");
        interface1.printt();
        obj.isNull("abc");
    }
}
