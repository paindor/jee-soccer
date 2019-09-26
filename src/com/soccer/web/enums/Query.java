package com.soccer.web.enums;

public enum Query {
	SELECT1_BY_VALUE1,
	SELECT1_BY_VALUE2,
	SELECT2_BY_VALUE1,
	SELECT2_BY_VALUE2;
	
	
	
	
	@Override
	public String toString() {
		
		String query = "";
		
		switch(this) {
		case SELECT1_BY_VALUE1:
			query = "SELECT ? \r\n" + 
					"FROM ?\r\n" + 
					"WHERE ? LIKE ?";
			break;
		case SELECT1_BY_VALUE2:
			query = "SELECT ? \r\n" + 
					"FROM ?\r\n" + 
					"WHERE ? LIKE ? AND ? LIKE ?";
			break;
		case SELECT2_BY_VALUE1:
			query = "SELECT ? ? \r\n" + 
					"FROM ?\r\n" + 
					"WHERE ? LIKE ?";
			break;
		case SELECT2_BY_VALUE2:
			query = "SELECT ? ? \r\n" + 
					"FROM ?\r\n" + 
					"WHERE ? LIKE ? AND ? LIKE ?";
			break;
			
			
		}
		return query;
	}
	

}
