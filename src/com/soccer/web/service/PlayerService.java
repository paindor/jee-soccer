package com.soccer.web.service;

import java.util.List;

import com.soccer.web.domains.PlayerBean;

public interface PlayerService {
	/*-- SQL_TEST_002
	-- 포지션 종류(중복제거,없으면 빈공간
	*/
	public List<String> findPositions();
	public List<PlayerBean> findTeamIdByposition(PlayerBean param);
	public List<PlayerBean> findByTidNameHeight(PlayerBean param);
	public boolean login(PlayerBean param);
	

}
