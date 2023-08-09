package datadriventesting.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
//import java.sql.Connection;
import java.sql.Statement;


// Script to create DatBase Library
public class DatabaseLibrary {
	
	static String dbUrl = "jdbc:mysql://localhost:3306/";
	static String dbUsername = "root";
	static String dbPassword = "root";
	Connection con;	
	Statement stmt;
	
	public DatabaseLibrary(String dbName) {
		try {
			con = DriverManager.getConnection(dbUrl+dbName, dbUsername, dbPassword);
			stmt = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
     }
	public ResultSet getData(String sqlQuery) {
		try {
			return stmt.executeQuery(sqlQuery);
		}catch (SQLException e) {
			e.printStackTrace();
		    return null;
	}
}
	public void insertData(String sqlQuery, String[][] sarr) {
		try {
			PreparedStatement pstmt = con.prepareStatement(sqlQuery);
			
			for (int i = 0; i <=sarr.length-1; i++) {
				pstmt.setString(1, sarr[i][0]);
				pstmt.setString(2, sarr[i][1]);
				pstmt.execute();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			}
		}
	}
