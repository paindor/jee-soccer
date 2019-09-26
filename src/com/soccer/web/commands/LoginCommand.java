package com.soccer.web.commands;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.domains.PlayerBean;
import com.soccer.web.pool.Constants;
import com.soccer.web.serviceimpls.PlayerServiceImpl;
import com.sun.corba.se.impl.orbutil.closure.Constant;

public class LoginCommand extends Command {
	
	public LoginCommand(HttpServletRequest request) {
		setRequest(request);
		setDomain(request.getContextPath().substring(1, request.getServletPath().indexOf(".")));
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
		
		System.out.println(param.getPlayerId() + "�α�Ŀ�ǵ�");
		
		if(PlayerServiceImpl.getInstance().login(param)) {
			setPage(request.getParameter("page"));
		}
		else {
			setPage("fail");
		}
		
		super.excute();
	}

}