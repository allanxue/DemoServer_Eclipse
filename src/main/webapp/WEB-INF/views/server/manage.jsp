<%@ page session="true"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="site" scope="application" class="com.synitl.server.manage.Site"/>
<%@ taglib prefix="jc" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code = "server_manage_title"></spring:message></title>
</head>
<body>
<table><tr><td style="width: 290px; ">
<span><spring:message  code = "server_manage_tree_root"></spring:message></span><br><hr><br>
<ul><spring:message  code = "server_manage_tree_root"></spring:message>
<ul><spring:message  code = "server_manage_tree_local_server"></spring:message>
<li></li>
<jc:if test="${site.getLans() != null}">
<ul>Lan</ul>
</jc:if>

<jc:if test="${site.getGws()!= null}">
<ul>GW</ul>
<jc:forEach var = "gateway"  items="${site.getGws()}">
<li><jc:out value ="${site.getGws()[0].getPopupMessage()}"/> </li>
<li>haha</li>
</jc:forEach>
</jc:if>
</ul>
</ul>


</td><br> <td style="width: 92px; ">
<span><spring:message  code = "server_manage_tree_root"></spring:message></span><br>



</td></tr></table>
</body>
</html>