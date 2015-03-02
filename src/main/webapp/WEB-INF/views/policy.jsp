<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page session="true"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="client" scope="application" class="com.synitl.server.pojo.Client"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="policy_title" /></title>

</head>
<body>
<span>message is ${msg}</span>

<span>this is a test message from java bean client <jsp:getProperty name="client" property="user"/></span>

</body>
</html>