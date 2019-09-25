package com.soccer.web.factory;

import java.sql.Connection;
import java.sql.DriverManager;

import com.soccer.web.enums.DBDriver;
import com.soccer.web.enums.Url;
import com.soccer.web.pool.Constants;

public class MariaDb implements Database {
	
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(DBDriver.MARIADB_DRIVER.toString());
			conn = DriverManager.getConnection(Url.MARIADB_URL.toString(),
					Constants.USERNAME, Constants.PASSWORD);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
		
		
	}
	

}
