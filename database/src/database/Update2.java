package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Update2 {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
			
			con = DriverManager.getConnection(url, user, password);
			
			// sc.nextLine(), sc.next() ==> String 입력 처리
			// 차이점 sc.nextLine() : 줄단위로 읽기(엔터포함) / sc.next() : 엔터 직전까지 읽기 
			// sc.nextInt() : 엔터 직전까지 읽기 
			
			System.out.print("부서코드 입력 >> ");
			int deptno = sc.nextInt(); //int deptno = Integer.parseInt(sc.nextLine()); =>아랫줄을 sc.nextLine()으로 가려면 이걸로
			
			System.out.print("변경할 부서명 입력 >> ");
			String dname = sc.next();
			
			
			// 특정 부서의 부서명 변경
			String sql = "Update dept_temp set dname=? where deptno=?";
			
			pstmt = con.prepareStatement(sql);
			
			// ?에 대한 처리  (물음표 순서대로) 
			pstmt.setString(1, dname);
			pstmt.setInt(2, deptno);
			
			int result = pstmt.executeUpdate();
			
			if(result>0) {
				System.out.println("업데이트 성공");
			}

			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
