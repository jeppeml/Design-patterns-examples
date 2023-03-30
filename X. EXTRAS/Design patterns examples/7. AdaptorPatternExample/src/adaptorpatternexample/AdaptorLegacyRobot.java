/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptorpatternexample;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jeppe
 */
public class AdaptorLegacyRobot implements Robot {

    private OldLegacyRobot oldLegacyRobot;

    public AdaptorLegacyRobot(OldLegacyRobot oldLegacyRobot) {
        this.oldLegacyRobot = oldLegacyRobot;
    }

    @Override
    public void move(int x0, int y0, int x1, int y1) {
        int direction=0; 
        
        if (x0 < x1) {
            direction = 1;
        } else {
            direction = 2;
        }
        if (y0 < y1) {
            direction = 3;
        } else {
            direction = 4;
        }
        oldLegacyRobot.direction = direction;
        oldLegacyRobot.move(3);
    }

    @Override
    public void talk(String thingsToSay, int voiceType) {
        String voiceString;
        if (voiceType==1)
            voiceString = "££PETE££";
        else
            voiceString = "££BOB££";
        oldLegacyRobot.speakBuffer=(voiceString+thingsToSay).toCharArray();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException ex) {
            Logger.getLogger(AdaptorLegacyRobot.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
