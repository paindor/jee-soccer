package com.soccer.web.commands;

import javax.servlet.http.HttpServletRequest;

public class MoveCommand extends Command {
	
	

	public MoveCommand(HttpServletRequest request) {
		setRequest(request);
		setDomain(request.getServletPath().substring(1, request.getServletPath().indexOf(".")));
		//setDomain(request.getParameter("facade"));
		
		setAction(request.getParameter("action"));
		setPage(request.getParameter("page"));
		excute();
		
		
		
		
		
		
		
	
	}
	@Override
	public void excute() {
		
		super.excute();
		request.setAttribute("page", request.getParameter("page"));
	}
	

}
