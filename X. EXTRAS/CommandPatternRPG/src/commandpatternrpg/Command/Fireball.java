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
public class Fireball implements FightAction{
    private Avatar source;
    private Avatar target;
    private double damage;

    public Fireball(Avatar source, double damage, Avatar target) {
        this.source = source;
        this.target = target;
        this.damage = damage;
    }
        
    @Override
    public void execute() {
       double dmg = damage - target.getShield();
       if(dmg>0){
           System.out.println(dmg + " fire damage taken by " + target.getName());
           target.setHealth(target.getHealth()-dmg);
       }
    }

    @Override
    public void undo() {
       double dmg = damage - target.getShield();
       if(dmg>0){
           System.out.println("Undid " + dmg + " fire damage by " + target.getName());
           target.setHealth(target.getHealth()+dmg);
       }
    }
    
}
