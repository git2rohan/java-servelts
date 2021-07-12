package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.POJO.User;
import com.service.LoginService;

@WebServlet("/login")
public class LoginPageController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		LoginService loginService = new LoginService();
		User user = loginService.checkLogin(req.getParameter("username"), req.getParameter("password"));
		HttpSession session = req.getSession();
		session.setAttribute("user", user);
		
		resp.sendRedirect("home.jsp");
	}
	
}
