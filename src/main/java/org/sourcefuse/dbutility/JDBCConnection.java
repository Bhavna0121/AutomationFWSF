package org.sourcefuse.dbutility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;

public class JDBCConnection {

	/**
	 * 
	 * @param globalMap
	 * @return
	 */
	public static Connection jdbcConnection(HashMap<String, Object> globalMap) {
		try {
			Connection conn;
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://" + globalMap.get("DataSource"),
					(String) globalMap.get("DBUserID"), (String) globalMap.get("DBPassword"));
			// here test is database name, root is username and password is password
			return conn;

		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	/**
	 * 
	 * @param conn
	 */
	public static void closeBrowser(Connection conn) {
		try {
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
