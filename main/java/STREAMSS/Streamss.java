package STREAMSS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamss {
    public static void main(String[] args) {
        List<Integer> intstream = Arrays.asList(1,2,3,4,5);
        List<Integer> cuberdNumbers  = intstream.stream().map(i -> i*i*i).collect(Collectors.toList());
        System.out.println(cuberdNumbers);

//
//        System.out.println(intstream.stream().mapToInt(i -> i).sum());
//
//        System.out.println(intstream.stream().filter(i -> ((i&1) == 0)).collect(Collectors.toList()));
//        System.out.println(intstream.stream().filter(i -> ((i&1) == 0)).findAny().orElse(null));
//        System.out.println(intstream.stream().map(i -> (i&1) == 0).collect(Collectors.toList()));


        List<List<String>> studentsSubjects = new ArrayList<>();

        studentsSubjects.add(Arrays.asList("Alice", "Math", "Science", "History"));
        studentsSubjects.add(Arrays.asList("Bob", "Math", "English", "Geography"));
        studentsSubjects.add(Arrays.asList("Charlie", "Science", "Math", "Art"));
        studentsSubjects.add(Arrays.asList("David", "History", "Math", "English"));

     List<String> str =   studentsSubjects.stream().flatMap(Collection::stream).toList();
     Stream.of(str).forEach(System.out::println);



//
//                double tmp = 8.02;
//                double abc = 8.02;
//        System.out.println(tmp<abc);


    }
}
