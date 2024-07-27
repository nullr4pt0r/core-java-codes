package SOLIDPRINCIPLES.ISP;

public class Eagle extends Bird implements FlyForward {
    @Override
   public void walk() {
        System.out.println("I can walk");
    }

    @Override
    public void flyForward() {
        System.out.println("Fly High");
    }
}
