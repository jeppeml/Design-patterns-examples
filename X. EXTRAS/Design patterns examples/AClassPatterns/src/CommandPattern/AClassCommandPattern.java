/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandPattern;

import java.awt.Point;

/**
 *
 * @author jeppjleemoritzled
 */
public class AClassCommandPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Robot ryan = new Robot(new Point(0,0), RobotVoiceType.RYAN);
        
        TalkCommand sayHAHA = new TalkCommand(ryan,"HA!, HA!, Stupid human!", 11);
        MoveCommand moveUpTen = new MoveCommand(ryan,10,Direction.UP, -10);
        RoboController contr = new RoboController();
        
        contr.addCommand(moveUpTen);
        contr.addCommand(sayHAHA);
        
        contr.executeAndRemoveAllCommands();
        contr.executeAndRemoveAllCommands();
        
    }
    
}
