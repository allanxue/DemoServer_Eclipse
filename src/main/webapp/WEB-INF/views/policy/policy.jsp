<%@ page session="true"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="client" scope="application" class="com.synitl.server.pojo.Client"/>
<%@ taglib prefix="jc" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="policy_title" /></title>
</head>
<body style="width: 100%; ">
	
	<table><tr><td>
	<div style="width: 197px; height: 100%; background:gray">
	<span><spring:message code="policy_title" /></span><br>
	<span><spring:message code="summary" /></span><br>
	<span><spring:message code="requirement" /></span><br>
	<span><spring:message code="advancesettings" /></span><br>
	</div></td><td>
	
	<div style="width: 800px; height: 100%; background:white; id: advance">
	<span><spring:message code="advancesettings" /></span>
	<hr>
	<spring:message code="requirement_option_label" />
	<hr>
	<form>
		<input type="radio" id="requirement_option_always"> <spring:message code="requirement_option_always"/></input><br>
		<input type="radio" id="requirement_option_gateway_only"><spring:message code="requirement_option_gateway_only"/></input><br>
		<input type="radio" id="requirement_option_managedserver_only"><spring:message code="requirement_option_managedserver_only"/></input><br>
		<input type="radio" id="requirement_option_never"><spring:message code="requirement_option_never"/></input>
	</form>


	<span><spring:message code="requirement_rules"/> </span>
	<hr>
	<table>
	<tr><td><spring:message code="requirement_table_header_expand"/></td><td><spring:message code="requirement_table_header_name"/></td><td><spring:message code="requirement_table_header_status"/></td></tr>
	<jc:forEach var = "rule" items="">
	<tr><td/><td><jc:out value=""/></td><td><input type="radio" text='<spring:message code='requirement_table_header_status'/>' checked='<jc:out value=""></jc:out>'></td></tr>
	<jc:out value=""/>
	</jc:forEach>
	</table>
</div></td>
</table>
</body>
</html>