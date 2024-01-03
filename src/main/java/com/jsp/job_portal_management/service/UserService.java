package com.jsp.job_portal_management.service;

import com.jsp.job_portal_management.dao.UserDao;
import com.jsp.job_portal_management.dto.User;

public class UserService {

	UserDao dao = new UserDao();
	
	public User saveUserService(User user) {
		return dao.saveUserDao(user);
	}
	
}
