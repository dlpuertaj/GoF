/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.creational.singleton;

/**
 *
 * Pros:
 *   - It is straightforward and cleaner
 *   - It is the opposite of lazy initialization but still thread safe
 *   - It has a small lag time when the application is in exacution mode
 * 
 * Cons:
 *   - The application takes longer to start compared to lazy initialization
 */
public class EagerSingleton {
    //Eager initialization
    private static final EagerSingleton singleton = new EagerSingleton();
    
    //We make a constructor private to prevent the use of "new"
    private EagerSingleton(){
        System.out.println("A singleton instance");
    }
    
    /*Global point of acces. The method getEagerSingleton is a public
      static method*/
    
    public static EagerSingleton getEagerSingleton(){
        System.out.println("You have a Eager Singleton");
        return singleton;
    }
}
