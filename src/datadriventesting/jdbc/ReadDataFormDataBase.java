package datadriventesting.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// Script to understand how to read data from dB

public class ReadDataFormDataBase {

	public static void main(String[] args) throws SQLException {
		
		String dbUrl = "jdbc:mysql://localhost:3306/credentials";
		String username = "root";
		String password = "root";
		
		Connection con = DriverManager.getConnection(dbUrl, username, password);
	// interface	
		Statement stmt = con.createStatement();
		
		String sqlQuery = "select * from test1;";
		
		ResultSet rs = stmt.executeQuery(sqlQuery);
		
		while(rs.next()) {
			System.out.print(rs.getString("username")+"  ");
			System.out.println(rs.getString("password"));
		}
	}
}
// mySql data

/*
 create database credentials;
create table test1(username varcharacter(20), password varcharacter(10));
select * from test1;
insert into test1 values('lion','lion@123');
insert into test1 values('king','king@123');
insert into test1 values('queen','queen@123');
insert into test1 values('karna','karna@123');
insert into test1 values('mahibh','mahibh007');
 
 */