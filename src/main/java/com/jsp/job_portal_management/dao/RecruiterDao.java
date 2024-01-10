package com.jsp.job_portal_management.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.jsp.job_portal_management.connection.UserConnection;
import com.jsp.job_portal_management.dto.Recruiter;

public class RecruiterDao {

	Connection connection = UserConnection.getUserConnection();
	
	public Recruiter saveRecruiterDao(Recruiter recruiter) {
		
		try {
			String insertRecruiterQuery = "insert into recruiter(name,email,phone,password,company) values(?,?,?,?,?)";
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
