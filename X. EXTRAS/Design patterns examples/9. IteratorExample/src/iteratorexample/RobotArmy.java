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
public class RobotArmy implements Container {  
public Robot[] robots={new ModernRobot(), new ModernRobot(),new ModernRobot(),new ModernRobot(),new ModernRobot(),new ModernRobot()};   
      
@Override  
    public Iterator getIterator() {  
        return new RobotIteratorCollection() ;  
    }  
    private class RobotIteratorCollection implements Iterator{  
        int i;  
        @Override  
        public boolean hasNext() {  
            return i<robots.length;  
        }  
        @Override  
        public Object next() {  
            if(this.hasNext()){  
                return robots[i++];  
            }  
            return null;      
        }  
    }  
}  

