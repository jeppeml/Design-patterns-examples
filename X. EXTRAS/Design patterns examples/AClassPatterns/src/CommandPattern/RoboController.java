/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandPattern;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author jeppjleemoritzled
 */
public class RoboController {

    private IRobotCommand currentCommand;
    private Queue<IRobotCommand> commandQueue;

    public RoboController() {
        commandQueue = new PriorityQueue<>();
    }

    
    public void addCommand(IRobotCommand command)
    {
        commandQueue.add(command);
    }
    
    public void executeAndRemoveAllCommands()
    {
        while(commandQueue.size()>0)
            commandQueue.poll().execute();
    }
}
