package vz.jsf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
		// Load the Driver
		// Connection (username, password, address of DB)
		// Statement from connection
		// Generic Statement
		// Prepared Statement with placeholders - used to precompile query
		// Callable Statement with placeholders - usually for stored procs
		// Execute SQL on statement
		// Get ResultSet from Statement
		// Walk through ResultSet
		// Close ResultSet, Statement, and Connection
		// Class.forName("com.mysql.jdbc.Driver");
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			Connection connection = null;
			Statement statement = null;
			try {
				connection = DriverManager.getConnection("jdbc:derby:Weasley");
				statement = connection.createStatement();
				ResultSet resultSet = statement
						.executeQuery("SELECT * FROM customer");
				while (resultSet.next()) {
					Long customerId = resultSet.getLong("customerId");
					String firstName = resultSet.getString("firstName");
					String lastName = resultSet.getString("lastName");
					String phoneNumber = resultSet.getString("phoneNumber");
					String email = resultSet.getString("email");
					Customer c = new Customer(customerId, firstName, lastName,
							phoneNumber, email);
					System.out.println(c);
				}
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if (statement != null) {
						statement.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					if (connection != null) {
						connection.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
