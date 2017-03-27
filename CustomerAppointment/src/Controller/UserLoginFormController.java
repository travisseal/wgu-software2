/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CustomerAppointment;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableView;
import Model.*;
import javafx.scene.control.TableColumn;

/**
 * FXML Controller class
 *
 * @author Travis
 */
public class UserLoginFormController implements Initializable {

 @FXML static TableView customerList;
 @FXML static TableColumn<Customer,String> customerNameColumn;
 @FXML static TableColumn<Customer,String> addressColumn;
 @FXML static TableColumn<Customer,String> phoneColumn;
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("bingo");
        CustomerAppointment.hideMainStage();
        updatePartsTableView();
    }    
    
    
    //update parts table 
    public static void updatePartsTableView()
    {
        try
        {
            customerNameColumn.setCellValueFactory(cellData -> cellData.getValue().getName());      
//            addressColumn.setCellValueFactory(cellData -> cellData.getValue().getAddress());
//            phoneColumn.setCellValueFactory(cellData -> cellData.getValue().getPhone());
            
            customerList.setItems(CustomerInventory.getCustomers());
        }
        catch(Exception ex)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(ex.toString());
            alert.show();
        }
    }
    
}
