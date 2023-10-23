<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="complaint" method="post">
Person Name<input type="text" name="person_name" placeholder="person_name"/><br><br>
Mobile No.<input type="text" name="mobile_no" placeholder="mobile_no"/><br><br>
Address<input type="text" name="address" placeholder="address"/><br><br>
Street No<input type="text" name="street_no" placeholder="street_no"/><br><br>
Issue Name<input type="text" name="issue_name" placeholder="issue_name"/><br><br>
<button a href="<%@include file="success.jsp"%>"/>Submit</button><br><br></form>
</body>
</html>