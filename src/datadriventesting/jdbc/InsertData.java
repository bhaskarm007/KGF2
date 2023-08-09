package datadriventesting.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// Script to insert data into data base

public class InsertData {
	
public static void main(String[] args) throws SQLException {
	
	String dbUrl = "jdbc:mysql://localhost:3306/credentials";
	String dbUsername = "root";
	String dbPassword = "root";
	
	Connection con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
	String sqlQuery = "insert into details(username, password) values(?, ?);";
	PreparedStatement pstmt = con.prepareStatement(sqlQuery);
	
	pstmt.setString(1, "Rajinikanth");
	pstmt.setString(2, "Robo123");
	pstmt.execute();
	
	System.out.println("DONE...!!!");
	
}
}
