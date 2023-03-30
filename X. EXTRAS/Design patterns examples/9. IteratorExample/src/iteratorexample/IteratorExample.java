/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorexample;

/**
 *
 * @author Jeppe
 */
public class IteratorExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          RobotArmy army = new RobotArmy();  
            
          for(Iterator iter = army.getIterator(); iter.hasNext();){  
              Robot robot = (Robot)iter.next();  
              robot.talk("Hello", 0);  
           }      
    }
    
}
