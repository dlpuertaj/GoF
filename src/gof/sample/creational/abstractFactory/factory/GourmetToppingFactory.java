/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.sample.creational.abstractFactory.factory;

import gof.sample.creational.abstractFactory.factory.BaseToppingFactory;
import gof.sample.creational.abstractFactory.product.Cheese;
import gof.sample.creational.abstractFactory.product.Sauce;
import gof.sample.creational.abstractFactory.product.CaliforniaSauce;
import gof.sample.creational.abstractFactory.product.GoatCheese;


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
