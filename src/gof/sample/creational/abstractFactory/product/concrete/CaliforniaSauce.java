/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.sample.creational.abstractFactory.product.concrete;

/**
 *
 * @author David_Puerta
 */
public class CaliforniaSauce implements Sauce{

    public CaliforniaSauce(){
        prepareSauce();
    }
    @Override
    public void prepareSauce() {
        System.out.println("Preparing California sauce...");
    } 
}