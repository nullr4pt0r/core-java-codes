package DesignPattern.Structural.pizza.toppings;

import DesignPattern.Structural.pizza.BasePizza;
import DesignPattern.Structural.pizza.MalePizza;

public class ExtraCheese extends BaseToppings{
    BasePizza pizza;
    public ExtraCheese(BasePizza pizzza) {
       pizza = pizzza;
    }

    @Override
    public int cost() {
        return pizza.cost() + 20;
    }
}
