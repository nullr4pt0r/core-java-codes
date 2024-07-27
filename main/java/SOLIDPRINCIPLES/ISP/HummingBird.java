package SOLIDPRINCIPLES.ISP;

public class HummingBird extends Bird implements FlyBackward, FlyForward{


    @Override
    void walk() {
        System.out.println("Humming bird can walk !");
    }

    @Override
    public void flyBackward() {
        System.out.println("I am ninja, I can fly backwards !");
    }

    @Override
    public void flyForward() {
        System.out.println("Like you all, I can fly Forwards too !");
    }
}
