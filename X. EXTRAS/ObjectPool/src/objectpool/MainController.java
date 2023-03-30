/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectpool;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
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
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Canvas canvas = new Canvas(960, 539);
        mainPane.getChildren().add(canvas);
        
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        Image imgBackground = new Image("bg.jpg");
        gc.drawImage(imgBackground, 0, 0);

        Random rand = new Random();
        
        AnimationTimer t = new AnimationTimer() { // 60 fps
            @Override
            public void handle(long now) {
                gc.drawImage(imgBackground, 0, 0); // clear the screen
                RockPool.getInstance().createRock((int)canvas.getWidth(), (int)canvas.getHeight(), 
                        rand.nextInt(960), 0, 6, Math.PI*0.5, "rock.jpg", 25, 25);
                
                for (Rock rock : RockPool.getInstance().getRocks()) {
                    rock.move();
                    gc.drawImage(rock.getImg(), rock.getX(), rock.getY());
                }
            }
        };
        t.start();
    }    
    
    
    
}
