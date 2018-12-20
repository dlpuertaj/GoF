/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.sample.creational.factoryMethod.product;

import gof.sample.creational.abstractFactory.factory.BaseToppingFactory;

/**
 *
 * CONCRETE PRODUCT: Are concrete subclasses that implement or extend Product. 
 * The FACTORY METHOD (inside the subclass of the CREATOR) instantiates these
 * subclasses.
 * 
 */
public class PepperoniPizza extends Pizza{
    BaseToppingFactory toppingFactory;
    public PepperoniPizza(BaseToppingFactory toppingFactory)
    {
        this.toppingFactory=toppingFactory;
    }

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for pepperoni pizza.");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }
    
}
