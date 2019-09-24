package com.soccer.web.serviceimpls;

import com.soccer.web.service.ScheduleService;

public class ScheduleServiceImpl implements ScheduleService {
	
	private static ScheduleServiceImpl instance = new ScheduleServiceImpl();

	public static ScheduleServiceImpl getInstance() {
		return instance;
	}
	
	
	private ScheduleServiceImpl() {
		// TODO Auto-generated constructor stub
	}

}
