/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorexample;

/**
 *
 * @author Jeppe
 */
public interface Robot {
    public void move(int x0, int y0, int x1, int y1);
    public void talk(String thingsToSay, int voiceType);
}
