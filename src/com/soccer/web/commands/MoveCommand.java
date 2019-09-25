package com.soccer.web.commands;

import javax.servlet.http.HttpServletRequest;

public class MoveCommand extends Command {
	
	

	public MoveCommand(HttpServletRequest request) {
		setRequest(request);
		setDomain(request.getContextPath().substring(1, request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		setPage(request.getParameter("page"));
		excute();
		
		
		
		
		
		
	
	}

}
