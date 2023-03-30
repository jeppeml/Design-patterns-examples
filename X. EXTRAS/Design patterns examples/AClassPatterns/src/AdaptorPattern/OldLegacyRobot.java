/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdaptorPattern;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author jeppjleemoritzled
 */
public class OldLegacyRobot {
    public int speed;
    public int direction;
    public char[] speakBuffer;
    
    private Timer timer;

    public OldLegacyRobot() {
        speakBuffer = new char[0];
        timer = new Timer();
        timer.schedule(new TalkTimer(this), 1000);
    }
    
    public void startMoving()
    {
        System.out.println("Moving speed: " + speed + " direction "+ direction);
    }
    
    public void stopMoving()
    {
        System.out.println("Stopping now");
        speed = 0;
    }
    
    public void jump(int howHigh)
    {
        System.out.println("I'm jumping " + howHigh);
    }

    protected void talkViewer() {
        if(speakBuffer.length>0)
        {
            System.out.println("Saying : " + new String(speakBuffer));
            speakBuffer = new char[0];
        }
    }
    
    private class TalkTimer extends TimerTask{
        private OldLegacyRobot roboto;

        public TalkTimer(OldLegacyRobot roboto) {
            this.roboto = roboto;
        }
        
        @Override
        public void run() {
            roboto.talkViewer();
        }
        
    }
    
    
}
