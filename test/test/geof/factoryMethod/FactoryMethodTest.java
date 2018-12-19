/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.geof.factoryMethod;

import gof.behavior.factoryMethod.concrete.concreteCreator.PizzaFactory;
import gof.behavior.factoryMethod.creator.BasePizzaFactory;
import gof.behavior.factoryMethod.product.Pizza;
import org.junit.Test;

/**
 *
 * @author David_Puerta
 */
public class FactoryMethodTest {
    
    @Test
    public void testMakePizzas(){
        BasePizzaFactory pizzaFactory = new PizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza veggiePizza = pizzaFactory.createPizza("veggie");
    }
    
}
