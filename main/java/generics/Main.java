package generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Animal cat = new Cat();
//        Animal dog = new Dog();
//        Animal puppy = new Puppy();
        //upcasting the child to parent. polymorphism. we can pnly access the Animal class mehtod and attributes

//        List<Animal> animal = new ArrayList<Dog>();

//        List<? extends Animal> puppies = new ArrayList<Puppy>();
//        Puppy p1 = new Puppy(11);
//        puppies.add(p1);
//        puppies.add(new Puppy());
//        List<? extends Animal> dogs = new ArrayList<Dog>();
//
//        List<? extends Animal> cats = new ArrayList<Cat>();

        List<Puppy> puppies = new ArrayList<>();
        puppies.add(new Puppy(10));
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("abcd"));
        printAnimal(puppies);
//        printAnimal(cats);

//        List someList = new ArrayList<>();
//        boolean instanceTest = someList instanceof List<?>;
//        System.out.println(instanceTest);
//        List anotherList = new ArrayList<>();
//        boolean instanceTest1 = anotherList instanceof List<? extends Object>;
//        System.out.println(instanceTest1);
//
//        List<?>[] arrayOfList = new List<?>[1];
//        System.out.println(arrayOfList[0]);
//        List<? extends Object>[] arrayOfAnotherList = new List<? extends Object>[1];



    }
   static void printAnimal(List< ? super Puppy> list){
        for(Object animal:list){
            System.out.println(animal);
        }
    }
}
