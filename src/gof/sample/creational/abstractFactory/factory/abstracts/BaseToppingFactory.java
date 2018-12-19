/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.sample.creational.abstractFactory.factory.abstracts;

import gof.sample.creational.abstractFactory.product.abstracts.Cheese;
import gof.sample.creational.abstractFactory.product.abstracts.Sauce;


/**
 *
 * Abstract Factory of the sample
 * Provides an interface to create families of related or dependant objects.
 * We do not specify the concrete classes of the objects to create.
 */
public abstract class BaseToppingFactory {
    public abstract Cheese createCheese();
    public abstract Sauce createSauce();
}

