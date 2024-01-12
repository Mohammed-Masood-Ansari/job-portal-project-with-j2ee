package com.jsp.job_portal_management.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jsp.job_portal_management.connection.UserConnection;
import com.jsp.job_portal_management.dto.PostJob;

public class PostJobDao {

	Connection con = UserConnection.getUserConnection(); 
	
	public PostJob savePostJobDao(PostJob job) {
		
		String insertQuery = "insert into postjob(name,email,phone,title,location,experience,description,skill,role,salary,verified)  values(?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement ps = con.prepareStatement(insertQuery);
			ps.setString(1, job.getName());
			ps.setString(2, job.getEmail());
			ps.setLong(3, job.getPhone());
			ps.setString(4, job.getTitle());
			ps.setString(5, job.getLocation());
			ps.setString(6, job.getExperience());
			ps.setString(7, job.getDescription());
			ps.setString(8, job.getSkills());
			ps.setString(9, job.getRole());
			ps.setString(10, job.getSalary());
			ps.setString(11, "no");
			ps.execute();
			return job;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
