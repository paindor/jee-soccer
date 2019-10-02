package com.soccer.web.commands;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.controllers.FacadeController;
import com.soccer.web.domains.PlayerBean;
import com.soccer.web.pool.Constants;
import com.soccer.web.serviceimpls.PlayerServiceImpl;
import com.sun.corba.se.impl.orbutil.closure.Constant;

public class LoginCommand extends Command {
	
	public LoginCommand(HttpServletRequest request) {
		setRequest(request);
		setDomain(request.getServletPath().substring(1, request.getServletPath().indexOf(".")));
		//setDomain(request.getParameter(""));
		//setDomain(FacadeController.);
		setAction(request.getParameter("action"));
		setPage(request.getParameter("page"));
		excute();
		System.out.println("4 �α���Ŀ�ǵ�");
		
	}
	@Override
	public void excute() {
		PlayerBean param = new PlayerBean();
		param.setPlayerId(request.getParameter("playerId"));
		param.setSolar(request.getParameter("solar"));
		
		
		if(PlayerServiceImpl.getInstance().login(param)) {
			setDomain("player");
			setPage(request.getParameter("page"));
			if(request.getParameter("page").equals("main")) {
				request.setAttribute("page", "main");
			}
			
		}
		else {
			setDomain("facade");
			setPage("fail");
		}
		
		
		this.view = String.format(Constants.VIEW_PATH_DOUBLE, domain, page );
		//super.excute();
	}

}
