/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.creational;

import gof.creational.Product;

/**
 *
 * @author David_Puerta
 * -> CONCRETE PRODUCT
 */
public class ConcreteProduct implements Product{

    private String name;
    
    public ConcreteProduct(String name){
        this.name = name;
    }
    @Override
    public void create() {
        System.out.println("Product " + name + " created");
    }

    @Override
    public void delete() {
        System.out.println("Product " + name + " deleted");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
