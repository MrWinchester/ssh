<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:directive.include file="common/include/head.jspf"></jsp:directive.include>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	This is success.jsp page!
	name:<bean:write name="CodeTableForm" property="value(name)" /><br/>
	password:<bean:write name="CodeTableForm" property="value(password)" />
	
</body>
</html>