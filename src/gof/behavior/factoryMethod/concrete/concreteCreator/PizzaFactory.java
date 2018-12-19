/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.behavior.factoryMethod.concrete.concreteCreator;

import gof.behavior.factoryMethod.concrete.CheesePizza;
import gof.behavior.factoryMethod.concrete.PepperoniPizza;
import gof.behavior.factoryMethod.concrete.VeggiePizza;
import gof.behavior.factoryMethod.creator.BasePizzaFactory;
import gof.behavior.factoryMethod.product.Pizza;

/**
 *
 * @author David_Puerta
 */
public class PizzaFactory extends BasePizzaFactory{

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        switch (type.toLowerCase())
        {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
            default: throw new IllegalArgumentException("No such pizza.");
        }
 
        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }
    
}
