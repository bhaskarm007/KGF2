package datadriventesting.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// Script to Understand how to insert into Arrays to dB

public class InsertArraysToDataBase {
	
public static void main(String[] args) throws SQLException {
	
	String [][] sarr = {
			{"admin",   "manager"},
			{"trainee", "trainee"},
			{"hemanth", "hemanth123"},
			{"bharath", "bharath123"},
			{"karna",   "karna123"},
			{"mahibh",  "mahibh007"}
	};
	
	String dbUrl = "jdbc:mysql://localhost:3306/mycredentials";
	String dbUsername = "root";
	String dbPassword = "root";
	
	Connection con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
	String sqlQuery = "insert into details(username, password) values(?, ?);";
	PreparedStatement pstmt = con.prepareStatement(sqlQuery);
	
	for(int i=0;i<=sarr.length-1;i++) {
		pstmt.setString(1, sarr[i][0]);
		pstmt.setString(2, sarr[i][1]);
		pstmt.execute();
	}
	System.out.println("DONE...!!");
   }
}

// mySql data 
/*
 create database mycredentials;
 create table details (username varchar(20), password varchar(20));
*/
