/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.sample.creational.abstractFactory.factory.concrete;

import gof.sample.creational.abstractFactory.factory.abstracts.BaseToppingFactory;
import gof.sample.creational.abstractFactory.product.abstracts.Cheese;
import gof.sample.creational.abstractFactory.product.abstracts.Sauce;
import gof.sample.creational.abstractFactory.product.concrete.MozzarellaCheese;
import gof.sample.creational.abstractFactory.product.concrete.TomatoSauce;

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
