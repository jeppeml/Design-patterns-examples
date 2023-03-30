/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandPattern;

/**
 *
 * @author jeppjleemoritzled
 */
public class MoveCommand extends IRobotCommand{
    private Robot target;
    private int moveDistance;
    private Direction dir;

    public MoveCommand(Robot target, int moveDistance, Direction dir) {
        this.target = target;
        this.moveDistance = moveDistance;
        this.dir = dir;
    }
    
    public MoveCommand(Robot target, int moveDistance, Direction dir, int priority) {
        super.priority = priority;
        this.target = target;
        this.moveDistance = moveDistance;
        this.dir = dir;
    }
    
    @Override
    public void execute() {
        target.move(dir, moveDistance);
    }
    
}
