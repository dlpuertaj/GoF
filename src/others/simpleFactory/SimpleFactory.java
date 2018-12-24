/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package others.simpleFactory;

/**
 *
 * In object-oriented programming, a factory is a special kind of object that can create
 * other objects. A factory can be invoked in many ways, but most often, it uses a method
 * that can return objects with varying prototypes. Any subroutine that can help create
 * these new objects is considered a factory. The ultimate purpose of using a factory
 * method is to abstract the object creational mechanism (or process) from the consumers
 * of the application.
 */
public class SimpleFactory {
    public Animal createAnimal(int choice){
        Animal intendedAnimal = null;
        //System.out.println("Enter your choice (0 for Dog or 1 for Tiger)");
        
        //Scanner input = new Scanner(System.in);
        
        //int choice = Integer.parseInt(input.nextLine());
        //System.out.println("You have entered : " + choice);
        
        switch(choice){
            case 0:
                intendedAnimal = new ConcreteDog();
                break;
            case 1:
                intendedAnimal = new ConcreteTiger();
                break;
            default:
                System.out.println("You must enter either 0 or 1");
                throw new IllegalArgumentException("Your choice tries to create an unknown Animal");
        }
        return intendedAnimal;
    }
}
