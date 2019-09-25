package com.soccer.web.enums;

public enum DBDriver {
	ORACLE_DRIVER,
	MYSQL_DRIVER,
	MARIADB_DRIVER,
	ORACLE_URL,
	
	;
	
	
	@Override
	public String toString() {
		String driver = "";
		switch(this) {
		case ORACLE_DRIVER:
			driver = "oracle.jdbc.OracleDriver";
			break;
		case ORACLE_URL:
			driver = "jdbc:oracle:thin:@localhost:1521:xe";
			break;
		}
		
		return driver;
		
		
	}

}
