package SOLIDPRINCIPLES.LSP;



public class Duck extends Bird implements Swim, Fly {
    @Override
    protected void walk() {
        System.out.println("I walk , Bak Bak");
    }

    @Override
    public void fly() {
        System.out.println("I fly to some extend. Believe me !");
    }

    @Override
    public void swim() {
        System.out.println("I swim a lot. wanna have race ?");
    }
}
