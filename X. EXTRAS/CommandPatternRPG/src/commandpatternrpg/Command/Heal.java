/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpatternrpg.Command;

import commandpatternrpg.Reciever.Avatar;

/**
 *
 * @author Jeppe
 */
public class Heal implements FightAction{
    private Avatar target;
    private double hp;

    public Heal(Avatar target, double hp) {
        this.target = target;
        this.hp = hp;
    }
    
    @Override
    public void execute() {
        target.setHealth(target.getHealth() + hp);
        System.out.println(target.getName() + " healed for " + hp + " hp");
    }

    @Override
    public void undo() {
        target.setHealth(target.getHealth() - hp);
        System.out.println("undid healing for " + target.getName() +" "+ hp + " hp");
    }
    
}
