package SOLIDPRINCIPLES.ClassExplosion;

public class Eagle extends FlyingBird{
    @Override
    void fly(){
        System.out.println("Fly High");
    }

    @Override
    protected void walk(){
        System.out.println("I too walk");
    }

}
