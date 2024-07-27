package DesignPattern.Creational.Factory.button;

public class AndroidButton implements Button{

//    private AndroidButton(){}
    @Override
    public void click() {
        System.out.println("Android button click!");
    }
}
