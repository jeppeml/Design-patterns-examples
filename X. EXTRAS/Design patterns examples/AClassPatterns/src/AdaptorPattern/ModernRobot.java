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
public class ModernRobot implements IRobot {

    @Override
    public void move(int x, int y) {
        System.out.println("Moving to (" + x + ", " + y+")");
    }

    @Override
    public void talk(String thingsToSay, int VoiceType) {
        System.out.println("Saying as [" + VoiceType + "]:" + thingsToSay);
    }
    
}
