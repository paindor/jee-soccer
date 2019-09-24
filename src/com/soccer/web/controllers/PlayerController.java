package com.soccer.web.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.soccer.web.domains.PlayerBean;
import com.soccer.web.service.PlayerService;
import com.soccer.web.serviceimpls.PlayerServiceImpl;


@WebServlet("/player.do")
public class PlayerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PlayerService service = null;
		System.out.println(request.getParameter("action" ) + request.getParameter("page"));
		switch(request.getParameter("action")) {
		case "move":
			List<String> position = new ArrayList<String>();
			//String tid = request.getParameter("tid");
			//String posi = request.getParameter("position");
		//	System.out.println(tid+posi);
			
		
			position = PlayerServiceImpl.getInstance().findPositions();
			request.setAttribute("position", position);
			request.getRequestDispatcher(String.format("WEB-INF/views/%s.jsp", 
					request.getParameterValues("page"))).forward(request, response);
			
					
			
			System.out.println("controller");
			break;
		case "find":

			
			System.out.println(request.getParameter("action") + request.getParameter("page"));
			PlayerBean player = new PlayerBean();
			player.setTeamId(request.getParameter("tid"));
			player.setPosition(request.getParameter("position"));
			
			List<PlayerBean> plist = new ArrayList<PlayerBean>();
			
			plist = PlayerServiceImpl.getInstance().findTeamIdByposition(player);
			
			
			System.out.println(plist.get(0).getPlayerName());
			request.setAttribute("plist", plist);
			
			
			
			
			request.getRequestDispatcher(String.format("WEB-INF/views/%s.jsp", 
						request.getParameterValues("page"))).forward(request, response);
			
			break;
		case "find3":
			
			PlayerBean param = new PlayerBean();
			param.setPlayerName(request.getParameter("name"));
			param.setHeight(request.getParameter("height"));
			param.setTeamId(request.getParameter("tid"));
			System.out.println("플레이어" + param.getPlayerName());
			List<PlayerBean> list1 = new ArrayList<PlayerBean>();
			list1 = PlayerServiceImpl.getInstance().findByTidNameHeight(param);
			request.setAttribute("list1", list1);
			System.out.println(list1.get(0).getPlayerName());
			
			
			request.getRequestDispatcher(String.format("WEB-INF/views/%s.jsp", 
					request.getParameterValues("page"))).forward(request, response);
			
			
			break;
			
		}
		
		
		

		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	
}
