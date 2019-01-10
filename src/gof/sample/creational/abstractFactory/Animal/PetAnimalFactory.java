/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.sample.creational.abstractFactory.Animal;

/**
 *
 * Another concrete factory that implements the AnimalFactory interface. 
 * It creates pet dogs and pet tigers
 */
public class PetAnimalFactory implements AnimalAbstractFactory{

    @Override
    public DogInterface createDog() {
        return new PetDog();
    }

    @Override
    public TigerInterface createTiger() {
        return new PetTiger();
    }
    
}
