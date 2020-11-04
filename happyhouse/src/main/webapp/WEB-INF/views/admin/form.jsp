<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
	<h2>관리자 페이지</h2>

	<div class="container">
		<h2>회원 정보</h2>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Email</th>
					<th>password</th>
					<th>name</th>
					<th>grade</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="m" items="${members}">
					<tr>
						<td>${m.email}</td>
						<td>${m.password}</td>
						<td>${m.name}</td>
						<td>${m.grade}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>