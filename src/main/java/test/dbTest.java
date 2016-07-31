package test;

import static org.junit.Assert.*;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.mysql.jdbc.Connection;

import junit.framework.TestCase;

public class dbTest extends TestCase {
	
	@Test
	public void testName() {
			Connection con = null;

			try {
				con = (Connection) DriverManager.getConnection("jdbc:mysql://rkdgusrnrlrl.vps.phps.kr:3306/MEMO?haracterEncoding=utf-8",
						"hj", "hj");
				
				java.sql.Statement st = null;
				ResultSet rs = null;
				st = con.createStatement();
				
				rs = st.executeQuery("SHOW DATABASES");

				while (rs.next()) {
					String str = rs.getNString(1);
					System.out.println(str);
				}

			} catch (SQLException e) {
				fail("sql에 문제가 있어");
				
			}
			
			
	}
	
}
