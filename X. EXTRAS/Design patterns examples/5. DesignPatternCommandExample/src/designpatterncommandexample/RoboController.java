/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterncommandexample;

import java.util.ArrayList;

/**
 *
 * @author jeppjleemoritzled
 */
public class RoboController {
    private IRobotCommand currentCommand;

    public RoboController() {
    }

    public RoboController(IRobotCommand currentCommand) {
        this.currentCommand = currentCommand;
    }

    public IRobotCommand getCurrentCommand() {
        return currentCommand;
    }

    public void setCurrentCommand(IRobotCommand currentCommand) {
        this.currentCommand = currentCommand;
    }

    public void executeCurrentCommand()
    {
        this.currentCommand.execute();
    }
   
}
