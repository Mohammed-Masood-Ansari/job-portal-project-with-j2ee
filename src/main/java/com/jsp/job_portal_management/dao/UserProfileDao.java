package com.jsp.job_portal_management.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jsp.job_portal_management.connection.UserConnection;
import com.jsp.job_portal_management.dto.UserProfile;

public class UserProfileDao {

	Connection connection = UserConnection.getUserConnection();
	
	public UserProfile saveUserProfileDao(UserProfile profile) {
		
		String insertQuery = "insert into userprofile(current,permanent,pincode,state,city,education,country,userid) values(?,?,?,?,?,?,?,?)";
		
		try {
			
			PreparedStatement ps = connection.prepareStatement(insertQuery);
			
			System.out.println(profile.getUser().getId());
			
			ps.setString(1, profile.getCurrentAddress());
			ps.setString(2, profile.getPermanentAddress());
			ps.setInt(3, profile.getPincode());
			ps.setString(4, profile.getState());
			ps.setString(5, profile.getCity());
			ps.setString(6, profile.getEducation());
			ps.setString(7, profile.getCountry());
			ps.setInt(8, profile.getUser().getId());
			
			ps.execute();
			
			return profile;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
