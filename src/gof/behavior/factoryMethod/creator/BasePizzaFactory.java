/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.behavior.factoryMethod.creator;

import gof.behavior.factoryMethod.product.Pizza;

/**
 *
 * @author David_Puerta
 */
public abstract class BasePizzaFactory {
    
    public abstract Pizza createPizza(String type);
    
}
