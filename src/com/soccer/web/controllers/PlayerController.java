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
import com.soccer.web.service.PlayerService;
import com.soccer.web.serviceimpls.PlayerServiceImpl;


@WebServlet("/player.do")
public class PlayerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("1컨트롤러");
		System.out.println(request.getParameter("playerId") + "컨트롤러");
		System.out.println(request.getParameter("action") + "컨트롤러");
		Receiver.init(request);
	
		
		
		Sender.send(request, response);
		
		
		
		
		
		System.out.println(request.getParameter("action" ) + request.getParameter("page"));
		
		

		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	
}
