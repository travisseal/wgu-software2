/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;

/**
 *
 * @author Travis
 */
public abstract class Person {
    
    protected ObservableValue<Integer> userId;
    protected StringProperty name;
    protected boolean isActive;
    protected StringProperty createDate;
    protected StringProperty lastUpdateBy;
    protected StringProperty lastUpdate;
    
    
    public void setName(String inName)
    {
        name = new SimpleStringProperty(inName);
    }
    
    public ObservableValue<String> getPartName()
   {
       return this.name;
   }
    
}
