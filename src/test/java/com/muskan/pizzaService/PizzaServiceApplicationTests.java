package com.muskan.pizzaService;

import com.muskan.pizzaService.bo.Paneer;
import com.muskan.pizzaService.bo.PizzaBase;
import com.muskan.pizzaService.bo.Topping;
import com.muskan.pizzaService.intf.Sellable;
import org.junit.Test;

public class PizzaServiceApplicationTests {

	@Test
	public void pizzaServiceTest() {
		Sellable myPizza = new PizzaBase(AllEnum.BaseType.NORMAL);
		System.out.println(myPizza.cost());

		myPizza = new Topping(myPizza, AllEnum.ToppingType.VEG);
		System.out.println(myPizza.cost());

		myPizza = new Paneer(myPizza);

		System.out.println(myPizza.cost());

	}

}
