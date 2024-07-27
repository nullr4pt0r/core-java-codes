package SOLIDPRINCIPLES.ClassExplosion;

public class Penguin extends FlylessBird{
//can be removed because we extends flylessBird now
//    @Override
//    void fly() {
//        System.out.println("How can I fly ? why did you create this method for me");
//    }

    @Override
    protected void walk() {
        System.out.println("I can only walk");
    }
}
