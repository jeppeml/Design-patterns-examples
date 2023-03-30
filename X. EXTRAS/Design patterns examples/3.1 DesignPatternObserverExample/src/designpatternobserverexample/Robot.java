/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternobserverexample;

import java.awt.Point;

/**
 *
 * @author jeppjleemoritzled
 */
public class Robot implements RobotObserver { // Reciever

    private Point pLocation;
    private RobotVoiceType roboVoice;

    public Point getpLocation() {
        return pLocation;
    }

    public void setpLocation(Point pLocation) {
        this.pLocation = pLocation;
    }

    public RobotVoiceType getRoboVoice() {
        return roboVoice;
    }

    public void setRoboVoice(RobotVoiceType roboVoice) {
        this.roboVoice = roboVoice;
    }

    public Robot(Point pLocation, RobotVoiceType roboVoice) {
        this.pLocation = pLocation;
        this.roboVoice = roboVoice;
    }

    public void move(Direction dir, int distance) {
        switch (dir) {
            case UP:
                pLocation.y += distance;
                break;
            case DOWN:
                pLocation.y -= distance;
                break;
            case LEFT:
                pLocation.x -= distance;
                break;
            case RIGHT:
                pLocation.x += distance;
                break;

        }
        System.out.println("Moving " + distance + " pixels going " + dir.name());
        System.out.println("My new location: " + "(" + pLocation.x + ", " + pLocation.y + ")");
    }

    public void talk(String sayString) {
        System.out.println("[In " + roboVoice.name() + "'s voice saying] " + sayString);
    }

    @Override
    public void update(String message) {
        talk("Observable " + this.hashCode() + " saying: " + "\u001B[31m" + message + "\u001B[0m");
    }
}
