package SOLIDPRINCIPLES.LSP;

import java.util.ArrayList;
import java.util.List;

public class MainMethod{
    public static void main(String[] args) {
        Bird b = new Eagle();
//        ((Eagle)b).fly();

        Bird c = new Penguin();
//        ((Penguin)c).swim();

        Bird d  = new Duck();
//        ((Duck) d).swim();
//        ((Duck) d).fly();


        List<Bird> birds = new ArrayList<>();
        birds.add(b);
        birds.add(c);
        birds.add(d);

        for(Bird bird:birds){
            if(bird instanceof Fly){
               ( (Fly) bird).fly();
            }
            if(bird instanceof  Swim){
                ((Swim) bird).swim();
            }
            bird.walk();
        }


        /*
        What if we have 2 methods in fly interface like flyForwad() and flyBackword();
        But a class wants to implement only one method. But interfcae force to implement all method.
        we are forcing the class to impement unwanted methods. it si wrong. solution?

        Interface Segregation principle. We group the related and interconnected also the methods which are
        implementd by the class in the whole are in single interface. else we segregate the principle
         */
    }

}
