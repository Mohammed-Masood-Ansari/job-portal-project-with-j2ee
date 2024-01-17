<%@page import="java.io.IOException"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.sql.Blob"%>
<%@page import="com.jsp.job_portal_management.dto.User"%>
<%@page import="com.jsp.job_portal_management.dao.UserDao"%>
<%@ page import="org.apache.commons.io.IOUtils" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>User Details</title>
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
	/* ServletOutputStream outputStream = response.getOutputStream();*/
	User user = (User) request.getAttribute("userDetails");
	%>

	<%!
	// Function to convert InputStream to Base64 String
	private String getBase64Image(InputStream imageStream) {
	    try {
	        byte[] bytes = IOUtils.toByteArray(imageStream);
	        return java.util.Base64.getEncoder().encodeToString(bytes);
	    } catch (IOException e) {
	        e.printStackTrace();
	        return "";
	    }
}
%>

	<div class="container rounded bg-white mt-5 mb-5">
		<div class="row">
			<div class="col-md-3 border-right">
				<div
					class="d-flex flex-column align-items-center text-center p-3 py-5">
					<img class="rounded-circle mt-5" width="150px"
						src="data:image/jpeg;base64,<%= getBase64Image(user.getImage()) %>"><span
						class="font-weight-bold"><%=user.getName()%></span><span class="text-black-50"><%=user.getEmail()%></span><span>
					</span>
				</div>
			</div>
			<div class="col-md-5 border-right">
				<div class="p-3 py-5">
					<div class="d-flex justify-content-between align-items-center mb-3">
						<h4 class="text-right">Profile-Settings:</h4>
					</div>
					<div class="row mt-2">
						<div class="col-md-6">
							<label class="labels">Full-Name:</label><input type="text"
								class="form-control" placeholder="first name" name="name"
								value="<%=user.getName()%>">
						</div>
					</div>
					<div class="row mt-3">
						<div class="col-md-12">
							<label class="labels">Mobile-Number:</label><input type="text"
								class="form-control" placeholder="enter phone number" name="phone" value="<%=user.getPhone()%>">
						</div>
						<div class="col-md-12">
							<label class="labels">Current-Address:</label><input type="text"
								class="form-control" placeholder="enter current address" value="" name="current">
						</div>
						<div class="col-md-12">
							<label class="labels">Permanent-Address:</label><input type="text"
								class="form-control" placeholder="enter permanent address" value="" name="permanent">
						</div>
						<div class="col-md-12">
							<label class="labels">Pincode:</label><input type="text"
								class="form-control" placeholder="enter pin-code" value="" name="pincode">
						</div>
						<div class="col-md-12">
							<label class="labels">City:</label><input type="text"
								class="form-control" placeholder="enter your city" value="" name="city">
						</div>
						<div class="col-md-12">
							<label class="labels">Email-ID:</label><input type="email"
								class="form-control" placeholder="enter email id" value="<%=user.getEmail()%>" name="email">
						</div>
						<div class="col-md-12">
							<label class="labels">Education:</label><input type="text"
								class="form-control" placeholder="highest-Qualification-Branch" value="" name="education">
						</div>
					</div>
					<div class="row mt-3">
						<div class="col-md-6">
							<label class="labels">Country:</label><input type="text"
								class="form-control" placeholder="country" value="" name="country">
						</div>
						<div class="col-md-6">
							<label class="labels">State/Region:</label><input type="text"
								class="form-control" value="" placeholder="state" name="state">
						</div>
					</div>
					<div class="mt-5 text-center">
						<button class="btn btn-primary profile-button" type="button">Save
							Profile</button>
					</div>
				</div>
			</div>
			</div>
		</div>
	</div>
	</div>
	</div>
</body>
</html>