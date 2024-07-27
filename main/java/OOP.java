import java.util.Arrays;
import java.util.List;

public class OOP {
    public static void main(String[] args) {

            Integer[] arr = {1,2,3};
            List<Integer> list = Arrays.asList(arr);
            List<Integer> list2 = List.of(arr);

            System.out.println(list+" "+Arrays.toString(arr)+" "+list2);
            arr[0] = 33;
            System.out.println(list+" "+Arrays.toString(arr)+" "+list2);

        short x = 10;
        x = (short) (x * 5);
        System.out.print(x);

        int Integer = 24;
        char String  = 'I';
        System.out.print(Integer);
        System.out.print(String);

        int[]  xx = {120, 200, 0200};
        for(int i = 0; i < xx.length; i++){
            System.out.print(xx[i] + " ");
        }

        if(1 + 1 + 1 + 1 + 1 == 5){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }

    }
}
