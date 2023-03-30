/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdaptorPattern;

/**
 *
 * @author jeppjleemoritzled
 */
public class AClassAdaptorPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IRobot modernRobot = new ModernRobot();
        IRobot legacyRobot = new LegacyRobotAdaptor(new OldLegacyRobot());
        
        modernRobot.move(24, 67);
        legacyRobot.move(15,90);
        
        modernRobot.talk("Hej mor ;)", 1);
        legacyRobot.talk("Hej legacy mor ;]", 1);
        System.exit(0);
    }
    
}
