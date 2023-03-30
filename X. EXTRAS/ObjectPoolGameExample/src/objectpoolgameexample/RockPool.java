/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectpoolgameexample;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import javafx.scene.image.Image;

/**
 *
 * @author Jeppe
 */
public class RockPool {
    private List<Rock> rocks = new CopyOnWriteArrayList();
    private Deque<Rock> released = new ArrayDeque();
    
    private static RockPool instance;

    public static RockPool getInstance(){
        if(instance==null)
            instance = new RockPool();
        return instance;
    }
    
    private RockPool() {
    }

    public List<Rock> getRocks() {
        return rocks;
    }
    
    public void release(Rock rock){
        rocks.remove(rock);
        released.add(rock);
    }
    
    public void createRock(double x, double y, double speed, double direction, String imagePath, 
            int imageH, int imageW, int boundsX, int boundsY){
        System.out.println("Rocks: " + rocks.size());
        System.out.println("Released: " + released.size());
        System.out.println("");
        
        Rock rock;
        if(released.isEmpty()){
            Image imgRock = new Image(imagePath, imageH,imageW,true,true);
            rock = new Rock(x, y, imgRock, speed, direction, this,boundsX,boundsY);
        }
        else{
            rock = released.poll();
            rock.setDirection(direction);
            rock.setSpeed(speed);
            rock.setX(x);
            rock.setY(y);
            //rock.setImg(imgRock);
        }
        rocks.add(rock);
        
    }
    
    
    
}
