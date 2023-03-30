/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.util.ArrayList;

/**
 *
 * @author jeppjleemoritzled
 */
public abstract class RobotObservable {
    protected ArrayList<RobotObserver> observers;

    public RobotObservable() {
        this.observers = new ArrayList<>();
    }
    
    public void attachObserver(RobotObserver observer)
    {
        observers.add(observer);
    }
    
    public void detachObserver(RobotObserver observer)
    {
        observers.remove(observer);
    }
    
    public abstract void notifyObservers(String message);
    
}
