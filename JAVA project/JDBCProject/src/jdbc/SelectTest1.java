package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest1 {

	public static void main(String[] args) {
		
		// 1. 드라이버 로드 (생략 가능)
		try {

			// 2. Connection 객체 생성			
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(dbUrl, "scott", "tiger");
			
			// 3. Statement / PreparedStatement  -- 데이터 넣기
			Statement stmt = conn.createStatement();
			
			String sql = "select * from dept";
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {  // 해당위치 컬럼의 값을 가져옴
//				int deptno = rs.getInt("deptno");
//				String dname = rs.getString("dname");
//				String loc = rs.getString("loc");
				int deptno = rs.getInt(1);
				String dname = rs.getString(2);
				String loc = rs.getString(3);
				
				System.out.printf("%d \t %s \t %s \n", deptno, dname, loc);
			}
			
			rs.close();
			stmt.close();
			conn.close();
			
			
			// 4. ResultSet
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

