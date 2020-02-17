package com.muskan.pizzaService.intf;

public abstract class PizzaDecorator implements Sellable {
    protected Sellable sellable;

    public PizzaDecorator(Sellable s){
        this.sellable = s;
    }

}
