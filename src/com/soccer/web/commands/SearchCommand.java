package com.soccer.web.commands;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.domains.PlayerBean;
import com.soccer.web.pool.Constants;
import com.soccer.web.serviceimpls.PlayerServiceImpl;

public class SearchCommand extends Command{
		
	public SearchCommand(HttpServletRequest request) {
		
		setRequest(request);
		setDomain(request.getServletPath().substring(1,
				request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		setPage(request.getParameter("page"));
		
		
		excute();
		
		

		
	}
	@Override
	public void excute() {
		PlayerBean param = new PlayerBean();
		switch(request.getParameter("page")) {
		case "2_showposition":
			request.setAttribute("positions" 
					,PlayerServiceImpl.getInstance().findPositions() );
			break;
		case "4_find_by_teamid_position":
			
			
			param.setTeamId(request.getParameter("tid"));
			param.setPosition(request.getParameter("position"));
			
					
			
			request.setAttribute("players", PlayerServiceImpl.getInstance()
					.findTeamIdByposition(param));
			
			break;
		case "5_find_byteamid_height_name":
			param.setTeamId(request.getParameter("tid"));
			param.setPlayerName(request.getParameter("name"));
			param.setHeight(request.getParameter("height"));
			
			request.setAttribute("players", PlayerServiceImpl.getInstance()
					.findByTidNameHeight(param));
			break;
			
		
		}
		//super.excute();
		this.view = String.format(Constants.VIEW_PATH_DOUBLE, domain, page );
		System.out.println(getDomain());
	}
	
	
	

}
