package com.soccer.web.DAOs;


import java.util.List;

import com.soccer.web.domains.PlayerBean;

public interface PlayerDao {

	/*-- SQL_TEST_002
	-- 포지션 종류(중복제거,없으면 빈공간
	*/
	public List<String> selectPositions();
	public List<PlayerBean> findPositionByTeamid(PlayerBean param);
	
	public List<PlayerBean> findByHeightNameTeam(PlayerBean param);
	
	public List<PlayerBean> selectByMany(PlayerBean param);
	
	public boolean login(PlayerBean param);
	
	
}
