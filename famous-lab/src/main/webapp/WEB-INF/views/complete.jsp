<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Complete List</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">

 <!-- Bootstrap core CSS -->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<main class="container">
	<p></p><a href="/tiny" class ="btn btn-primary">Click Here For Tiny Results!</a><p></p>

	<table class="table">
		<thead>
			<tr>
				<th>First Name</th><th>Last Name</th><th>Innovation</th><th>Year</th>
			</tr>
		</thead>
	<tbody>
		<c:forEach var="hof" items="${completelist}">
			<tr>
				<td >${hof.firstName}</td>
				<td >${hof.lastName}</td>
				<td >${hof.innovation}</td>
				<td >${hof.year}</td>
			</tr>
		</c:forEach>
	</tbody>
	</table>

</main>
</body>
</html>