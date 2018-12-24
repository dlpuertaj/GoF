/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.sample.creational.factoryMethod.Animal;

import others.simpleFactory.Animal;

/**
 *
 * @author David_Puerta
 */
public abstract class AnimalFactory {
    public Animal makeAnimal(){
        System.out.println("I am makeAnimal() of AnimalFactory. You cannot "
                + "ignore my rules...");
        
        /*
        At this point, it doesn't know whether it will get a Dog or a
        Tiger. It will be decided by the subclasses i.e.DogFactory or
        TigerFactory.But it knows that it will Speak and it will have a
        preferred way of Action.
        */
        
        Animal animal = createAnimal();
        animal.speak();
        animal.preferredAction();
        return animal;
    }
    /*Remember that the GoF definition says "....Factory method lets a class
    defer instantiation to subclasses."
    In our case, the following method will create a Tiger or Dog but at this
    point it does not know whether it will get a Dog or a Tiger.
    This decision will be taken by the subclasses i.e. DogFactory or
    TigerFactory. So,in this implementation, the following method is playing
    the role of a factory (of creation)*/
    public abstract Animal createAnimal();
}
