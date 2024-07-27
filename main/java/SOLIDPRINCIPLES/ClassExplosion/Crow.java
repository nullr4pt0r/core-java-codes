package SOLIDPRINCIPLES.ClassExplosion;

public class Crow extends FlyingBird{
    @Override
    void fly() {
        System.out.println("Fly with crowd");
    }

    @Override
    protected void walk() {
        System.out.println("I walk");
    }


}
