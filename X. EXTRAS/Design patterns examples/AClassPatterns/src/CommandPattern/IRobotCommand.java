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
public abstract class IRobotCommand implements Comparable {

    protected int priority = 0;

    public abstract void execute();

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
    
    @Override
    public int compareTo(Object o)
    {
        IRobotCommand otherCommand = (IRobotCommand) o;
        return otherCommand.priority - this.priority;
    }
}
