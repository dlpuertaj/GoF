/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.sample.creational.factoryMethod.Pizza;

import gof.sample.creational.factoryMethod.Pizza.Pizza;

/**
 *
 * CREATOR (FACTORY): Is an interface or an abstract class that declares the 
 * FACTORY METHOD to create and return a CONCRETE PRODUCT to the client
 */
public abstract class BasePizzaFactory {
    
    public abstract Pizza createPizza(String type, String topping);
    
}
