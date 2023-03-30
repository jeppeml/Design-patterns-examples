/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BE.Robot;
import java.util.ArrayList;

/**
 *
 * @author jeppjleemoritzled
 */
public class GameMap extends RobotObservable{
    private ArrayList<Robot> robots;

    public GameMap() {
        this.robots = new ArrayList<>();
    }
    
    public void addRobot(Robot robot)
    {
        robots.add(robot);
        super.observers.add(robot);
    }
    
    public void killRobot(Robot robot)
    {
        System.out.println("You must die! I alone am best! All your base are belong to us!");
        System.out.println("Killing a robot...");
        robots.remove(robot);
        observers.remove(robot);
        robot.die();
        notifyObservers("Robot " + robot.hashCode() + " has died");
              
    }
    
    @Override
    public void notifyObservers(String message) {
        System.out.println("Notifying all observers...");
        for(RobotObserver ro : super.observers)
            ro.update(message);
    }
    
}
