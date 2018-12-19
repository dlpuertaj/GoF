/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.sample.creational.abstractFactory.product.concrete;

import gof.sample.creational.abstractFactory.product.abstracts.Cheese;

/**
 *
 * @author David_Puerta
 */
public class MozzarellaCheese implements Cheese {

    public MozzarellaCheese(){
        prepareCheese();
    }
    @Override
    public void prepareCheese() {
        System.out.println("Preparing mozzarella cheeze...");
    }
}