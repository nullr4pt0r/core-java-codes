package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Cars implements Comparable<Cars>{
    int Price;
    int Speed;

    public Cars(int Price, int Speed){
        this.Price = Price;
        this.Speed = Speed;
    }

    public int compareTo(Cars that){
      return  this.Price - that.Price;
    }

    public String toString(){
        return "Price : "+Price+" Speed : "+Speed;
    }
 }

 public class Car{
     public static void main(String[] args) {
         List<Cars> carsList = new ArrayList<Cars>();
         carsList.add(new Cars(10,200));
            carsList.add(new Cars(5,100));
            carsList.add(new Cars(22,150));
            carsList.add(new Cars(14,250));
            carsList.add(new Cars(23,300));
            System.out.println("Original list : "+ carsList);
         Collections.sort(carsList);
            System.out.println("Sorted List : "+carsList);
     }
 }


