/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package milestone2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import java.io.IOException;
import javafx.scene.control.RadioButton;


/**
 *
 * @author briep
 */
public class Screen3Controller implements Initializable {
    
    @FXML
    private RadioButton circle1, circle2, square1, square2, triangle1,triangle2;
    private Button playbutton;
    

    @FXML
    private void player1Select (ActionEvent event) {
        
    }
    
    @FXML
     private void player2Select (ActionEvent event) {
        
    }
     
    
   @FXML
   private void playStart (ActionEvent event) throws IOException{
       Node node = (Node) event.getSource();
        Scene currentScene = node.getScene();
        Stage currentStage = (Stage) currentScene.getWindow();
        
        Parent root = FXMLLoader.load(getClass().getResource("Screen4.fxml"));
        Scene helpScene = new Scene(root);
        currentStage.hide();
        currentStage.setScene(helpScene);
        currentStage.show();   
   }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}