package SOLIDPRINCIPLES.OCP_VIOLATION;

public class Bird {
    String color;
    String breed;

   void fly(String type){
       //It is violation of Single Responsibility. Here fly method is responsible for flying strategy of multiple birds not one bird.
        if(type.equals("eagle")){
            System.out.println("Fly High");
        }
        else if(type.equals("crow")){
            System.out.println("Fly with crowd");
        }
        /*
        Need to add this
        else if(type.equals("humming"){     => Violation of Open Close Principle. Here we need to modify the existing fly method to add new type
            System.out.println("Fly Backwards");
         */
    }

    public static void main(String[] args) {
        Bird b = new Bird();
        b.breed = "Indian";
        b.color = "Salmon";
        b.fly("eagle");
        System.out.println("*********");
        Bird c = new Bird();
        c.breed = "Cuban";
        c.color = "Honey";
        c.fly("Humming"); // We cannot see any output for this. as there is no if block for "Humming"

    }
}
