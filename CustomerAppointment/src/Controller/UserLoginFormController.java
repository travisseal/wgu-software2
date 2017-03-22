/*
 * This controller is for the user login

    1. Determine the users location
    2. Translate errors into 2 languages

 */
package Controller;

import java.net.URL;
import java.time.ZonedDateTime;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Travis
 */
public class UserLoginFormController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    private String calculateUsersLocation()
    {
        return ZonedDateTime.now().toString();
    }
}
