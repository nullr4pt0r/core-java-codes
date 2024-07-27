package SOLIDPRINCIPLES.Dependency_Inversion;


public class Penguin extends Bird implements Swim {
    @Override
    public void walk() {
        System.out.println("I walk on icebergs");
    }

    @Override
    public void swim() {
        System.out.println("I swim with my family");
    }
}
