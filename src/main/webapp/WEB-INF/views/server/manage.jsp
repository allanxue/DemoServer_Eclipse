<%@ page session="true"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="site" scope="session" class="com.synitl.server.manage.Site"/>
<jsp:useBean id="manageserver" scope="session" class="com.synitl.server.pojo.ManageServer"/>
<jsp:useBean id="lan" scope="session" class="com.synitl.server.pojo.Lan"/>
<jsp:useBean id="gw" scope="session" class="com.synitl.server.pojo.Gw"/>
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
<li><jc:out value ="${gateway.getName()}"/> </li>
<li>haha</li>
</jc:forEach>
</jc:if>
</ul>
</ul>


</td><br> <td style="width: 92px; ">
<span><spring:message  code = "server_manage_tree_root"></spring:message></span><br>
<div id = 'server_detail'></div>
<div id = 'lan_detail'></div>
<div id = 'gw_detail'>
<jc:if test="${site.getGws()!= null}">
<jc:set var = "gateway"  value="${site.getGws().get(0)}"></jc:set>
<span><spring:message code="server_manage_detail_name" />:<jc:out value="${gateway.getName()}"></jc:out></span><br>
<span><spring:message code="server_manage_detail_descriptioin" />:<jc:out value="${gateway.getDescription()}"/></span><br>
<span><spring:message code="server_manage_detail_creation_time" />:<jc:out value="${gateway.getCreationTime()}"/></span><br>
<span><spring:message code="server_manage_detail_last_update_time" />:<jc:out value="${gateway.getLastUpdateTime()}"/></span><br>
<span><spring:message code="server_manage_detail_enforce_status" />:<jc:out value="${gateway.getEnabled()}"/></span><br>
</jc:if>
</div>

</td></tr></table>
</body>
</html>