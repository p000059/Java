package Persistence.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.transaction.Transaction;

public class SingleConnection {

	private static String url = "jdbc:mysql://localhost:3306/dbcodes";
	private static String password = "mysql";
	private static String user = "DBUSER";
	private static Connection connection = null;

	protected Transaction transaction;
	
	static {
		connect();
	}
	
	private static void connect() {

		try {

			if (connection == null) {

				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection(url, user, password);
				connection.setAutoCommit(false);
			}
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}

	public static Connection openConnection() {
		
		return connection;
	}
	
	public static void closeConnection(Connection connection) {
		
		try {
			
			if(connection != null) {
				
				connection.close();
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}
