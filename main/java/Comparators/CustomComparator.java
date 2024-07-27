package Comparators;

import java.text.CollationKey;
import java.util.*;

public class CustomComparator {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(10);
        list.add(10);
        list.add(5);
        list.add(22);
        list.add(14);
        list.add(23);
        System.out.println("Original list : "+ Arrays.toString(list.toArray()));
        Collections.sort(list);
        System.out.println("Sorted List : "+Arrays.toString(list.toArray()));

        //sort the array in custom order
        //sort by last digit

        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
               if(i%10 > j%10){
                   return 1;
               }
                return -1;
            }
        };

        Collections.sort(list, com);
        System.out.println("Sorted based on last digit : "+Arrays.toString(list.toArray()) );

    }
}
