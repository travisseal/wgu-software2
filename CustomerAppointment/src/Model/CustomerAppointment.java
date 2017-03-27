/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.time.ZonedDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.ConditionalFeature.FXML;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Travis
 */
public class CustomerAppointment extends Application {
    
    private static Stage stage1;
    
    @Override
    public void start(Stage primaryStage) {
        
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/View/Login.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            stage1 = new Stage();
            stage1.setScene(new Scene(root1));  
            stage1.show();
            
            
        }
        catch(Exception e)
        {
            System.err.println(e.toString());
        }
        
       
    }
    
    //hide the first stage window
    public static void hideMainStage()
    {
        stage1.hide();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
