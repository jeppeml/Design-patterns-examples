/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternobserverexample;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author jeppjleemoritzled
 */
public class GameMap extends RobotObservable {

    private ArrayList<Robot> robots;

    public GameMap() {
        robots = new ArrayList<>();
    }

    public void addRobot(Robot robot) {
        robots.add(robot);
        super.attachObserver(robot);
    }

    public void killRobot(Robot robot) {
        int robotId = robot.hashCode();
        System.out.println("Robot will now die: " + robotId);
        robots.remove(robot);
        observers.remove(robot);
        notifyObservers("Robot is dead: " + robotId);
    }

    @Override
    public void notifyObservers(String message) {
        System.out.println("Notifying all observers");
        for (RobotObserver robot : super.observers) {
            robot.update(message);
        }
    }
}
