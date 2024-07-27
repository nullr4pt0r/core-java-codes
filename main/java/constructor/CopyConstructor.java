package constructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Fruits{
    List<String> fl = new ArrayList<>();

    public Fruits(){
        System.out.println("No-arg constructor "+Fruits.class+" "+this.fl);
    }

    public Fruits(List<String> fl){
        this.fl = fl;
        System.out.println("Shallow Copy");
    }

    public Fruits(Fruits fruits){
        List<String> fl = new ArrayList<>();
        fl.addAll(fruits.fl);
//        for(String fruit:fruits.fl){
//            fl.add(fruit);
//        }
        this.fl = fl;
        System.out.println("Deep Copy");
    }
}

 public class CopyConstructor {

     public static void main(String[] args) {
         Fruits fruits = new Fruits();
         fruits.fl.add("Mango");
         fruits.fl.add("Banana");
         System.out.println("Fruits list from fruits object"+Arrays.toString(fruits.fl.toArray()));
         System.out.println("************Adding Apple to fruits1 only*********");
         Fruits fruits1 = new Fruits(fruits.fl);
         fruits1.fl.add("Apple");
         System.out.println("Fruits list from fruits object"+Arrays.toString(fruits.fl.toArray()));
         System.out.println("Fruits list from fruits1 object"+Arrays.toString(fruits1.fl.toArray()));
         System.out.println("************");
         fruits1 = new Fruits(fruits);
         fruits1.fl.add("Grapes");
         System.out.println("Fruits list from fruits object"+Arrays.toString(fruits.fl.toArray()));
         System.out.println("Fruits list from fruits1 object"+Arrays.toString(fruits1.fl.toArray()));
     }

}
