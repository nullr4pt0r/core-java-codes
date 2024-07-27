import java.io.InputStream;
import java.io.Reader;

public class POSTANDPREFIX {

    final int age = 11;
    private POSTANDPREFIX() {
//        age = 10;
    }

    public static void main(String[] args) {
        int[] arr = {12, 15, 16, 17, 19, 23};
        for (int i = arr.length - 1; i > 0; i--) {
            if (i % 3 != 0) {
                --i;
            }
            System.out.println(arr[i]);


        }
    }


    public static void main(int[] args) {
        System.out.println("Overloaded Integer array Main Method");
    }

    public static void main(char[] args) {
        System.out.println("Overloaded Character array Main Method");
    }

    public static void main(double[] args) {
        System.out.println("Overloaded Double array Main Method");
    }

    public static void main(float args) {
        System.out.println("Overloaded float Main Method");
    }
}
