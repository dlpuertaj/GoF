/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.creational;

/**
 *
 * -> PRODUCT
 *    - Defines the interface of objects the factory method creates.
 *    - For the abstract factory pattern, declares an interface for a type 
 *      of product object.
 */
public interface Product {
    public abstract void create();
    public abstract void delete();
}
