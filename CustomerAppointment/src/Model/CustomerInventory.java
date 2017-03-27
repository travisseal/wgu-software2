/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Travis
 */
public class CustomerInventory {
    
    private static ObservableList<Customer> customerList = FXCollections.observableArrayList();
    
    public static void addCustomer(Customer cx)
    {
        customerList.add(cx);
    }
    static public ObservableList<Customer> getCustomers()
   {
       return customerList;
   }
    
}
