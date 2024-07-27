package interfaces.functional;

@FunctionalInterface
public interface FUNA {
    void msg();

    public default void msgHello(){
        System.out.println("Hello");
    }

    public static void msgHi(){
        System.out.println("Hi");
    }

}
