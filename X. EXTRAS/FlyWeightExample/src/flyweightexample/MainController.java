/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweightexample;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Jeppe
 */
public class MainController implements Initializable {
    
    @FXML
    private AnchorPane mainPane;
    @FXML
    private Button button;
    Canvas canvas;
    GraphicsContext gc;
    @FXML
    private Button button1;
        
    private int getRandSize(Random rand){
        return (rand.nextInt(2)+1)*15; // 15 30 45
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        canvas = new Canvas(800, 560);
        mainPane.getChildren().add(canvas);
        gc = canvas.getGraphicsContext2D();
    }    

    @FXML
    private void withFlyClick(ActionEvent event) {
        long start = System.nanoTime();
        Random rand = new Random();
        LadybugFactory fact = new LadybugFactory("ladybug.png");
        for (int i = 0; i < 1_000; i++) {
            int size = getRandSize(rand);
            Ladybug lb = fact.create(size);
            gc.drawImage(lb.getImg(), rand.nextInt((int)canvas.getWidth()), rand.nextInt((int)canvas.getHeight()));
        }
        long end = System.nanoTime();
        System.out.println("Time: " + (end-start)/1_000_000 + " ms");
    }

    @FXML
    private void noFlyClick(ActionEvent event) {
        long start = System.nanoTime();
        Random rand = new Random();
        for (int i = 0; i < 1_000; i++) {
            int size = getRandSize(rand);
            Image image = new Image("ladybug.png", size, size, true, true); // slow 
            gc.drawImage(image, rand.nextInt((int)canvas.getWidth()), rand.nextInt((int)canvas.getHeight()));
        }
        long end = System.nanoTime();
        System.out.println("Time: " + (end-start)/1_000_000 + " ms");
    }
    
}
