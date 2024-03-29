package com.jsp.job_portal_management.dto;

import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;

/**
 * 
 * @author Mo Masood Ansari bsxjzhvcsdnklmlbfmb nnb mbm nb n
 *
 */
public class User {

	private int id;
	private String name;
	private String email;
	private String password;
	private String city;
	private String jobType;
	private long phone;
	private InputStream cv;
	private InputStream image;

	public User(int id, String name, String email, String city, String jobType, long phone, InputStream image) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.city = city;
		this.jobType = jobType;
		this.phone = phone;
		this.image = image;
	}

	public User(int id, String name, String email, String password, String city, String jobType, long phone,
			InputStream cv) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.city = city;
		this.jobType = jobType;
		this.phone = phone;
		this.cv = cv;
	}

	public User(String name, String email, String password, String city, String jobType, long phone, InputStream cv,
			InputStream image) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.city = city;
		this.jobType = jobType;
		this.phone = phone;
		this.cv = cv;
		this.image = image;
	}

	/*
	 * fetch image wala constructor
	 */

	public User(String name, String email, String city, String jobType, long phone,
			InputStream image) {
		super();
		this.name = name;
		this.email = email;
		this.city = city;
		this.jobType = jobType;
		this.phone = phone;
		this.image = image;
	}

	/*
	 * login wala constructor
	 */
	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	

	public User(int id, String email, String password) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public InputStream getCv() {
		return cv;
	}

	public void setCv(InputStream cv) {
		this.cv = cv;
	}

	public InputStream getImage() {
		return image;
	}

	public void setImage(InputStream image) {
		this.image = image;
	}	
	
}
