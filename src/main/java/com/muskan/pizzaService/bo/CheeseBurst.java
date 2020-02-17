package com.muskan.pizzaService.bo;

import com.muskan.pizzaService.intf.PizzaDecorator;
import com.muskan.pizzaService.intf.Sellable;

public class CheeseBurst extends PizzaDecorator {

    public CheeseBurst(Sellable s){
        super(s);
    }
    @Override
    public double cost() {
        return super.sellable.cost()+5;
    }
}
