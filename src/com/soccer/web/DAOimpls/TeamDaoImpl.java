package com.soccer.web.DAOimpls;

import com.soccer.web.DAOs.TeamDao;

public class TeamDaoImpl implements TeamDao{
	
	private static TeamDaoImpl instance = new TeamDaoImpl();

	public static TeamDaoImpl getInstance() {
		return instance;
	}
	
	private TeamDaoImpl() {
		// TODO Auto-generated constructor stub
	}

}
