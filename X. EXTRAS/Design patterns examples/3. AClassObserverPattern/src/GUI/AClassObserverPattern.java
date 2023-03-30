/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BE.Robot;
import BE.RobotVoiceType;
import BLL.GameMap;
import java.awt.Point;

/**
 *
 * @author jeppjleemoritzled
 */
public class AClassObserverPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Robot r1 = new Robot(new Point(23,44), RobotVoiceType.BOB);
        Robot r2 = new Robot(new Point(234,67), RobotVoiceType.KATINKA);
        Robot r3 = new Robot(new Point(0,394), RobotVoiceType.RYAN);
        Robot r4 = new Robot(new Point(17,655), RobotVoiceType.BOB);
        
        GameMap gm = new GameMap();
        
        gm.addRobot(r1);
        gm.addRobot(r2);
        gm.addRobot(r3);
        gm.addRobot(r4);
        
        gm.notifyObservers("Alle med blå armbånd skal op nu!");
        
        gm.killRobot(r2);
        
        System.out.println(r3);
        
    }
    
}
