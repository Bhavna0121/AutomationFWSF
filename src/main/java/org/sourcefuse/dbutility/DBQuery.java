package org.sourcefuse.dbutility;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

import org.testng.Assert;

public class DBQuery extends JDBCConnection {

	/**
	 * 
	 * @param conn
	 * @throws SQLException
	 */
	public static void getRecentEntryInDb(Connection conn, HashMap<String, String> testDataMap) throws SQLException {
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM TableName WHERE id=(SELECT max(id) FROM TableName)");
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnCount = rsmd.getColumnCount();

		// The column count starts from 1
		for (int i = 1; i <= columnCount; i++) {
			String colName = rsmd.getColumnName(i);
			String colValue = rs.getString(colName);
			// expecting colname and key name in testdata are same
			// both ways by assert and if else
			if (testDataMap.containsKey(colName) && testDataMap.get(colName).equals(colValue)) {
				System.out.println("Successful Expected -> " + testDataMap.get(colName) + " | Actual -> " + colValue);
				Assert.assertEquals(colValue, testDataMap.get(colName),
						"Successful Expected -> " + testDataMap.get(colName) + " | Actual -> " + colValue);
			} else {
				System.out.println("UnSuccessful Expected -> " + testDataMap.get(colName) + " | Actual -> " + colValue);
			}
		}
	}

	/**
	 * 
	 * @param conn
	 * @throws SQLException
	 */
	public static void isEmailTriggeredInDb(Connection conn) throws SQLException {
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT email_sent FROM TableName WHERE id=(SELECT max(id) FROM TableName)");
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnCount = rsmd.getColumnCount();

		// The column count starts from 1
		for (int i = 1; i <= columnCount; i++) {
			String colName = rsmd.getColumnName(i);
			Assert.assertTrue(rs.getString(colName).equals("yes"));
			// both ways by assert and if else.
			if (rs.getString(colName).equals("yes")) {
				System.out.println("email sent successfully.");
			} else {
				System.out.println("email sent unsuccessfully.");
			}
		}
	}
}
