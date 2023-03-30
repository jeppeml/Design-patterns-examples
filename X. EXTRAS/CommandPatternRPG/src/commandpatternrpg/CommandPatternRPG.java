/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpatternrpg;

import commandpatternrpg.Command.FightAction;
import commandpatternrpg.Command.Fireball;
import commandpatternrpg.Command.Heal;
import commandpatternrpg.Command.Lightning;
import commandpatternrpg.Command.Undo;
import commandpatternrpg.Reciever.Dragon;
import commandpatternrpg.Reciever.Wizard;
import commandpatternrpg.invoker.GameManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jeppe
 */
public class CommandPatternRPG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Wizard jeppe = new Wizard(100, 13, "Jeppe");
        Dragon dragon = new Dragon(350, 0, "Dragonis");
        
        FightAction healJeppe = new Heal(jeppe, 25);
        FightAction fireballAtDragon = new Fireball(jeppe, 25, dragon);
        FightAction fireballFromDragon = new Fireball(dragon, 35, jeppe);
        FightAction lightningAtDragon = new Lightning(jeppe, 12, dragon);
        
        GameManager gm = new GameManager();
        gm.addAction(healJeppe);
        gm.addAction(fireballAtDragon);
        gm.addAction(fireballFromDragon);
        gm.addAction(lightningAtDragon);
        gm.addAction(fireballFromDragon);
        gm.addAction(new Undo(healJeppe));
                       
        while(gm.doNextAction()){
            System.out.println("");
            simulateAnim();
        }
    }
    
    private static void simulateAnim(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(CommandPatternRPG.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
