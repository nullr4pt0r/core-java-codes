package constructor;

public class ConstructorTypes {
    int num = 10;

    public ConstructorTypes(){
        System.out.println("No - args consturctor");
    }

    public ConstructorTypes(int num){
        this.num = num;
        System.out.println("Parameterized constructor called");
    }

    public static void main(String[] args) {
        ConstructorTypes ct = new ConstructorTypes();
        System.out.println(ct.num);
        ct = new ConstructorTypes(11);
        System.out.println(ct.num);
    }
}
