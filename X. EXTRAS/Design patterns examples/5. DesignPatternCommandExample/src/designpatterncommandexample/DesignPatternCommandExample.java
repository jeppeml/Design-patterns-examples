/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterncommandexample;

import java.awt.Point;

/**
 *
 * @author jeppjleemoritzled
 */
public class DesignPatternCommandExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Robot r = new Robot(new Point(0, 0), RobotVoiceType.BOB);

        MoveForwardCommand moveUp = new MoveForwardCommand(r, 2, Direction.UP);
        TalkCommand sayHaHaCommand = new TalkCommand(r, "HA!, HA!, Stupid human", RobotVoiceType.RYAN);

        RoboController contr = new RoboController(moveUp);
        contr.executeCurrentCommand();

        contr.setCurrentCommand(sayHaHaCommand);
        contr.executeCurrentCommand();
    }

}
