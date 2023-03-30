/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecoratorPattern;

/**
 *
 * @author jeppjleemoritzled
 */
public class AClassDecoratorPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Weapon gun = new AK47Weapon();
        Weapon gunWithSilencer = new Silencer(gun);
        Weapon gunWithSilencerAndCrazyAddon = new GrenadeLauncherWithScopeAndBazooka(gunWithSilencer);
        
        gun.Attack();
        gunWithSilencer.Attack();
        gunWithSilencerAndCrazyAddon.Attack();
               
    }
    
}
