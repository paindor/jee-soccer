package com.soccer.web.factory;

import com.soccer.web.enums.DB;
import com.soccer.web.pool.Constants;

public class DatabaseFactory {
	
	//private Database base;
	
	public static Database createDatabase(String vender) {	
		Database db = null;
			
		
		
		switch(DB.valueOf(vender)) {
		case ORACLE:
			db =  new Oracle();
			break;
		case MARIADB:
			db = new MariaDb();
			break;
		case MYSQL :
			
			break;
		case H2:
			
			break;
		case DB2:
			
			break;
		
			default:
				break;
				
				
		}
		 
		
		return db;
	}
	

}
