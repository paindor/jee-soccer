package com.soccer.web.DAOimpls;

import com.soccer.web.DAOs.ScheduleDao;

public class ScheduleDaoImpl implements ScheduleDao {
	
	private static ScheduleDaoImpl instance = new ScheduleDaoImpl();

	public static ScheduleDaoImpl getInstance() {
		return instance;
	}
	
	private ScheduleDaoImpl() {}

}
