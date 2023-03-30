/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternobserverexample;

import java.util.ArrayList;

/**
 *
 * @author jeppjleemoritzled
 */
abstract class RobotObservable { // Subject

    protected ArrayList<RobotObserver> observers;

    public RobotObservable() {
        this.observers = new ArrayList<>();
    }

    public void attachObserver(RobotObserver o) {
        observers.add(o);
    }

    public void detachObserver(RobotObserver o) {
        observers.remove(o);
    }

    public abstract void notifyObservers(String message);
}
