/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BE;

import BLL.RobotObserver;
import java.awt.Point;

/**
 *
 * @author jeppjleemoritzled
 */
public class Robot implements RobotObserver{

    private Point location;
    private RobotVoiceType roboVoice;

    public Robot(Point location, RobotVoiceType roboVoice) {
        this.location = location;
        this.roboVoice = roboVoice;
    }

    public void move(Direction dir, int distance) {
        switch (dir) {
            case UP:
                location.y += distance;
                break;
            case DOWN:
                location.y -= distance;
                break;
            case RIGHT:
                location.x += distance;
                break;
            case LEFT:
                location.x -= distance;
                break;
        }
        System.out.println("Moving " + distance + " pixels going " + dir.name());
        System.out.println("My new location: " + "(" + location.x + ", " + location.y + ")");
    }
    
    public void talk(String sayString)
    {
        System.out.println("[Saying with voice: " + roboVoice.name() + "] " + sayString);
    }
    
    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public RobotVoiceType getRoboVoice() {
        return roboVoice;
    }

    public void setRoboVoice(RobotVoiceType roboVoice) {
        this.roboVoice = roboVoice;
    }
    public void die()
    {
        talk("i'm dying... arghhhhh! Shiver me timbers!");
    }
    @Override
    public void update(String message) {
        talk("Observer robot: " + this.hashCode() + " getting message from observable: "+ message);
       
    }

    @Override
    public String toString() {
        return "Robot number " + this.hashCode() + " voice " + this.roboVoice.name() + 
                " location " + location.toString();
    }
    
    
    
    
}
