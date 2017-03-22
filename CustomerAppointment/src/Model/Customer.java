/*
 * Concrete implementation of the Customer user
 */
package Model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;

/**
 *
 * @author Travis
 */
public class Customer extends Person{
    
    private StringProperty address;
    private ObservableValue<Integer> addressId;
    
    public ObservableValue<String> getAddress()
    {
        return this.address;
    }
    
    public void setAddress(String addr)
    {
        this.address = new SimpleStringProperty(addr);
    }
    
    public void setAddressId(int id)
    {
        this.addressId = new SimpleIntegerProperty(id).asObject();
    }
    public void setActive (Boolean act)
    {
        isActive = act;
    }
    
    public void setCreateDate(StringProperty cDate)
    {
        createDate = cDate;
    }
}
