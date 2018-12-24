/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.creational.abstractFactory;

/**
 * ABSTRACT FACTORY: Declares an interface for operations that create abstract
 * product objects.
 * 
 * Use the Abstract Factory pattern when:
 *   - A system should be independent of how its products are created, composed
 *     and represented.
 *   - A system should be configured with one of multiple families of products.
 *   - A family of related product objects is designated to be used together
 *     and you need to enforce this constraint.
 *   - You want to provide a class library of product, and you want to reveal
 *     just their interfaces, not their implementations.
 * 
 * Benefits:
 *   - It isolates concrete classes
 *   - It makes exchanging product families easy
 *   - It ptomotes consistency among products
 *   - Supporting new kind of products is difficult
 * 
 * Implementation (useful techniques)
 *  - Factorie as singleton
 */
public interface AbstractFactory {
    
}
