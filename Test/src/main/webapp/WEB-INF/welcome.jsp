<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="lib/bootstrap-3.3.1/css/bootstrap.min.css">
</head>
<body>
<div class="container">
<form class="mt-5 w-50 mx-auto" action="/employee" >
<div  class="form-group">
Employee Name:<input type="text" class="form-control" name="empname" value="${emp.empname}">
</div>
<div  class="form-group">
Employee ID:<input type="text" class="form-control" name="empid" value="${emp.empid}">
</div>
<div  class="form-group">
Employee Phone:<input type="text" class="form-control" name="empphone" value="${emp.empphone}">
</div>
<div  class="form-group">
Employee Email:<input type="text" class="form-control" name="empemail" value="${emp.empemail}">
</div>
<div style="text-align:center">
<button type="submit" class="btn btn-primary" name="save">Save</button>&nbsp&nbsp
<button type="submit" class="btn btn-primary" name="open">Open</button>&nbsp&nbsp
<button type="submit" class="btn btn-primary" name="update">Update</button>&nbsp&nbsp
<button type="submit" class="btn btn-primary" name="delete">Delete</button>&nbsp&nbsp
</div>
</form>
</div>
</body>
</html>