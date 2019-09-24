package com.soccer.web.factory;

import com.soccer.web.pool.Constants;

public class DatabaseFactory {
	
	//private Database base;
	
	public static Database createDatabase(String vender, String username, 
			String password) {
		Database db = null;
			
		String dburl = "";
		String dbdrv = "";
		
		
		switch(vender) {
		case "oracle":
			db =  new Oracle();
			break;
		case "mariadb":
			db = new MariaDb();
			break;
		case "mysql":
			
			break;
		case "h2":
			
			break;
		case "db2":
			
			break;
		
			default:
				break;
				
				
		}
		 
		
		return db;
	}
	

}
