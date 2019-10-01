package com.soccer.web.service;

import java.util.List;

import com.soccer.web.domains.PlayerBean;

public interface PlayerService {
	/*-- SQL_TEST_002
	-- ������ ����(�ߺ�����,������ �����
	*/
	public List<String> findPositions();
	public List<PlayerBean> findTeamIdByposition(PlayerBean param);
	public List<PlayerBean> findByTidNameHeight(PlayerBean param);
	public boolean login(PlayerBean param);
	
	public boolean createPlayer(PlayerBean param);
	
	

}
