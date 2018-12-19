/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.sample.creational.abstractFactory.factory.concrete;

import gof.sample.creational.abstractFactory.factory.abstracts.BaseToppingFactory;
import gof.sample.creational.abstractFactory.product.abstracts.Cheese;
import gof.sample.creational.abstractFactory.product.abstracts.Sauce;
import gof.sample.creational.abstractFactory.product.concrete.CaliforniaSauce;
import gof.sample.creational.abstractFactory.product.concrete.GoatCheese;


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
