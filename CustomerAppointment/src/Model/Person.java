/*
    This is the person class and datamodel

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
    
    public ObservableValue<String> getPersonName()
    {
        return this.name;
    }
    
}
