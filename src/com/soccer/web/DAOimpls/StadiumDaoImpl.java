package com.soccer.web.DAOimpls;

import com.soccer.web.DAOs.StadiumDao;

public class StadiumDaoImpl implements StadiumDao {
	
	private static StadiumDaoImpl instance = new StadiumDaoImpl();

	public static StadiumDaoImpl getInstance() {
		return instance;
	}
	private StadiumDaoImpl() {
		// TODO Auto-generated constructor stub
	}

}
