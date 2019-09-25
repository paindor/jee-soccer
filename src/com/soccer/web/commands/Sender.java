package com.soccer.web.commands;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sender {
	
	public static void send(HttpServletRequest request 
			,HttpServletResponse response) {
		
		System.out.println("sender" +Receiver.cmd.getView());
		try {
			request.getRequestDispatcher(Receiver.cmd.getView()).
			forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void redirect(HttpServletRequest request 
			,HttpServletResponse response) {
		
		try {
			response.sendRedirect("");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
