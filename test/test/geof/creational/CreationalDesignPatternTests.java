/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.geof.creational;
import gof.sample.creational.factoryMethod.factory.BasePizzaFactory;
import gof.sample.creational.factoryMethod.product.Pizza;
import gof.sample.creational.factoryMethod.factory.PizzaFactory;
import org.junit.Test;

/**
 * At this point let us understand the relationship of abstract factory with 
 * factory method. If you have noticed, the createCheese() and createSauce() are
 * factory methods that we used in our abstract factory. In other words, we can 
 * say that an abstract factory object can use factory methods, one for each 
 * product to create.
 */
public class CreationalDesignPatternTests {
    
    @Test
    public void testFactoryMethodAndAbstractFactory(){
        BasePizzaFactory pizzaFactory = new PizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese","gourmet");
        Pizza veggiePizza = pizzaFactory.createPizza("veggie","sicillian");
    }
    
}
