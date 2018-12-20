/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package others.simpleFactory;

/**
 *
 * @author David_Puerta
 */
public class Tiger implements Animal{

    @Override
    public void speak() {
        System.out.println("Tiger says: Halum");
    }

    @Override
    public void preferredAction() {
        System.out.println("Tiger prefers hunting...");
    }
    
}
