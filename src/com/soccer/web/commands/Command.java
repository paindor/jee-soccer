package com.soccer.web.commands;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.pool.Constants;

import lombok.Data;
@Data
public class Command implements Order {

	protected HttpServletRequest request;
	
	protected String action, page, domain, view;
	
	
	@Override
	public void excute() {
		
		this.view = String.format(Constants.VIEW_PATH_DOUBLE,"facade", page);
		System.out.println(this.domain + "�ù�");
		
		// TODO Auto-generated method stub
		
	}

}
