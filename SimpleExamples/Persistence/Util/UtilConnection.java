package Persistence.Util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UtilConnection {

	protected Connection connection;
	protected PreparedStatement preparedStatement;
	protected ResultSet resultSet;
	protected CallableStatement callableStatement;

	public void openConnnection() {

		String url = "jdbc:mysql://localhost:3306/dbcodes";
		String user = "DBUSER";
		String password = "mysql";
		String driver = "com.mysql.cj.jdbc.Driver";

		try {

			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);

		} catch (Exception ex) {

			ex.printStackTrace();
		}
	}

	public void closeConnection() throws SQLException {

		connection.close();
	}
}
