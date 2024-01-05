package com.jsp.job_portal_management.dao;

import java.sql.Blob;
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
	
	/*
	 * fetch user by Email Id
	 */
	public User  getAllUserDetailsByEmailDao(String userEmail) {
		
		String selectQuery = "SELECT * FROM user WHERE email=?";
		
		try {
			PreparedStatement ps=connection.prepareStatement(selectQuery);
			ps.setString(1, userEmail);
			ResultSet resultSet = ps.executeQuery();
			if(resultSet.next()) {
				
				Blob userImage = resultSet.getBlob("image");
				Blob userCv = resultSet.getBlob("cv");
				String name = resultSet.getString("name");
				String email = resultSet.getString("email");
				String city = resultSet.getString("city");
				String jobType = resultSet.getString("jobtype");
				long phone = resultSet.getLong("phone");
				
				/*
				 * byte[] userimage = userImage.getBytes(1,(int) userImage.length()); byte[]
				 * usercv = userCv.getBytes(2, (int)userCv.length());
				 */
				
				return new User(name, email, city, jobType, phone, userImage, userCv);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
