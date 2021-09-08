package org.sourcefuse.automationmain;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.sourcefuse.dbutility.DBQuery;
import org.sourcefuse.dbutility.JDBCConnection;
import org.sourcefuse.functionutilties.SourceFuseFunctionUtilities;
import org.sourcefuse.helper.ResourceHelper;

/**
 * Test Case 5: Verify DB entry after submitting the form using JDBC connection.
 * 
 * @author bjain
 *
 */
public class TestCase5 {
	public static HashMap<String, Object> globalMap = new HashMap<String, Object>();
	public static HashMap<String, String> testDataMap = new HashMap<String, String>();
	public static SourceFuseFunctionUtilities SourceFuseFunctionUtilities = new SourceFuseFunctionUtilities();

	public static void main(String[] args) throws IOException, SQLException {
		ResourceHelper.readProperties(globalMap);
		ResourceHelper.loadtestData(testDataMap, (String) globalMap.get(("TestDataPath")));
		WebDriver driver = SourceFuseFunctionUtilities.launchSourceFuseWithURL(globalMap);
		SourceFuseFunctionUtilities.fillForm(driver, testDataMap);
		Connection conn = JDBCConnection.jdbcConnection(globalMap);
		DBQuery.getRecentEntryInDb(conn, testDataMap);
		JDBCConnection.closeBrowser(conn);
	}
}
