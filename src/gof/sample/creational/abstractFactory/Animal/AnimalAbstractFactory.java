/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.sample.creational.abstractFactory.Animal;

/**
 *
 * An interface that is treated as the abstract factory
 */
public interface AnimalAbstractFactory {
    DogInterface createDog();
    TigerInterface createTiger();
}
