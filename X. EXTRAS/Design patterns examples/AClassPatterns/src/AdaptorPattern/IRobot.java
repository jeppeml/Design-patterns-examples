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
public interface IRobot {
    public void move(int x, int y);
    public void talk(String thingsToSay, int voiceType);
}
