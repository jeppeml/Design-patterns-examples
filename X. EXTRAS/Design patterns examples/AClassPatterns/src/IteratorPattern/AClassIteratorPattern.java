/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IteratorPattern;

import java.awt.Point;

/**
 *
 * @author jeppjleemoritzled
 */
public class AClassIteratorPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RobotArmy ra = new RobotArmy(new Robot(new Point(7,2), RobotVoiceType.BOB),
                                     new Robot(new Point(1,2), RobotVoiceType.RYAN));
        
        IIterator iter = ra.getIterator();
        while(iter.hasNext())
        {
            Robot r = (Robot)iter.next();
            r.talk("HELO=Robot");
        }
    }
    
}
