package SOLIDPRINCIPLES.ClassExplosion;

import java.util.ArrayList;
import java.util.List;

public class Mainmethod {
    public static void main(String[] args) {
        Bird b = new Crow();
        b.breed = "Indian";
        b.color = "black";
        System.out.println("Crow");
        ((Crow)b).fly();
        b.walk();

      Bird  c = new Eagle();
        c.breed = "Indian";
        c.color = "salmon";
        System.out.println("Eagle");
        ((Eagle)c).fly();
        c.walk();

    Bird ccc = new Eagle();
    ((Eagle) ccc).fly();
        // The issue is what if we add Penguin
        System.out.println("Penguin");
        Bird bb = new Penguin();
//        bb.fly();
        bb.walk();

        List<Bird> birds = new ArrayList<>();
        birds.add(b);
        birds.add(c);
        birds.add(ccc);
        birds.add(bb);

        for(Bird bird:birds){
            if(bird instanceof  FlyingBird){
              ((FlyingBird) bird).fly();
            }
            //here we solved flying , nonflying using 2 differnet abstract class
            //what if there are some more like can swim , cannot swim , can dance, cannotdance.
            //if we have 1 behaviour likw can and cannot, we have 2 power 1 = 2.
            //if we have N behaviour then 2 power N classed need to be created.
            //this is called class explosion.
            // how to solve ?
            //using interfaces
        }
    }
}
