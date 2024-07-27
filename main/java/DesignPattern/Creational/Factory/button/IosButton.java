package DesignPattern.Creational.Factory.button;

public class IosButton implements Button{

//    private IosButton(){}
    @Override
    public void click() {
        System.out.println("Ios button Click!");
    }
}
