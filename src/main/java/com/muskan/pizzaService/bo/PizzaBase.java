package com.muskan.pizzaService.bo;

import com.muskan.pizzaService.AllEnum;
import com.muskan.pizzaService.intf.Sellable;

public class PizzaBase implements Sellable {

    AllEnum.BaseType baseType;

    public PizzaBase(AllEnum.BaseType bt) {
        this.baseType = bt;
    }

    @Override
    public double cost() {
        if (baseType.equals(AllEnum.BaseType.NORMAL)) {
            return 100;
        } else {
            return 200;
        }
    }
}