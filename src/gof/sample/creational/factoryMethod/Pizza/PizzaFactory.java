/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.sample.creational.factoryMethod.Pizza;

import gof.sample.creational.factoryMethod.Pizza.BasePizzaFactory;
import gof.sample.creational.abstractFactory.Pizza.GourmetToppingFactory;
import gof.sample.creational.abstractFactory.Pizza.SicillianToppingFactory;
import gof.sample.creational.factoryMethod.Pizza.CheesePizza;
import gof.sample.creational.factoryMethod.Pizza.PepperoniPizza;
import gof.sample.creational.factoryMethod.Pizza.Pizza;
import gof.sample.creational.factoryMethod.Pizza.VeggiePizza;


/**
 *
 * The Factory Method Pattern defines an interface for creating an object, but
 * lets sublcasses decide which class to instantiate.
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
