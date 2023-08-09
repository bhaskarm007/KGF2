package datadriventesting.jdbc;


// Script to insert data into data base using DatabaseLibrary
public class LibraryInsertData {

	public static void main(String[] args) {
		
		String [][] sarr = {
				{"admin1",  "manager"},
				{"trainee1", "trainee"},
				{"kushie",   "kushie"},
				{"bhavana",  "bhavana"},
				{"mahibh7",  "mahibh07"}
		};
		String sqlQuery = "insert into details(username, password) values(?, ?);";
		
		DatabaseLibrary db = new DatabaseLibrary("myCredentials");
		db.insertData(sqlQuery, sarr);
		System.out.println("DONE..!!!");
	}
}
