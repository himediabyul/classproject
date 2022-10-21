package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest2 {

	public static void main(String[] args) {
		
		// 1. 드라이버 로드 ( 생략 가능 )
		try {
	
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(dbUrl, "scott", "tiger");
			
			// 3. Statement / PreparedStatement
			String sql = "select * from dept where deptno=?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 10); // 첫번째 물음표 안에 들어가는 값
			
			// Select의 결과를 담고 있는 객체
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				
				System.out.printf("%d \t %s \t %s \n", deptno, dname, loc);
			}
			
			rs.close();
			pstmt.close();
			conn.close();
			
			
			// 4. ResultSet
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}