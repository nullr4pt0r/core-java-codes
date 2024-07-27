package SOLIDPRINCIPLES.LSP;

public class Eagle extends Bird implements Fly{
    @Override
   public void walk() {
        System.out.println("I can walk");
    }

    @Override
    public void fly() {
        System.out.println("Fly High");
    }
}
