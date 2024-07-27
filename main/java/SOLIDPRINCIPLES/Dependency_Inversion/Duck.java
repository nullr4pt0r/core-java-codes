package SOLIDPRINCIPLES.Dependency_Inversion;


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

    Sing sing = new SingSlow();
    void sing(){
        sing.sing();
    }
}
