/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdaptorPattern;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jeppjleemoritzled
 */
public class LegacyRobotAdaptor implements IRobot{
    private OldLegacyRobot robot;

    public LegacyRobotAdaptor(OldLegacyRobot robot) {
        this.robot = robot;
    }
    
    @Override
    public void move(int x, int y) {
        int direction = 0;
        if(x>0 && y>0)
            direction = 1;
        else if (x<=0 && y>0)
            direction = 2;
        else if (x>0 && y<=0)
            direction = 3;
        else 
            direction = 4;
        
        robot.direction = direction;
        robot.speed = 3;
        robot.startMoving();
        robot.stopMoving();
    }

    @Override
    public void talk(String thingsToSay, int voiceType) {
        String voiceString;
        
        if (voiceType==1)
            voiceString = "##BENNY##";
        else
            voiceString = "##BIRGER##";
        
        robot.speakBuffer = (voiceString + thingsToSay).toCharArray();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException ex) {
            Logger.getLogger(LegacyRobotAdaptor.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
}
