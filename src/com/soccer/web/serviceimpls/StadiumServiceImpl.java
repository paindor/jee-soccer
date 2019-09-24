package com.soccer.web.serviceimpls;

import com.soccer.web.service.StadiumService;

public class StadiumServiceImpl implements StadiumService{

	private static StadiumServiceImpl instance = new StadiumServiceImpl();

	public static StadiumServiceImpl getInstance() {
		return instance;
	}
	private StadiumServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	
}
