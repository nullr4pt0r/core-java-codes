package InterviewPrep.general;

import java.util.Collection;
import java.util.Collections;

class Man{
    int age;
    Man(){}
    Man(int num){
        age = num;
    }
}
public class Cons extends Man {

    Cons(){
        super(10);
    }
    void run(){
        new Man();

    }

//    Collections
//    Collection

}
