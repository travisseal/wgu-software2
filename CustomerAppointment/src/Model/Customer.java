/*
 * Concrete implementation of the Customer user
 */
package Model;

import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;

/**
 *
 * @author Travis
 */
public class Customer extends Person{
    
    private StringProperty address;
    private ObservableValue<Integer> addressId;
    
}
