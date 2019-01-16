/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.creational.singleton;

/**
 *
 * @author David_Puerta
 */
public class NestedSingleton {
    private NestedSingleton(){
        System.out.println("A singleton instance"); 
    }
    
    private static class SingletonHelper{
        /* Nested class is referenced after the get method is called*/
        private static final NestedSingleton singleton = new NestedSingleton();
    }
    
    public static NestedSingleton getNestedSingleton(){
     return SingletonHelper.singleton;
    }
}
