/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleobserverpattern;

import java.util.Observable;

/**
 *
 * @author Jeppe
 */
public class Car extends Observable{
    public void doSomethingImportant(){
        System.out.println("Doing important stuff, need to notify someone");
        setChanged();
        notifyObservers();
    }
}
