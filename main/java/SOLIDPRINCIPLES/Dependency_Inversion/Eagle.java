package SOLIDPRINCIPLES.Dependency_Inversion;

public class Eagle extends Bird implements FlyForward {
    @Override
   public void walk() {
        System.out.println("I can walk");
    }

    @Override
    public void flyForward() {
        System.out.println("Fly High");
    }

    Sing sing = new SingFast();
    //we can easily change the obj like => new SingFast();
    void sing(){
       sing.sing();
    }
}
