package com.soccer.web.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConnTest {
	public static void main(String[] args) {
	
		Connection conn = null;
		Statement stm = null;
		
		ResultSet rs = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "c##oracle" , password = "oracle" ;
		
		
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, username, password );
			if(conn != null) {
				System.out.println("연결성공");
				stm = conn.createStatement();
				rs = stm.executeQuery("SELECT COUNT(*) count\r\n" + 
						"FROM PLAYER P \r\n" + 
						"    JOIN TEAM T\r\n" + 
						"    USING(TEAM_ID)\r\n" + 
						"WHERE TEAM_NAME NOT IN('드래곤즈','FC서울','일화천마')\r\n" + 
						"            AND POSITION NOT IN('GK','MF')");
				List<String> list = new ArrayList<String>();
				
				while(rs.next()) {
					
					list.add(rs.getString("count"));
					
				}
				System.out.println("선수" + list);
				
			}else {
				System.out.println("연결실패");
			}
		} catch(Exception e) {e.printStackTrace();}
	}

}
