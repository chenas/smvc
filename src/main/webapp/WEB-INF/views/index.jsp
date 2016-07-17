<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  this is dymanic <br>
    ${theModelKey} <br>
    ${Service}<br>
    ${user.id} <br> ${user.name} <br>
    
    <c:forEach items="${userList}" var="user">
    	<c:out value="${user.id}" />
    	<c:out value="${user.name}" />   <br>
    </c:forEach>
    <c:forEach items="${userList2}" var="user">
	    	<c:out value="${user.id}" />
	    	<c:out value="${user.name}" /> <br>
    	<c:forEach items="${user.subIndexs}" var="sub">
	    	--<c:out value="${sub.id}" /> 
	    	--<c:out value="${sub.name}" />   <br>
    	</c:forEach>
    </c:forEach>
  </body>
</html>
