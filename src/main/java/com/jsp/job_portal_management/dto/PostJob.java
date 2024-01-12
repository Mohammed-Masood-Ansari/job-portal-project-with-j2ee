package com.jsp.job_portal_management.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostJob {
	private int id;
	private String name;
	private String email;
	private long phone;
	private String title;
	private String location;
	private String experience;
	private String description;
	private String skills;
	private String role;
	private String salary;
	private String verify;
}
