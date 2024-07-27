package DesignPattern.Structural.pizza.toppings;

import DesignPattern.Structural.pizza.BasePizza;

public class ExtraPanner extends BaseToppings{
    BasePizza pizza;

    public ExtraPanner(BasePizza pizzza){
        pizza = pizzza;
    }
    @Override
    public int cost() {
        return pizza.cost() + 15;
    }
}
