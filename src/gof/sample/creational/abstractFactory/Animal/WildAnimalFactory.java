/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.sample.creational.abstractFactory.Animal;

/**
 *
 * @author David_Puerta
 */
public class WildAnimalFactory implements AnimalAbstractFactory{

    @Override
    public DogInterface createDog() {
        return new WildDog();
    }

    @Override
    public TigerInterface createTiger() {
        return new WildTiger();
    }
    
}
