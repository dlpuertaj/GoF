/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.sample.creational.factoryMethod.factory;

import gof.sample.creational.abstractFactory.factory.concrete.GourmetToppingFactory;
import gof.sample.creational.abstractFactory.factory.concrete.SicillianToppingFactory;
import gof.sample.creational.factoryMethod.product.CheesePizza;
import gof.sample.creational.factoryMethod.product.PepperoniPizza;
import gof.sample.creational.factoryMethod.product.Pizza;
import gof.sample.creational.factoryMethod.product.VeggiePizza;


/**
 *
 * @author David_Puerta
 */
public class PizzaFactory extends BasePizzaFactory{

    @Override
    public Pizza createPizza(String type, String topping) {
        Pizza pizza = null;
        switch (type.toLowerCase())
        {
            case "cheese":
                if(topping.equals("sicillian"))
                    pizza = new CheesePizza(new SicillianToppingFactory());
                else if(topping.equals("gourmet"))
                    pizza = new CheesePizza(new GourmetToppingFactory());
                break;
            case "pepperoni":
                if(topping.equals("sicillian"))
                    pizza = new PepperoniPizza(new SicillianToppingFactory());
                else if(topping.equals("gourmet"))
                    pizza = new PepperoniPizza(new GourmetToppingFactory());
                break;
            case "veggie":
                if(topping.equals("sicillian"))
                    pizza = new VeggiePizza(new SicillianToppingFactory());
                else if(topping.equals("gourmet"))
                    pizza = new VeggiePizza(new GourmetToppingFactory());
                break;
            default: throw new IllegalArgumentException("No such pizza.");
        }
 
        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }
    
}
