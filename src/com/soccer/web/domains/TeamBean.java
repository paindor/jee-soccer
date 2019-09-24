package com.soccer.web.domains;

import java.io.Serializable;

import lombok.Data;
@Data
public class TeamBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private String teamId , stadiumId , regionName ,
			teamName , originYYYY,
			address , tel, fax, hompage, owner , eTeamName ;
	
	
}
