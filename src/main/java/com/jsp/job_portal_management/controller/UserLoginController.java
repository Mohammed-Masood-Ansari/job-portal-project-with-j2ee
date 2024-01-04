package com.jsp.job_portal_management.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.job_portal_management.dto.User;
import com.jsp.job_portal_management.service.UserService;


@SuppressWarnings("serial")
@WebServlet(value ="/userlogin")
public class UserLoginController extends HttpServlet{
	
	@SuppressWarnings("unused")
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		HttpSession httpSession = req.getSession();
		
		UserService service = new UserService();
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String loginType = req.getParameter("login");
		
		
		
		if(loginType.equals("user")) {
			User user=service.loginUserByEmailPasswordService(username);
			if(user!=null) {
				
				if(user.getPassword().equals(password)) {
					httpSession.setAttribute("userSession", username);
					req.getRequestDispatcher("home.jsp").forward(req, resp);
				}else {
					req.setAttribute("passwordWrong", "user password is incorrect");
					req.getRequestDispatcher("user-login.jsp").forward(req, resp);
				}
				
			}else {
				req.setAttribute("emailWrong", "user email is incorrect");
				req.getRequestDispatcher("user-login.jsp").forward(req, resp);
			}
			
		}else if(true) {
			
		}else {
			
		}
	}

}
