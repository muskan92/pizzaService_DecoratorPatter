package com.muskan.pizzaService.bo;

import com.muskan.pizzaService.AllEnum;
import com.muskan.pizzaService.intf.PizzaDecorator;
import com.muskan.pizzaService.intf.Sellable;

public class Topping extends PizzaDecorator {

    private AllEnum.ToppingType toppingType;

    public Topping(Sellable s, AllEnum.ToppingType tt){
        super(s);
        this.toppingType = tt;
    }

    @Override
    public double cost() {
        if (this.toppingType.equals(AllEnum.ToppingType.VEG)){
            return super.sellable.cost()+10;
        }else {
            return super.sellable.cost()+20;
        }
    }
}
