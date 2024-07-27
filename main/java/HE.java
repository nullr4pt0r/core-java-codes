import java.util.Objects;

class Human {
    String name;

     public Human(String name) {
         this.name = name;
     }

//     @Override
//     public boolean equals(Object o){
//        return  this.name.equals(((Human)o).name);
//     }


     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;

         Human human = (Human) o;

         return Objects.equals(name, human.name);
     }

     @Override
     public int hashCode() {
         return name != null ? name.hashCode() : 0;
     }
 }

 class Dog{
    String name;

     public Dog(String name) {
         this.name = name;
     }

     public boolean equals(Object o){
        return  this.name.equals(((Dog)o).name);
     }

     @Override
     public int hashCode() {
         return name.hashCode();
     }
 }

 public class HE{
     public static void main(String[] args) {
            Human human = new Human("John");
            Dog dog = new Dog("Rex");
            System.out.println(human.name + " has a dog named " + dog.name);
         System.out.println(human.equals(dog));
         System.out.println(human.getClass() +" "+ dog.getClass());
         System.out.println(human.hashCode() +" "+ dog.hashCode());
     }
 }
