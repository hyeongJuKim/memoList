package test;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.junit.Test;

import com.mysql.jdbc.Connection;

import junit.framework.TestCase;

public class dbTest extends TestCase {
	
	@Test
	public void testName() {

			String sql = "SELECT * FROM MEMO";
			ResultSetProcess resultSetProcess = new PrintResult();
			
			getList(sql, resultSetProcess)
			;
			
	}

	private void getList(String sql, ResultSetProcess resultSetProcess) {
		Connection con = null;			
		
		try {
			con = (Connection) DriverManager.getConnection("jdbc:mysql://rkdgusrnrlrl.vps.phps.kr:3306/MEMO?haracterEncoding=utf-8",
					"hj", "hj");
			
			java.sql.Statement st = null;
			ResultSet rs = null;
			st = con.createStatement();
			rs = st.executeQuery(sql);
			resultSetProcess.process(rs);

		} catch (SQLException e) {
			fail("sql에 문제가 있어");
			
		}
	}
	
	//
	interface ResultSetProcess<T> {
		public T process(ResultSet resultSet); 
		
	}
	
	// result 자료들을 print.
	class PrintResult implements ResultSetProcess<Void>{

		public Void process(ResultSet resultSet) {
			String str;
			try {
				
				while (resultSet.next()) {
					ResultSetMetaData metaData = resultSet.getMetaData();
					int columnCount = metaData.getColumnCount();
					
						String print = "";
						for (int i = 1; i < columnCount+1; i++) {
							print += resultSet.getString(i) + "\t";
						}
						System.out.println(print);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return null;
		}
		
	}
	
}
