package com.soccer.web.commands;

import javax.servlet.http.HttpServletRequest;

public class Receiver {
	public static Command cmd = new Command();
	
	
	public static void init(HttpServletRequest request) {
		System.out.println("2.¸®½Ã¹ö");
		cmd = Commander.workOrder(request);
		
		
		
		
		
		
		
	}

}
