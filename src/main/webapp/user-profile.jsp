<%@page import="com.jsp.job_portal_management.dto.User"%>
<%@page import="com.jsp.job_portal_management.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
	rel="stylesheet" />
<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"
	rel="stylesheet" />
<!-- MDB -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/7.1.0/mdb.min.css"
	rel="stylesheet" />

<link rel="stylesheet" src="user-profile.css" />
</head>
<body>
	
	<jsp:include page="user-navbar.jsp"></jsp:include>
	
	<%
			HttpSession httpSession = request.getSession();
			
			String userEmail =(String) httpSession.getAttribute("userSession");
	
			UserDao dao = new UserDao();
	
			User user=dao.getAllUserDetailsByEmailDao(userEmail);
	%>

	
	<div class="container rounded bg-white mt-5 mb-5">
		<div class="row">
			<div class="col-md-3 border-right">
				<div
					class="d-flex flex-column align-items-center text-center p-3 py-5">
					<img class="rounded-circle mt-5" width="150px"
						src="https://st3.depositphotos.com/15648834/17930/v/600/depositphotos_179308454-stock-illustration-unknown-person-silhouette-glasses-profile.jpg"><span
						class="font-weight-bold">Edogaru</span><span class="text-black-50">edogaru@mail.com.my</span><span>
					</span>
				</div>
			</div>
			<div class="col-md-5 border-right">
				<div class="p-3 py-5">
					<div class="d-flex justify-content-between align-items-center mb-3">
						<h4 class="text-right">Profile Settings</h4>
					</div>
					<div class="row mt-2">
						<div class="col-md-6">
							<label class="labels">Name</label><input type="text"
								class="form-control" placeholder="first name" value="<%=user.getName()%>" >
						</div>
						<div class="col-md-6">
							<label class="labels">Surname</label><input type="text"
								class="form-control" value="" placeholder="surname">
						</div>
					</div>
					<div class="row mt-3">
						<div class="col-md-12">
							<label class="labels">Mobile Number</label><input type="text"
								class="form-control" placeholder="enter phone number" value="">
						</div>
						<div class="col-md-12">
							<label class="labels">Address Line 1</label><input type="text"
								class="form-control" placeholder="enter address line 1" value="">
						</div>
						<div class="col-md-12">
							<label class="labels">Address Line 2</label><input type="text"
								class="form-control" placeholder="enter address line 2" value="">
						</div>
						<div class="col-md-12">
							<label class="labels">Postcode</label><input type="text"
								class="form-control" placeholder="enter address line 2" value="">
						</div>
						<div class="col-md-12">
							<label class="labels">State</label><input type="text"
								class="form-control" placeholder="enter address line 2" value="">
						</div>
						<div class="col-md-12">
							<label class="labels">Area</label><input type="text"
								class="form-control" placeholder="enter address line 2" value="">
						</div>
						<div class="col-md-12">
							<label class="labels">Email ID</label><input type="text"
								class="form-control" placeholder="enter email id" value="">
						</div>
						<div class="col-md-12">
							<label class="labels">Education</label><input type="text"
								class="form-control" placeholder="education" value="">
						</div>
					</div>
					<div class="row mt-3">
						<div class="col-md-6">
							<label class="labels">Country</label><input type="text"
								class="form-control" placeholder="country" value="">
						</div>
						<div class="col-md-6">
							<label class="labels">State/Region</label><input type="text"
								class="form-control" value="" placeholder="state">
						</div>
					</div>
					<div class="mt-5 text-center">
						<button class="btn btn-primary profile-button" type="button">Save
							Profile</button>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="p-3 py-5">
					<div
						class="d-flex justify-content-between align-items-center experience">
						<span>Edit Experience</span><span
							class="border px-3 p-1 add-experience"><i
							class="fa fa-plus"></i>&nbsp;Experience</span>
					</div>
					<br>
					<div class="col-md-12">
						<label class="labels">Experience in Designing</label><input
							type="text" class="form-control" placeholder="experience"
							value="">
					</div>
					<br>
					<div class="col-md-12">
						<label class="labels">Additional Details</label><input type="text"
							class="form-control" placeholder="additional details" value="">
					</div>
				</div>
			</div>
		</div>
	</div>
	</div>
	</div>
</body>
</html>