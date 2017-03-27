/*
 * Purpose: Determins users location. Provides interfaces for reading date/time. Static object is returned to be shared amungst all other objects.
 */
package Model;

import java.util.Calendar;
import java.util.TimeZone;

/**
 *
 * @author Travis
 */
public class UsersLocation {
    
   static TimeZone tz = Calendar.getInstance().getTimeZone();  ;
    
    public static String getDisplayName()
    {
        return tz.getDisplayName();
    }
    
    public static String getTimeZone()
    {
        return tz.getID();
    }
    
}
