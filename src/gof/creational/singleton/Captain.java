/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.creational.singleton;

/**
 *
 * Java Design Patterns: A hands on experience with real world examples
 * Chapter 1: Singleton pattern
 * 
 */
final class Captain{
    private static Captain captain;
    //We make the constructor private to prevent the use of "new"
    private Captain() { }
    public static synchronized Captain getCaptain(){
        // Lazy initialization
        if (captain == null){
            captain = new Captain();
            System.out.println("New captain is elected for your team.");
        }else{
            System.out.print("You already have a captain for your team.");
            System.out.println("Send him for the toss.");
        }
        return captain;
    }
}
