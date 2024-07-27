package DesignPattern.Structural.pizza;

import DesignPattern.Structural.pizza.toppings.ExtraCheese;
import DesignPattern.Structural.pizza.toppings.ExtraPanner;

public class PizzaUser {

    public static void main(String[] args) {
        BasePizza pizza = new ExtraCheese(new ExtraPanner(new MalePizza()));
        System.out.println(pizza.cost());
    }
}
