/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.behavior.factoryMethod.concrete;

import gof.behavior.factoryMethod.product.Product;

/**
 *
 * @author David_Puerta
 * -> CONCRETE PRODUCT
 */
public class MyProduct extends Product{

    private String name;
    
    public MyProduct(String name){
        this.name = name;
    }
    @Override
    public void open() {
        System.out.println("Product " + name + " is ready to edit");
    }

    @Override
    public void close() {
        System.out.println("Product " + name + " is now closed");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
