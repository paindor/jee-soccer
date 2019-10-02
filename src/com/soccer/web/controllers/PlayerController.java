package com.soccer.web.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.soccer.web.commands.Commander;
import com.soccer.web.commands.Receiver;
import com.soccer.web.commands.Sender;
import com.soccer.web.domains.PlayerBean;
import com.soccer.web.enums.Action;
import com.soccer.web.service.PlayerService;
import com.soccer.web.serviceimpls.PlayerServiceImpl;


@WebServlet("/player.do")
public class PlayerController extends HttpServlet  {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		System.out.println(request.getParameter("page") + "왔다");
		Receiver.init(request);
	
		switch(Action.valueOf(request.getParameter("action").toUpperCase())) {
		
		case CREATE: request.setAttribute("page", "login1");break;
		
		default: break;
		
		}
		
		
		Sender.send(request, response);
		
		
		
		
		
		

		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	
}
