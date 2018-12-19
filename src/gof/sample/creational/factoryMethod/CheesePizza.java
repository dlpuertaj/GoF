/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.sample.creational.factoryMethod;

/**
 * At this point let us understand the relationship of abstract factory with 
 * factory method. If you have noticed, the createCheese() and createSauce() are
 * factory methods that we used in our abstract factory. In other words, we can 
 * say that an abstract factory object can use factory methods, one for each 
 * product to create.
 */
public class CheesePizza extends Pizza{

    BaseToppingFactory toppingFactory;
    
    public CheesePizza(BaseToppingFactory toppingFactory){
        this.toppingFactory = toppingFactory;
    }
    @Override
    public void addIngredients() {
        System.out.println("Prepearing ingredients for cheese pizza");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }
    
}
