package com.muskan.pizzaService.bo;

import com.muskan.pizzaService.intf.PizzaDecorator;
import com.muskan.pizzaService.intf.Sellable;

public class Paneer extends PizzaDecorator {

    public Paneer(Sellable s){
        super(s);
    }
    @Override
    public double cost() {
        return super.sellable.cost()+15;
    }
}
