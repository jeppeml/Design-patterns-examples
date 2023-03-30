/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectpoolgameexample;

import javafx.scene.image.Image;

/**
 *
 * @author Jeppe
 */
public class Rock {
    private double x;
    private double y;
    private Image img;
    private double speed;
    private double direction; // Radians
    
    private RockPool pool;
    private int boundsX;
    private int boundsY;

    public Rock() {
    }

    public Rock(double x, double y, Image img, double speed, double direction, RockPool pool, int boundsX, int boundsY) {
        this.x = x;
        this.y = y;
        this.img = img;
        this.speed = speed;
        this.direction = direction;
        this.pool = pool;
        this.boundsX = boundsX;
        this.boundsY = boundsY;
    }

    public void checkIfOutOfBounds(){
        if(getX()<0 || getX()>boundsX ||
           getY()<0 || getY()>boundsY)
           {
                RockPool.getInstance().release(this);
           }
    }
    

    public void move(){
        double dx = Math.cos(direction)*speed;
        double dy = Math.sin(direction)*speed;
        x += dx;
        y += dy;
        
        checkIfOutOfBounds();
    }
    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    public RockPool getPool() {
        return pool;
    }

    public void setPool(RockPool pool) {
        this.pool = pool;
    }

    public int getBoundsX() {
        return boundsX;
    }

    public void setBoundsX(int boundsX) {
        this.boundsX = boundsX;
    }

    public int getBoundsY() {
        return boundsY;
    }

    public void setBoundsY(int boundsY) {
        this.boundsY = boundsY;
    }
    
    
    
}
