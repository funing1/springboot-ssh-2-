<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	Hello World!

	<br>
	
	
	<div>
	   <c:if test="${!empty list }">
	     <c:forEach items="${list }" var="li">
	       ${li},
	     </c:forEach>
	   </c:if>
	</div>
</body>
</html>