package interfaces.marker;

public class MainClass {
    public static void main(String[] args) {
        Class1 c1 = new Class1();
        Class2 c2 = new Class2();
       handleObj(c1);
         handleObj(c2);
    }
    public static void handleObj(Object obj){
        if(obj instanceof MyMarkerInterface){
            System.out.println("Object is an instance of MyMarkerInterface");
        }
        else{
            System.out.println("Object is not an instance of MyMarkerInterface");
        }
    }
}
