package constructor;

public class DefaultConstructor {
    int num = 10;

    public static void main(String[] args) {
        DefaultConstructor df = new DefaultConstructor();
        //new keyword calls constructor -  here default constructor
        System.out.println(df.num);
    }
}
