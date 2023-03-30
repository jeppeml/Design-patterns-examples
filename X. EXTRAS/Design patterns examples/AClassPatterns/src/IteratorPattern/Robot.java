/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IteratorPattern;

import java.awt.Point;
import java.text.Collator;

/**
 *
 * @author jeppjleemoritzled
 */
public class Robot implements Comparable{

    private Point location;
    private RobotVoiceType roboVoice;
    private int robotId;

    public Robot(Point location, RobotVoiceType roboVoice) {
        this.location = location;
        this.roboVoice = roboVoice;
    }
    
    @Override
    public int compareTo(Object o) {
        Robot otherRobot = (Robot) o;
        if(robotId == otherRobot.getRobotId())
            return 0;
        else if(otherRobot.getRobotId() > robotId) return 1;
        else return -1;
    }

    public int getRobotId() {
        return robotId;
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
        Robot r1 = new Robot(location, roboVoice);
        Robot r2 = new Robot(location, roboVoice);
       
    }

   

}
