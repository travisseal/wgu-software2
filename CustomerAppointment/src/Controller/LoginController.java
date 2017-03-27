/*
 * Purpose:
   Handles user login. Displays errors in two languages.
 */
package Controller;

import Model.ConnectionBuilderDAO;
import Model.LoginDAO;
import Model.UsersLocation;
import java.net.URL;
import java.util.Calendar;
import java.util.ResourceBundle;
import java.util.TimeZone;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Travis
 */
public class LoginController implements Initializable {

   @FXML TextField loginFormUserNameTxtField;
   @FXML Label connectionLabel;
   @FXML Label dateTimeLabel;
   @FXML TextField userNameField;
   @FXML PasswordField passwordField;
  
   
   
   private String userName;
   private String password;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        try
        {
            if(ConnectionBuilderDAO.getInstance()!= null)
            {
                connectionLabel.setText("Connected");
            }
            else
            {
                connectionLabel.setText("Not Connected");

            }
           
            
         
            dateTimeLabel.setText(UsersLocation.getDisplayName() + "\n" + UsersLocation.getTimeZone());
            
            
            
            
                  
        }
        catch(Exception e)
        {
            System.err.println(e.toString());
        }
        
       
    }

    //find user
    public boolean getUser()
    {
        try
        { 
            userName = userNameField.getText();
            password = passwordField.getText();
    
           if(LoginDAO.selectRecordsFromTable(userName,password))
               loadNextStage();
               
           else
               throw new Exception("faild to find user");
            return true;
        }
        catch(Exception e)
        {
            badLoginMessage();
            return false;
        }
    }
 
    
    //error message for bad login
    private void badLoginMessage()
    {
        try
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Bad username / password combination " + "\n" + "Неверный пароль и имя пользователя" + "\n" + "Contraseña incorrecta y nombre de usuario");
            alert.setContentText("Please try your password and username again");
            alert.show();
        
        }
        catch (Exception ex)
        {
        
        }
    }
    
    private void loadNextStage()
    {
         try
            {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/View/MaintainCxData.fxml"));
                Parent root2 = (Parent) fxmlLoader.load();
                Stage stage2 = new Stage();
                stage2.setScene(new Scene(root2));  
                stage2.show();


            }
            catch(Exception e)
            {
                System.err.println(e.toString());
            }
        
    }
    
    //check users location (use UsersLocation model)
    
}
