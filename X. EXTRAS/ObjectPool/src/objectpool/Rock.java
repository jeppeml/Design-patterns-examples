/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectpool;

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
    private double direction; // in Radians
    
    private RockPool observerPool;
    private int scopeX;
    private int scopeY;

    public Rock(RockPool observerPool, int scopeX, int scopeY) {
        this.observerPool = observerPool;
        this.scopeX = scopeX;
        this.scopeY = scopeY;
    }
    
    public Rock(double x, double y, Image img, double speed, double direction, RockPool observerPool, int scopeX, int scopeY) {
        this.x = x;
        this.y = y;
        this.img = img;
        this.speed = speed;
        this.direction = direction;
        this.observerPool = observerPool;
        this.scopeX = scopeX;
        this.scopeY = scopeY;
    }

    public void outOfBoundsCheck(){
        if(x>scopeX || x<0 || y>scopeY || y<0)
        {
            observerPool.release(this);
        }
    }

    public void move() {
        double dx = Math.cos(direction)*speed;
        double dy = Math.sin(direction)*speed;
        this.x += dx;
        this.y += dy;
        outOfBoundsCheck();
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
    
}
