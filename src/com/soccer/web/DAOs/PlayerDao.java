package com.soccer.web.DAOs;


import java.util.List;

import com.soccer.web.domains.PlayerBean;

public interface PlayerDao {

	/*-- SQL_TEST_002
	-- ������ ����(�ߺ�����,������ �����
	*/
	public List<String> selectPositions();
	public List<PlayerBean> findPositionByTeamid(PlayerBean param);
	
	public List<PlayerBean> findByHeightNameTeam(PlayerBean param);
	
	public List<PlayerBean> selectByMany(PlayerBean param);
	
	public boolean login(PlayerBean param);
	public boolean insertPlayer(PlayerBean param);
	
	
}
