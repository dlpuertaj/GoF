/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.sample.creational.factoryMethod.Pizza;

/**
 *
 * PRODUCT: Is an interface or an abstract class whose subclasses are 
 * instantiated by the factory method
 * 
 */
public abstract class Pizza {
    public abstract void addIngredients();
    
    public void bakePizza(){
        System.out.println("Pizza baked at 400 for 20 minutes");
    }
}
