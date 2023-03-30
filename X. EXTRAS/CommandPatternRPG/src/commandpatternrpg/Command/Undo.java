/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpatternrpg.Command;

/**
 *
 * @author Jeppe
 */
public class Undo implements FightAction{
    private final FightAction action;

    public Undo(FightAction action) {
        this.action = action;
    }
    
    @Override
    public void execute() {
        action.undo();
    }

    @Override
    public void undo() { // REDO
        action.execute();    
    }
    
}
