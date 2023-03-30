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
public class TalkCommand implements IRobotCommand{
    private Robot target;
    private String thingsToSay;
    private RobotVoiceType voiceType;

    public TalkCommand(Robot target, String thingsToSay, RobotVoiceType voiceType) {
        this.target = target;
        this.thingsToSay = thingsToSay;
        this.voiceType = voiceType;
    }
    
    @Override
    public void execute() {
        target.talk(thingsToSay, voiceType);
    }
    
}
