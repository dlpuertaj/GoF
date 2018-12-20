/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.sample.creational.abstractFactory.factory;

import gof.sample.creational.abstractFactory.factory.BaseToppingFactory;
import gof.sample.creational.abstractFactory.product.Cheese;
import gof.sample.creational.abstractFactory.product.Sauce;
import gof.sample.creational.abstractFactory.product.MozzarellaCheese;
import gof.sample.creational.abstractFactory.product.TomatoSauce;

/**
 *
 * @author David_Puerta
 */
public class SicillianToppingFactory extends BaseToppingFactory{

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }
    
}
