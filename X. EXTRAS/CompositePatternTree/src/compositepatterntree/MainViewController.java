/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepatterntree;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

/**
 *
 * @author Jeppe
 */
public class MainViewController implements Initializable {

    @FXML
    private Canvas myCanvas;
    
    private GraphicsContext gc;
    TextNode top;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        gc = myCanvas.getGraphicsContext2D();
        
        top = new TextNode("Rhellow!", gc, 300, 50);
        
        ImgNode sub1 = new ImgNode(new Image(getClass().getResourceAsStream("justin-bieber-avatar.png")), gc);
        
        top.addChild(
            new TextNode("Sub hello", gc),
            new TextNode(" hello", gc),
            new TextNode("Sub hello", gc),
            sub1
        );
        
        ImgNode sub2 = new ImgNode(new Image(getClass().getResourceAsStream("justin-bieber-avatar.png")), gc);
        
        sub1.addChild(
            new TextNode("Meew", gc),
            new TextNode("*GK*", gc),
            new TextNode("*SK*", gc),
            sub2
            );
        
        sub2.addChild(
            new TextNode("dsgsdgeww", gc),
            new TextNode("sdfsdgsdg", gc),
            new TextNode("Lorem Ipsem Dolor Est", gc)
            );
        
        top.drawNodes();
        
    }
    
    @FXML
    private void handleRemoveClick(ActionEvent event) {
        gc.clearRect(0, 0, 600, 600);
        
        top.addChild(new TextNode("Newone", gc));
        
        top.drawNodes();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

   
    
}
