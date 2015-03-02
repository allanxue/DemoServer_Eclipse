<%@ page session="true"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="gw" scope="session" class="com.synitl.server.pojo.Gw"/>
<%@ taglib prefix="jc" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code = "server_gw_title"></spring:message></title>
</head>
<body>
<div id=bar>
<span><spring:message code="server_gw_general"/></span>
<span><spring:message code="server_gw_validation"/></span>
<span><spring:message code="server_gw_validation_range"/></span>
<span><spring:message code="server_gw_advance"/></span>
<span><spring:message code="server_gw_log_settings"/></span>
</div>
<div id=details></div>
<div id=general></div>
<div id=validation>
<div><spring:message code="server_gw_validation_parameters"/>
<div>
<spring:message code="server_gw_validation_max_package_per_session"/><input id = max_package/><br>
<spring:message code="server_gw_validation_interval"/><input id = interval/><br>
<spring:message code="server_gw_validation_ban_duration"/><input id = ban_duration/><br>
<spring:message code="server_gw_validation_allow_duration"/><input id = allow_duration/><br>
</div>
</div>
<input type="checkbox"><spring:message code="server_gw_validation_allow_all_clients_but_record"/><br>
<input type="checkbox"><spring:message code="server_gw_validation_allow_non_windows"/><br>
<input type="checkbox"><spring:message code="server_gw_validation_serial_first"/><br>
<input type="checkbox"><spring:message code="server_gw_validation_popup_message_first"/> <button><spring:message code="server_gw_validation_button_popup_message"/></button><br>
<input type="checkbox"><spring:message code="server_gw_validation_redirect"/><br>
<spring:message code="server_gw_validation_redirect_URL"/><input><br>
<spring:message code="server_gw_validation_redirect_port"/><input><br>
</div>
<div id =validation_range>
<div><spring:message code="server_gw_validation_client_range"/>
<div>
<input type="checkbox"><spring:message code="server_gw_validation_given_clieng_only"/><br>
<div>
<table>
<tr><td><spring:message code="server_gw_validation_table_header_enable"/></td><td><spring:message code="server_gw_validation_table_header_range"/></td></tr>
</table></div>
<div>
<button><spring:message code="server_gw_validation_button_add"/></button><br>
<button><spring:message code="server_gw_validation_button_edit_all"/></button><br>
<button><spring:message code="server_gw_validation_button_remove"/></button>
</div></div></div></div>
<div><spring:message code="server_gw_validation_trust_ip_range"/>
<div><spring:message code="server_gw_validation_trust_ip_range"/><select></select><br>
<table>
<tr><td><spring:message code="server_gw_validation_table_header_enable"/></td><td><spring:message code="server_gw_validation_table_header_range"/></td></tr>
</table>
</div>
<div><button><spring:message code="server_gw_validation_button_add"/></button><br>
<button><spring:message code="server_gw_validation_button_edit_all"/></button><br>
<button><spring:message code="server_gw_validation_button_remove"/></button></div></div>
<div id =advance>
<div><spring:message code="server_gw_advance_allowed_protocols"/>
<div>
<input type="checkbox"><spring:message code="server_gw_advance_protocol_dhcp_ipv4"/><br>
<input type="checkbox"><spring:message code="server_gw_advance_protocol_dns_ipv4"/><br>
<input type="checkbox"><spring:message code="server_gw_advance_protocol_arp"/><br>
<input type="checkbox"><spring:message code="server_gw_advance_protocol_ipv6"/><br>
<input type="checkbox"><spring:message code="server_gw_advance_protocol_non_ip_arp"/><br>
<spring:message code="server_gw_advance_protocol_non_ip_arp_filter"/><input>
</div>
</div>
<div>
<input type="checkbox"><spring:message code="server_gw_advance_allow_legacy_client"/><br>
<input type="checkbox"><spring:message code="server_gw_advance_local_validation"/><br>
<input type="checkbox"><spring:message code="server_gw_advance_internet_timing"/><br>
<spring:message code="server_gw_advance_ntp_server"/><input>
<input type="checkbox"><spring:message code="server_gw_advance_server_check"/><br>
<spring:message code="server_gw_advances_server_check_interval"/><input>
</div>
</div>
<div id=log_settings>
<span><spring:message code="server_gw_log_settings_description_bar"/></span>
<div>
<spring:message code="server_gw_log_settings_server_log"/>
<div>
<input type="radio"><spring:message code="server_gw_log_settings_log_enable"/><input type="radio"><spring:message code="server_gw_log_settings_log_upload"/><br>
<spring:message code="server_gw_log_settings_log_max_size"/><input><spring:message code="server_gw_log_settings_size"/><br>
<spring:message code="server_gw_log_settings_log_record_life_time"/><input><spring:message code="server_gw_log_settings_day"/>
</div>
</div>
<div>
<spring:message code="server_gw_log_settings_client_log"/>
<div>
<input type="radio"><spring:message code="server_gw_log_settings_log_enable"/><input type="radio"><spring:message code="server_gw_log_settings_log_upload"/><br>
<spring:message code="server_gw_log_settings_log_max_size"/><input><spring:message code="server_gw_log_settings_size"/><br>
<spring:message code="server_gw_log_settings_log_record_life_time"/><input><spring:message code="server_gw_log_settings_day"/>
</div>
</div>
<div>
<spring:message code="server_gw_log_settings_comm_log"/>
<div>
<input type="radio"><spring:message code="server_gw_log_settings_log_enable"/><input type="radio"><spring:message code="server_gw_log_settings_log_upload"/><br>
<spring:message code="server_gw_log_settings_log_max_size"/><input><spring:message code="server_gw_log_settings_size"/><br>
<spring:message code="server_gw_log_settings_log_record_life_time"/><input><spring:message code="server_gw_log_settings_day"/><br>
<spring:message code="server_gw_log_settings_comm_log_filter"/><select></select>
</div>
</div>
</div>

<div id=footer>
<button><spring:message code="server_gw_button_ok"/></button>
<button><spring:message code="server_gw_button_cancel"/></button>
<button><spring:message code="server_gw_button_help"/></button>
</div>
</body>
</html>