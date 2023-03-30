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
public class TalkCommand extends IRobotCommand{
    private Robot target;
    private String thingsToSay;

    public TalkCommand(Robot target, String thingsToSay) {
        this.target = target;
        this.thingsToSay = thingsToSay;
    }
    
    public TalkCommand(Robot target, String thingsToSay, int priority) {
        super.priority = priority;
        this.target = target;
        this.thingsToSay = thingsToSay;
    }
    @Override
    public void execute() {
        target.talk(thingsToSay);
    }
    
}
