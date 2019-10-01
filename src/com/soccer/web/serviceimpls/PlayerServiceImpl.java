package com.soccer.web.serviceimpls;

import java.util.ArrayList;
import java.util.List;

import com.soccer.web.DAOimpls.PlayerDaoImpl;
import com.soccer.web.DAOs.PlayerDao;
import com.soccer.web.domains.PlayerBean;
import com.soccer.web.service.PlayerService;

public class PlayerServiceImpl implements PlayerService{

	private static PlayerServiceImpl instance = new PlayerServiceImpl();
	
	public static PlayerServiceImpl getInstance() {
		return instance;
		
	}
	
	private PlayerServiceImpl() {
		System.out.println("5.��������");
	}
	
	@Override
	public List<String> findPositions() {
		
		List<String> pl = new ArrayList<String>();
		
		
		
		return PlayerDaoImpl.getInstance().selectPositions();
	}
	@Override
	public List<PlayerBean> findTeamIdByposition(PlayerBean param) {
		
		List<PlayerBean> list = PlayerDaoImpl.getInstance().findPositionByTeamid(param);
		
		
		
	//	list = dao.findPositionByTeamid(param);
		
		
		return list;
	}
	@Override
	public List<PlayerBean> findByTidNameHeight(PlayerBean param) {
		List<PlayerBean> list = new ArrayList<PlayerBean>();
		
		list = PlayerDaoImpl.getInstance().findByHeightNameTeam(param);
		
		
		
		return list;
	}

	@Override
	public boolean login(PlayerBean param) {
		
		return PlayerDaoImpl.getInstance().login(param);
		
	}

	@Override
	public boolean createPlayer(PlayerBean param) {
	
		
		return PlayerDaoImpl.getInstance().insertPlayer(param);
		
		
	}
	
	

}
