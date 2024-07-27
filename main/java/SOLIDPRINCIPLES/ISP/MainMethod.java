package SOLIDPRINCIPLES.ISP;

import java.util.ArrayList;
import java.util.List;

public class MainMethod{
    public static void main(String[] args) {
         /*
        What if we have 2 methods in fly interface like flyForwad() and flyBackword();
        But a class wants to implement only one method. But interfcae force to implement all method.
        we are forcing the class to impement unwanted methods. it si wrong. solution?

        Interface Segregation principle. We group the related and interconnected also the methods which are
        implementd by the class in the whole are in single interface. else we segregate the principle
         */

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
        birds.add(new HummingBird());

        for(Bird bird:birds){
            bird.walk();
            if(bird instanceof FlyForward){
               ( (FlyForward) bird).flyForward();
            }
            if(bird instanceof  FlyBackward){
                ((FlyBackward) bird).flyBackward();
            }
            if(bird instanceof Swim){
                ((Swim) bird).swim();
            }

        }
/*
 solved. Now what if we have some bird which can Sing same way . we create an class and extends that class.
 So we dont need to rewrite the method.

 What if we have birds which sings in 2 different way. we can create 2 different class. but if one bird changes its
 singing strategy we need to again create different class obj and call the method. better we can solve this by
 using "Dependency Inversion". It helps to solve this issue.

 Interface => different class which implements these methods and give the concerete method body.
 now we can use the obj of interface interchangbly.

 The rule is , if 2 concrete class depends each other, we need to make it depend via an interfcae.


 */




    }

}
