/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.creational.factoryMethod.product;

import gof.creational.Product;

/**
 *
 * @author David_Puerta
 * -> CONCRETE PRODUCT
 */
public class MyProduct implements Product{

    private String name;
    
    public MyProduct(String name){
        this.name = name;
    }
    @Override
    public void create() {
        System.out.println("Product " + name + " is ready to edit");
    }

    @Override
    public void delete() {
        System.out.println("Product " + name + " is now closed");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
