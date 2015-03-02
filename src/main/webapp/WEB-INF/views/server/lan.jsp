<%@ page session="true"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="lan" scope="session" class="com.synitl.server.pojo.Lan"/>
<%@ taglib prefix="jc" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code = "server_lan_title"/></title>
</head>
<body>
<div id=bar>
<span><spring:message code="server_lan_general"/></span>
<span><spring:message code="server_lan_radius_groups"/></span>
<span><spring:message code="server_lan_exchanges"/></span>
<span><spring:message code="server_lan_advance"/></span>
<span><spring:message code="server_lan_log_setting"/></span>
</div>
<div id=details></div>
<div id=general></div>
<div id=radiusgroups>
<div><spring:message code="server_lan_radius_groups_title"/>
<div>
<table>
<tr><td><spring:message code="server_lan_radius_groups_table_header_group_name" /></td><spring:message code="server_lan_radius_groups_table_header_server" /><td></td></tr>
</table></div>
<div><button><spring:message code="server_lan_button_add" /></button><br>
<div><button><spring:message code="server_lan_button_edit" /></button><br>
<div><button><spring:message code="server_lan_button_remove" /></button><br>
</div>
</div>
</div>
<div id=exchanges>
<div><spring:message code="server_lan_exchanges_title"/>
<div>
<table>
<tr><td><spring:message code="server_lan_exchanges_table_header_enable" /></td><td><spring:message code="server_lan_exchanges_table_header_name" /></td><td><spring:message code="server_lan_exchanges_table_header_model" /></td><td><spring:message code="server_lan_exchanges_table_header_ip" /></td></tr>
</table></div>
<div><button><spring:message code="server_lan_button_add" /></button><br>
<div><button><spring:message code="server_lan_button_edit" /></button><br>
<div><button><spring:message code="server_lan_button_remove" /></button><br>
</div>
</div>
</div>
<div id =advance>
<div><spring:message code="server_lan_advance_allowed_protocols"/>
<div>
<input type="checkbox"><spring:message code="server_lan_advance_protocol_dhcp_ipv4"/><br>
<input type="checkbox"><spring:message code="server_lan_advance_protocol_dns_ipv4"/><br>
<input type="checkbox"><spring:message code="server_lan_advance_protocol_arp"/><br>
<input type="checkbox"><spring:message code="server_lan_advance_protocol_ipv6"/><br>
<input type="checkbox"><spring:message code="server_lan_advance_protocol_non_ip_arp"/><br>
<spring:message code="server_lan_advance_protocol_non_ip_arp_filter"/><input>
</div>
</div>
<div>
<input type="checkbox"><spring:message code="server_lan_advance_allow_legacy_client"/><br>
<input type="checkbox"><spring:message code="server_lan_advance_local_validation"/><br>
<input type="checkbox"><spring:message code="server_lan_advance_internet_timing"/><br>
<spring:message code="server_lan_advance_ntp_server"/><input>
<input type="checkbox"><spring:message code="server_lan_advance_server_check"/><br>
<spring:message code="server_lan_advances_server_check_interval"/><input>
</div>
</div>
<div id=log_settings>
<span><spring:message code="server_lan_log_settings_description_bar"/></span>
<div>
<spring:message code="server_lan_log_settings_server_log"/>
<div>
<input type="radio"><spring:message code="server_lan_log_settings_log_enable"/><input type="radio"><spring:message code="server_lan_log_settings_log_upload"/><br>
<spring:message code="server_lan_log_settings_log_max_size"/><input><spring:message code="server_lan_log_settings_size"/><br>
<spring:message code="server_lan_log_settings_log_record_life_time"/><input><spring:message code="server_lan_log_settings_day"/>
</div>
</div>
<div>
<spring:message code="server_lan_log_settings_client_log"/>
<div>
<input type="radio"><spring:message code="server_lan_log_settings_log_enable"/><input type="radio"><spring:message code="server_lan_log_settings_log_upload"/><br>
<spring:message code="server_lan_log_settings_log_max_size"/><input><spring:message code="server_lan_log_settings_size"/><br>
<spring:message code="server_lan_log_settings_log_record_life_time"/><input><spring:message code="server_lan_log_settings_day"/>
</div>
</div>
<div>
<spring:message code="server_lan_log_settings_comm_log"/>
<div>
<input type="radio"><spring:message code="server_lan_log_settings_log_enable"/><input type="radio"><spring:message code="server_lan_log_settings_log_upload"/><br>
<spring:message code="server_lan_log_settings_log_max_size"/><input><spring:message code="server_lan_log_settings_size"/><br>
<spring:message code="server_lan_log_settings_log_record_life_time"/><input><spring:message code="server_lan_log_settings_day"/><br>
<spring:message code="server_lan_log_settings_comm_log_filter"/><select></select>
</div>
</div>
</div>

<div id=footer>
<button><spring:message code="server_lan_button_ok"/></button>
<button><spring:message code="server_lan_button_cancel"/></button>
<button><spring:message code="server_lan_button_help"/></button>
</div>
</body>
</html>