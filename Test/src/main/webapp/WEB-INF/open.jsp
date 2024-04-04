<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EMPLOYEE DETAILS</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="lib/bootstrap-3.3.1/css/bootstrap.min.css">
</head>
<body>
<div class="container">
<table class="table table-striped table-bordered table-hover">
<thead class="table table-dark">
<tr>
<td>STUDENT ID</td>
<td>STUDENT Name</td>
<td>STUDENT Phone</td>
<td>STUDENT EMAIL</td>
</tr>
</thead>
<c:forEach items="${opens}" var="open">
<tr>
<td>${open.stuid}</td>
<td>${open.stuname}</td>
<td>${open.stuphone}</td>
<td>${open.stuemail}</td>
</tr>
</c:forEach>
<tbody>
</tbody>
</table>
</div>
</body>
</html>