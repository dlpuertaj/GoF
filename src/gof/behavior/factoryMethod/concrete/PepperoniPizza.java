/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.behavior.factoryMethod.concrete;

import gof.behavior.factoryMethod.product.Pizza;

/**
 *
 * @author David_Puerta
 */
public class PepperoniPizza extends Pizza{

    @Override
    public void addIngredients() {
        System.out.println("Prepearing ingredients for pepperoni pizza");
    }
    
}