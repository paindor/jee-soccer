package com.soccer.web.commands;

import com.soccer.web.enums.Action;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

public class Commander {
	
	
	public static Command workOrder(HttpServletRequest request) {
		Command cmd = null;
	
		
		switch(Action.valueOf(request.getParameter("action").toUpperCase())) {
		case MOVE:
			cmd = new MoveCommand(request);
			
			break;
		case SEARCH:
			cmd = new SearchCommand();
			
			break;
		default:
			break;
		
			
		
		}
		return cmd;
		
		
		
	}
}
