/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectpool;

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
    private List<Rock> rocks = new CopyOnWriteArrayList<>();
    private Deque<Rock> released = new ArrayDeque<>();
    int countFrames = 0;

    private static RockPool instance;
    
    private RockPool() {
    }
    
    public static RockPool getInstance(){
        if(instance==null)
            instance = new RockPool();
        return instance;
    }
    
    public void createRock(int scopeX, int scopeY, double x, double y, double speed, double directionRadians, String imagePath, int imageH, int imageW){
        Rock rock;
        System.out.println("Rocks: " + rocks.size());
        System.out.println("Released: " + released.size());
        System.out.println("");
        if(released.isEmpty())
        {
            Image imgRock = new Image(imagePath, imageH, imageW, true, true);
            rock = new Rock(x, y, imgRock, speed, directionRadians, this, scopeX, scopeY);
        }
        else
        {
            // reuse
            rock = released.poll();
            rock.setDirection(directionRadians);
            rock.setSpeed(speed);
            rock.setX(x);
            rock.setY(y);
        }   
        
        rocks.add(rock);
    }
    
    public void release(Rock rock){
        released.add(rock);
        rocks.remove(rock);
    }

    public List<Rock> getRocks() {
        return rocks;
    }
    
    
}
