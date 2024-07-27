package InterviewPrep.ComparatorComparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Man implements Comparable<Man>{
    int age;
    Man(int num){
        age = num;
    }

    @Override
    public int compareTo(Man o) {
        return Integer.compare(this.age,o.age);
    }

    public String toString(){
        return "Age is : "+this.age;
    }
}
public class Comp {
    public static void main(String[] args) {

        List<Man> manList = new ArrayList<>(Arrays.asList(new Man(55), new Man(23), new Man(10), new Man(33)));
//         Collections.sort(manList);
        manList.sort((x, y) -> Integer.compare(y.age, x.age));

        manList.forEach(System.out::println);
    }
}
