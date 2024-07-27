package interfaces.Static;

public interface interface1 {
    default void print(String str) {
        if (!isNull(str))
            System.out.println("MyData Print::" + str);
    }
static void printt(){
    System.out.println("Static method in interface");
}
    default boolean isNull(String str) {
        System.out.println("Interface Null Check");

        return str == null ? true : "".equals(str) ? true : false;
    }

}
