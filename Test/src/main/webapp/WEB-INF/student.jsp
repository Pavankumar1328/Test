<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="lib/bootstrap-3.3.1/css/bootstrap.min.css">
</head>
<body>
<div class="container">
<form class="mt-5 w-50 mx-auto" action="/Student" >
<div  class="form-group">
Student ID:<input type="text" class="form-control" name="stuid" value="${stu.stuid}">
</div>
<div  class="form-group">
Student Name:<input type="text" class="form-control" name="stuname" value="${stu.stuname}">
</div>
<div  class="form-group">
Student Phone:<input type="text" class="form-control" name="stuphone" value="${stu.stuphone}">
</div>
<div  class="form-group">
Student Email:<input type="text" class="form-control" name="stuemail" value="${stu.stuemail}">
</div>
<div style="text-align:center">
<button type="submit" class="btn btn-primary" name="save">Save</button>&nbsp&nbsp
<button type="submit" class="btn btn-primary" name="openbyname">OpenByname</button>&nbsp&nbsp
<button type="submit" class="btn btn-primary" name="update">Update</button>&nbsp&nbsp
<button type="submit" class="btn btn-primary" name="delete">Delete</button>&nbsp&nbsp
<button type="submit" class="btn btn-primary" name="openall">OpenAll</button>&nbsp&nbsp
<button type="submit" class="btn btn-primary" name="openbycontaing">Openbycontaing</button>&nbsp&nbsp
</div>
</form>
</div>
</body>
</html>