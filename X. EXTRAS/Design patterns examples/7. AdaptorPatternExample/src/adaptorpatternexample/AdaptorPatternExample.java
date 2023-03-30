/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptorpatternexample;

/**
 *
 * @author Jeppe
 */
public class AdaptorPatternExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Robot rModern = new ModernRobot();
        Robot rLegacy = new AdaptorLegacyRobot(new OldLegacyRobot());
        
        rModern.move(0, 3, 6, 9);
        rLegacy.move(1, 5, 7, 3);
        
        rModern.talk("I'm modern ;()", 1);
        rLegacy.talk("I'm legacy ;()", 1);
        System.exit(0);
        
    }
    
}
