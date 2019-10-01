package com.soccer.web.commands;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.domains.PlayerBean;
import com.soccer.web.pool.Constants;
import com.soccer.web.serviceimpls.PlayerServiceImpl;

public class CreateCommand  extends Command{
	
	public CreateCommand(HttpServletRequest request) {
		
		setRequest(request);
		setDomain(request.getServletPath().substring(1, request.getServletPath().indexOf(".")));
		//setDomain(request.getParameter(""));
		//setDomain(FacadeController.);
		setAction(request.getParameter("action"));
		setPage(request.getParameter("page"));
		super.excute();
		excute();
		// TODO Auto-generated constructor stub
	}
	@Override
	public void excute() {
		System.out.println("createCommande");
		// TODO Auto-generated method stub
		PlayerBean player = new PlayerBean();
		player.setPlayerId(request.getParameter("playerId"));
		player.setPlayerName(request.getParameter("playerName"));
		player.setTeamId("k02");
		player.setNickName(request.getParameter("nickname"));
		player.setBackNum(request.getParameter("backNo"));
		player.setSolar(request.getParameter("solar"));
		player.setJoinYYYY(request.getParameter("joinYYYY"));
		player.setPosition(request.getParameter("position"));
		player.setNation(request.getParameter("nation"));
		player.setBirthDate(request.getParameter("birthDate"));
		player.setHeight(request.getParameter("height"));
		player.setWeight(request.getParameter("weight"));
		player.setEPlayerName(request.getParameter("ePlayerName"));
		
		if(PlayerServiceImpl.getInstance().createPlayer(player)) {
			this.view = String.format(Constants.VIEW_PATH_DOUBLE, 
					"facade", "main");
			System.out.println("success");
		}else {
			this.view = String.format(Constants.VIEW_PATH_DOUBLE, "facade" , "join");
			
			System.out.println("fail");
		}
		
		
		
		
		
		//super.excute();
	}

}
