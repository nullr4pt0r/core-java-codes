package Final;

class dog{
    int age = 11;

}
public class FinalKey {
    final dog pup;
    final String name;
static int num = 10;
    FinalKey(){
        pup = new dog();
        name = "john";
    }

    public static void main(String[] args) {
        FinalKey key = new FinalKey();
        System.out.println(key.pup.age);
        key.pup.age = 100;
        num  = 11;
        System.out.println(key.pup.age);
    }
}
