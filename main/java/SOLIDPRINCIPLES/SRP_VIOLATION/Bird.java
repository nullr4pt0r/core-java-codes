package SOLIDPRINCIPLES.SRP_VIOLATION;

public class Bird {
    String color;
    String breed;

   void fly(String type){
       //It is violation of Single Responsibility. Here fly method is responsible for flying strategy of multiple birds not one birkd.
        if(type.equals("eagle")){
            System.out.println("Fly High");
        }
        else if(type.equals("crow")){
            System.out.println("Fly with crowd");
        }
    }

    public static void main(String[] args) {
        Bird b = new Bird();
        b.breed = "Indian";
        b.color = "Salmon";
        b.fly("eagle");


    }
}
