package generics;

import java.util.concurrent.ConcurrentHashMap;

class Pair<T extends Object, U extends Object>{
    T first;
    U next;

    Pair(T first, U next){
        this.first = first;
        this.next = next;
    }

    T getFirst(){
        return this.first;
    }

    U getNext(){
        return this.next;
    }

    <T,U> void print(){
        System.out.println(this.getFirst()+" "+this.getNext());
    }

}

public class Generics{
    public static void main(String[] args) {
        Pair<Integer, Integer> p1 = new Pair<Integer, Integer>(1,2);
        Pair<String , String> people = new Pair("John", "India");

       p1.print();
       people.print();



    }
}