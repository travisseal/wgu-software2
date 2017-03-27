/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Travis
 */
public class CustomerDAO {
      
    public static void selectCustomerRecordsFromDatabase() throws SQLException {

		Connection dbConnection = null;
		PreparedStatement preparedStatement = null;

		String selectSQL = "select * from v_customer_view;";

		try {
                        
                        
                    
			dbConnection = ConnectionBuilderDAO.connection();
			preparedStatement = dbConnection.prepareStatement(selectSQL);
                 
                    	ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
                            Customer myCustomer = new Customer();

                            myCustomer.setName(rs.getString("customerName"));
                            myCustomer.setAddress(rs.getString("address"));
                            myCustomer.setPhoneNumber(rs.getString("phone"));
                            
                            CustomerInventory.addCustomer(myCustomer);
			}
                       
		} catch (SQLException e) {

			System.out.println(e.getMessage());
                        
                        if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}
                        
                      
		}

	}
}
