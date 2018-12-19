/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.geof.creational;
import gof.sample.creational.factoryMethod.BasePizzaFactory;
import gof.sample.creational.factoryMethod.Pizza;
import gof.sample.creational.factoryMethod.PizzaFactory;
import org.junit.Test;

/**
 *
 * @author David_Puerta
 */
public class CreationalDesignPatternTests {
    
    @Test
    public void testMakePizzas(){
        BasePizzaFactory pizzaFactory = new PizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza veggiePizza = pizzaFactory.createPizza("veggie");
    }
    
}
