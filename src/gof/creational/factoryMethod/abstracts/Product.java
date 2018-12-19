/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.creational.factoryMethod.abstracts;

/**
 *
 * @author David_Puerta
 * -> PRODUCT
 *    - Defines the interface of objects the factory method creates.
 */
public abstract class Product {
    public abstract void open();
    public abstract void close();
    public void save(){System.out.println("Product saved");}
    public void revert(){System.out.println("Product reverted");}
}
