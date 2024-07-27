package streams;

import javax.print.attribute.IntegerSyntax;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
    int[] ret(){
        List<Integer> listOfNumberss = Arrays.asList(1, 2, 3, 4);
        listOfNumberss.parallelStream().forEach(number ->
                System.out.println(number + " " + Thread.currentThread().getName())
        );

//     convertt and return list as array
        return listOfNumberss.stream().mapToInt(i -> i).toArray();

    }
    public static void main(String[] args) {
////        int[] arr = {1, 2, 3, 4, 5};
////        int num = Arrays.stream(arr).sum();
////        System.out.println(num);
////        List<Integer> list = Arrays.asList(1,2,3,4,6);
////        System.out.println(list.stream().mapToInt(i -> i).sum());
////
////        Stream<Integer> intStream = list.stream();
////        intStream.forEach(System.out::println);
////        Arrays.stream(arr).filter((i) -> i>i-1).forEach(System.out::print);
////
////        Stream<String> string1 = Stream.generate(() -> {return "abc";});
////        System.out.println(string1.count());
//
//        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);
//        listOfNumbers.stream().forEach(number ->
//                System.out.println(number + " " + Thread.currentThread().getName())
//        );
//        System.out.println();
//
//        List<Integer> listOfNumberss = Arrays.asList(1, 2, 3, 4);
//        int sum = listOfNumbers.parallelStream().reduce(0, Integer::sum)+5;
////        assertThat(sum).isNotEqualTo(15);
//        System.out.println(sum);

//        Stream.iterate("abc",(i)->i).forEach(System.out::println);


        //creation
        Stream<String> intstream = Stream.of("A","B","C");
        //sum
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.stream(arr).sum());
        //count
        System.out.println(Arrays.stream(arr).count());

        //filtering
        System.out.println(Arrays.stream(arr).anyMatch(i -> ((i&1)==0)));
        System.out.println(Arrays.stream(arr).allMatch(i -> ((i&1)==0)));
        System.out.println(Arrays.stream(arr).noneMatch(i -> ((i&1)==0)));
        System.out.println(Arrays.stream(arr).filter(i -> ((i&1)==0)).count());

        //reduce
        System.out.println(Arrays.stream(arr).reduce(10, (a,b) -> (a+b)));


    }
}
