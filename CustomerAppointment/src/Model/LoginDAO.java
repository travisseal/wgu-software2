/*
    Login data access object.
    interfaces with the data object, and the user presentation layeer. 
    provides feedback from the database.

    Assummes that the DAO is inintialized

*/
package Model;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Travis
 */
public class LoginDAO {
         
    public static boolean selectRecordsFromTable(String inUserName,String inPassword) throws SQLException {

		Connection dbConnection = null;
		PreparedStatement preparedStatement = null;

		String selectSQL = "select `userName`, `password` from user where userName = ? and `password` = ?";

		try {
			dbConnection = ConnectionBuilderDAO.connection();
			preparedStatement = dbConnection.prepareStatement(selectSQL);
                        
                        String userName = "";
                        String password = "";
                       
			preparedStatement.setString (1, inUserName);
			preparedStatement.setString (2, inPassword);
                        
			// execute select SQL stetement
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {

                            userName = rs.getString("userName");
                            password = rs.getString("password");

			}
                        if(userName.isEmpty() || password.isEmpty())
                            return false;
                        else
                            return true;

		} catch (SQLException e) {

			System.out.println(e.getMessage());
                        
                        if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}
                        
                        return false;

		}

	}
}
