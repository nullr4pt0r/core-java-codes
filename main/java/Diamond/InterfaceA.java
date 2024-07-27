package Diamond;

public interface InterfaceA {
    default void print(){
        System.out.println("Hello bro");
    }

    void now();
}
