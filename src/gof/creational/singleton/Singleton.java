/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.creational.singleton;

/**
 *  GoF Book (C++)
 *  Use  Singleton pattern when:
 *   - There must be exactly one instance of a class, and it must be accessible 
 *     to cleints from a wll-known access point.
 *   - When the sole instance should be extensible by subclasing
 *  Benefits:
 *   - Controlled acces to sole instance
 *   - Avoids polluting  the name space with global variables that store sole 
 *     intances
 *   - Permits refinement of operations and representation
 *   -Permitsa variable number of instances
 *   -More flexible than class operations                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
 */
public class Singleton {
    
    private static Singleton singleton;
    /** 
     * Java
     * -The constructor is private to prevent the use of the "new" operator.
     * -You’ll create an instance of the class, if you did not create any such
     *  instance earlier; otherwise, you’ll simply reuse the existing one.
     * -To take care of thread safety, I use the "synchronized" keyword.
     **/
    private Singleton(){}
    
    public Singleton getSingleton(){
        if(singleton == null){
            singleton = new Singleton();
            System.out.println("New singleton instance.");
        }else{
             System.out.print("You already have a singleton instance.");
             System.out.println("Returning singleton instance...");       
        }
        return singleton;
    }
}
