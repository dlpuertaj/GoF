/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.sample.creational.abstractFactory.Pizza;

/**
 *
 * @author David_Puerta
 */
public class GoatCheese implements Cheese{
    
    public GoatCheese(){
        prepareCheese();
    }
    @Override
    public void prepareCheese() {
        System.out.println("Preparing goat cheese...");
    }
    
}
