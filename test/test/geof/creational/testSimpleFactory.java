/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.geof.creational;

import org.junit.Test;
import static org.junit.Assert.*;
import others.simpleFactory.Animal;
import others.simpleFactory.SimpleFactory;

/**
 *
 * @author David_Puerta
 */
public class testSimpleFactory {
    
    @Test
    public void testSimpleFactory() {
        Animal preferredType = null;
        SimpleFactory simpleFactory = new SimpleFactory();
        preferredType = simpleFactory.createAnimal(1);
        assertNotNull(preferredType);
        preferredType.speak();
        preferredType.preferredAction();
        
        preferredType = simpleFactory.createAnimal(0);
        assertNotNull(preferredType);
        preferredType.speak();
        preferredType.preferredAction();
    }
    
}
