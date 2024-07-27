package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.*;

@FunctionalInterface
interface calc {
    //make this abstract method generic
    int add(int a, int b);

}
public class FunctionalContents {
    public static void main(String[] args) {
        //anonymous class
        calc cop = new calc() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        };
        System.out.println(cop.add(3,5));

        //lambda
        calc cal = (a, b) -> {return a+b;};
        System.out.println(cal.add(3,3));

        BiPredicate<String , String> bp = (a, b)->{return a.length() == b.length();};
        System.out.println(bp.test("jay","joe"));

        Predicate<String> pred = (x) -> {return x.contains("ee");};
        System.out.println(pred.test("weed"));

        Supplier<String> supp = () -> {return "Hello Bro !";};
        System.out.println(supp.get());

        Supplier<Integer> supp1 = () -> {return 1;};
        System.out.println(supp1.get());

        Consumer<Integer> consi = (x) -> {
            System.out.println("The given number is "+x);
        };
        consi.accept(15);

        BiConsumer<Integer ,String> biconsi= (x,y) -> {
            System.out.println("Name is "+y+" age is "+x);
        };
        biconsi.accept(15,"Jay");

        UnaryOperator<Integer> u = (x) -> x+x;
        System.out.println(u.apply(10));

        BinaryOperator<Integer> bu = (x,y) -> x*y;
        System.out.println(bu.apply(10,4));

        Function<Integer, Integer> func = (x) -> x*x;
        System.out.println(func.apply(Integer.MAX_VALUE));

        BiFunction<Integer, Integer, Double> bifucn = (x,y) -> (double) (x^y);
        System.out.println(bifucn.apply(Integer.MAX_VALUE, Integer.MIN_VALUE));

        //Iterating the collection
        List<Integer> list = Arrays.asList(4,15,3,9,0);
        Collections.sort(list, (x,y) -> {
            return y.compareTo(x);
        });
        list.forEach(x->System.out.print(x+" "));



    }
}
