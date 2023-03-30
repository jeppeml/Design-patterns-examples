/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterncommandexample;

/**
 *
 * @author jeppjleemoritzled
 */
public class MoveForwardCommand implements IRobotCommand{
    private Robot target;
    private int moveDistance;
    private Direction dir;
    
    public MoveForwardCommand(Robot targetRobot, int moveDistance, Direction dir) {
        target = targetRobot;
        this.moveDistance = moveDistance;
        this.dir = dir;
    }
    @Override
    public void execute() {
        target.move(dir, moveDistance);
    }
    
}
