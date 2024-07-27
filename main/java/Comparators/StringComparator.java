package Comparators;

import java.util.Arrays;
import java.util.Comparator;

public class StringComparator {
    public static void main(String[] args) {
        String[] names = {"John", "Kay", "Weed", "Raguvaran", "Joshi"};
        System.out.println("Original array : "+ Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("Sorted array based on alphabets : "+Arrays.toString(names));
        //sort the array in custom order

        Comparator<String> com = new Comparator<String>() {
            @Override
            public int compare(String i, String j) {
                if(i.length() > j.length()){
                    return 1;
                }
                return -1;
            }
        };

        Arrays.sort(names, com);
        System.out.println("Sorted based on String length : "+Arrays.toString(names));


    }
}
