package com.synitl.server;

import java.util.List;
import java.sql.Timestamp;

import com.synitl.server.pojo.EnforcerAdvanceSettings;
/**
 * <p>Generic DAO layer for EnforcerAdvanceSettingss</p>
 * <p>Generated at Thu Feb 26 22:49:48 PST 2015</p>
 *
 * @author Salto-db Generator v1.0.16 / Pojos + Hibernate mapping + Generic DAO
 * @see http://www.hibernate.org/328.html
 */
public interface EnforcerAdvanceSettingsDAO extends GenericDAO<EnforcerAdvanceSettings,Integer> {

	/*
	 * TODO : Add specific businesses daos here.
	 * These methods will be overwrited if you re-generate this interface.
	 * You might want to extend this interface and to change the dao factory to return 
	 * an instance of the new implemenation in buildEnforcerAdvanceSettingsDAO()
	 */
	  	 
	/**
	 * Find EnforcerAdvanceSettings by dhcpIpv4Allow
	 */
	public List<EnforcerAdvanceSettings> findByDhcpIpv4Allow(Boolean dhcpIpv4Allow);

	/**
	 * Find EnforcerAdvanceSettings by dnsIpv4Allow
	 */
	public List<EnforcerAdvanceSettings> findByDnsIpv4Allow(Boolean dnsIpv4Allow);

	/**
	 * Find EnforcerAdvanceSettings by arpAllow
	 */
	public List<EnforcerAdvanceSettings> findByArpAllow(Boolean arpAllow);

	/**
	 * Find EnforcerAdvanceSettings by ipv6Allow
	 */
	public List<EnforcerAdvanceSettings> findByIpv6Allow(Boolean ipv6Allow);

	/**
	 * Find EnforcerAdvanceSettings by allowNonIpAndNonArp
	 */
	public List<EnforcerAdvanceSettings> findByAllowNonIpAndNonArp(Boolean allowNonIpAndNonArp);

	/**
	 * Find EnforcerAdvanceSettings by filter
	 */
	public List<EnforcerAdvanceSettings> findByFilter(String filter);

	/**
	 * Find EnforcerAdvanceSettings by allowLegacyClient
	 */
	public List<EnforcerAdvanceSettings> findByAllowLegacyClient(Boolean allowLegacyClient);

	/**
	 * Find EnforcerAdvanceSettings by enableLocalAuth
	 */
	public List<EnforcerAdvanceSettings> findByEnableLocalAuth(Boolean enableLocalAuth);

	/**
	 * Find EnforcerAdvanceSettings by enableNtp
	 */
	public List<EnforcerAdvanceSettings> findByEnableNtp(Boolean enableNtp);

	/**
	 * Find EnforcerAdvanceSettings by ntpServer
	 */
	public List<EnforcerAdvanceSettings> findByNtpServer(String ntpServer);

	/**
	 * Find EnforcerAdvanceSettings by enableServerCheck
	 */
	public List<EnforcerAdvanceSettings> findByEnableServerCheck(Boolean enableServerCheck);

	/**
	 * Find EnforcerAdvanceSettings by checkInterval
	 */
	public List<EnforcerAdvanceSettings> findByCheckInterval(Integer checkInterval);

}