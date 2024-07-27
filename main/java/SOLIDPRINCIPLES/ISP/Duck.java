package SOLIDPRINCIPLES.ISP;


public class Duck extends Bird implements Swim, FlyForward {
    @Override
    protected void walk() {
        System.out.println("I walk , Bak Bak");
    }

    @Override
    public void flyForward() {
        System.out.println("I fly to some extend. Believe me !");
    }

    @Override
    public void swim() {
        System.out.println("I swim a lot. wanna have race ?");
    }
}
