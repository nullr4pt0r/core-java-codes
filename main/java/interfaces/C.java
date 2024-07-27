package interfaces;

import java.io.Serializable;
import java.time.Instant;

//multiple inheritance
public class C implements B,A
{


    public static void main(String[] args) {
        C c = new C();
        c.print();



    }

    @Override
    public void printNow() {
        System.out.println("current time : "+ Instant.now());
    }

}
