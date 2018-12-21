/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.sample.creational.abstractFactory.Pizza;

import gof.sample.creational.abstractFactory.Pizza.BaseToppingFactory;


/**
 *
 * @author David_Puerta
 */
public class GourmetToppingFactory extends BaseToppingFactory{

    @Override
    public Cheese createCheese() {
        return new GoatCheese();
    }

    @Override
    public Sauce createSauce() {
        return new CaliforniaSauce();
    }
    
}
