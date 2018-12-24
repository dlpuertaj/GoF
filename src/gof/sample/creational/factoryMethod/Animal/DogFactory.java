/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.sample.creational.factoryMethod.Animal;

import others.simpleFactory.Animal;
import others.simpleFactory.ConcreteDog;

/**
 *
 * @author David_Puerta
 */
public class DogFactory extends AnimalFactory {

    @Override
    public Animal createAnimal() {
        return new ConcreteDog();
    }
    
}
