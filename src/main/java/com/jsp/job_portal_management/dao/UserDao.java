package com.jsp.job_portal_management.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.job_portal_management.connection.UserConnection;
import com.jsp.job_portal_management.dto.User;

public class UserDao {
	
	Connection connection = UserConnection.getUserConnection();
	
	public User saveUserDao(User user) {
		
		String insertQuery = "insert into user(name,email,phone,city,jobtype,cv,password,image) values(?,?,?,?,?,?,?,?)";
		
		try {
			
			PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getEmail());
			preparedStatement.setLong(3, user.getPhone());
			preparedStatement.setString(4, user.getCity());
			preparedStatement.setString(5, user.getJobType());
			preparedStatement.setBlob(6, user.getCv());
			preparedStatement.setString(7, user.getPassword());
			preparedStatement.setBlob(8, user.getImage());
			preparedStatement.execute();
			return user;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/*
	 * fetch user by Email Id
	 */
	public User  getUserByEmailDao(String userEmail) {
		
		String selectQuery = "SELECT * FROM user WHERE email=?";
		
		try {
			PreparedStatement ps=connection.prepareStatement(selectQuery);
			ps.setString(1, userEmail);
			ResultSet resultSet = ps.executeQuery();
			if(resultSet.next()) {
				return new User(resultSet.getString("email"), resultSet.getString("password"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
