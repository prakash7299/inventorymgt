<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<title>Computer Registeration</title>
</head>
<body>

<h1>Computer Registeration submits post request</h1>

<form:form method="post" action="/processpostadd" modelAttribute="computer">

<div>


<label>Name</label>
<form:input path="computername"/>

</div>
<div>


<label>Name</label>
<form:input path="deskSpace"/>

</div>



<input type="submit" value="Create Computer">

</form:form>

</body>
</html>