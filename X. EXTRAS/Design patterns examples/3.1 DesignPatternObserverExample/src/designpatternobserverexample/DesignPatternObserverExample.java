/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternobserverexample;

import java.awt.Point;

/**
 *
 * @author jeppjleemoritzled
 */
public class DesignPatternObserverExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Robot r1 = new Robot(new Point(19, 456), RobotVoiceType.BOB);
        Robot r2 = new Robot(new Point(32, 23), RobotVoiceType.RYAN);
        Robot r3 = new Robot(new Point(123, 223), RobotVoiceType.BOB);

        GameMap gamemap = new GameMap();
        gamemap.addRobot(r1);
        gamemap.addRobot(r2);
        gamemap.addRobot(r3);

        gamemap.notifyObservers("All robots must die!");

        gamemap.killRobot(r3);

        //gamemap.killRobots();
    }

}
