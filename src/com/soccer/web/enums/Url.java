package com.soccer.web.enums;

public enum Url {
	ORACLE_URL,
	MARIADB_URL,
	DB2_URL;
	

	@Override
	public String toString() {
		String url = "";
		switch(this) {
		case ORACLE_URL:
			url = "jdbc:oracle:thin:@localhost:1521:xe";
			break;
		case MARIADB_URL:
			break;
			
		}
		return url;
	}
}


