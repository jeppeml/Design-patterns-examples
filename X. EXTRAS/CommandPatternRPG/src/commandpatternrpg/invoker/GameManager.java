/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpatternrpg.invoker;

import commandpatternrpg.Command.FightAction;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author Jeppe
 */
public class GameManager {
    private Deque<FightAction> actions = new ArrayDeque();
    
    public void addAction(FightAction action){
        actions.add(action);
    }
    
    public boolean doNextAction(){
        actions.pop().execute();
        return !actions.isEmpty();
    }
}
