/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.creational.factoryMethod.factory;

import gof.creational.Product;

/**
 *
 * @author David_Puerta
 * -> CREATOR
 *    - Declares the factory method, which returns an object of type Product.
 *      Creator may also define a default implementation of the factory method
 *      that returns a default ConcreteProduct object.
 *    - May call the factory method to create a Product object.
 * 
 * * Use Factory Method pattern when
 *   - A class cant anticipate the class of objects it ,must create
 *   - A class wants its subclasses to specify the objects it creates.
 *   - Classes delegate  responsibility to one of several helper subclasses,
 *     and want to localize the knowledge of which helper subclass is the delegate.
 * 
 * *Consequences:
 *   1. Provides hooks for subclasses
 *   2. Connects parallel class hierachies
 * 
 * *Parameterized factory methods-> Another variation on the pattern lets the
 *  factory method create multiple kinds of products. The factory method takes
 *  a parameter that identifies the kind of object to create.
 */
public abstract class Creator {
    Product product;
      
    public abstract Product createProduct(String name);// Factory Method
    
    public void newProduct(String name){
        Product prod = createProduct(name);
        prod.create();
    };
    
    public void deleteProduct(){
        this.product.delete();
    }
}
