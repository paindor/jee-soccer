package com.soccer.web.domains;

import java.io.Serializable;

import lombok.Data;
@Data
public class PlayerBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private String playerId, teamId, playerName, nickName, backNum, 
			joinYYYY, position, nation, birthDate, height,
			weight, ePlayerName;

	

}
