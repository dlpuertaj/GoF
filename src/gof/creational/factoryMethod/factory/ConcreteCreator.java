/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.creational.factoryMethod.factory;

import gof.creational.factoryMethod.product.MyProduct;
import gof.creational.factoryMethod.product.Product;
import gof.creational.factoryMethod.factory.Creator;


/**
 *
 * @author Design Patterns GOF Book
 * -> CONCRETE CREATOR
 *    - Implements the Product interface.
 *    - Overrides the factory method to return an instance of a ConcreteProduct
 * 
 */
public class ConcreteCreator extends Creator{
    
    @Override
    public Product createProduct(String name) {
        Product product = new MyProduct(name);       
        return product;
    }
}