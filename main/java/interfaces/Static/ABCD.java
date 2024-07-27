package interfaces.Static;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Stream;


public class ABCD {

    public static void main(String[] args) {
        List<String> list  = List.of("apple","mango","guava");
        Comparator<String> cmp = (s1, s2) ->  s2.compareTo(s1);
        Collections.sort(list, cmp);
        System.out.println(list);

        Stream<String> stream = list.stream();
        stream.parallel();
    }
}
