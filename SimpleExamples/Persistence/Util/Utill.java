package Persistence.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Utill {

	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/dbcodes";
	private static final String USER = "DBUSER";
	private static final String PASSWORD = "mysql";

	protected static Connection connection;
	protected static PreparedStatement preparedStatement;
	protected static ResultSet resultSet;

	public static Connection openConnection() throws Exception {

		try {

			Class.forName(DRIVER);

		} catch (ClassNotFoundException ex) {

			ex.printStackTrace();
		}

		try {

			connection = DriverManager.getConnection(URL, USER, PASSWORD);

		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return connection;
	}

	public static void closeConnection() throws Exception {

		try {

			if ((connection != null)) {

				connection.close();
			}

			if ((preparedStatement != null)) {

				preparedStatement.close();
			}

			if ((resultSet != null)) {

				resultSet.close();
			}

		} catch (SQLException ex) {

			ex.printStackTrace();
		}
	}
}
