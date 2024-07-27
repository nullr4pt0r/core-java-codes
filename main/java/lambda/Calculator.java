package lambda;

import java.util.function.BinaryOperator;

//using lambda expressions
public class Calculator {
    int add(int a, int b){
        return a+b;
    }
    int sub(int a, int b){
        return a-b;
    }

    public static void main(String[] args) {
        Calculator cop = new Calculator();

        BinaryOperator<Integer> add = (x,y)->{return cop.add(x,y);};
       BinaryOperator<Integer> sub = (x,y) -> {return cop.sub(x,y);};

        System.out.println(add.apply(5,3));
        System.out.println(sub.apply(5,3));

     }
}
