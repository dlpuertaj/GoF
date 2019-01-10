/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.creational.abstractFactory;

import gof.creational.ConcreteProduct;
import gof.creational.Product;

/**
 *
 * CONCRETE FACTORY: Implements the operations to create concrete product objects
 */
public class ConcreteFactory implements AbstractFactory{

    @Override
    public Product createProduct(String name) {
        return new ConcreteProduct(name);
    }
    
}
