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
public class Lightning implements FightAction{
    private Avatar source;
    private Avatar[] targets;
    private double damage;

    public Lightning(Avatar source, double damage, Avatar... targets) {
        this.source = source;
        this.targets = targets;
        this.damage = damage;
    }
    
    @Override
    public void execute() {
        for (Avatar target : targets) {
            double dmg = damage - target.getShield();
            if(dmg>0){
                System.out.println(dmg + " lightning damage taken by " + target.getName());
                target.setHealth(target.getHealth()-dmg);
            }
        }
        
    }

    @Override
    public void undo() {
        for (Avatar target : targets) {
            double dmg = damage - target.getShield();
            if(dmg>0){
                System.out.println("Undid " + dmg + " lightning damage by " + target.getName());
                target.setHealth(target.getHealth()+dmg);
            }
        }
    }
    
}
