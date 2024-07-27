package SOLIDPRINCIPLES.Dependency_Inversion;

public class SingSlow implements Sing{

    @Override
    public void sing() {
        System.out.println("I sing slooooooowwww");
    }
}
