package com.synitl.server.hibernate;

import java.util.List;
import java.sql.Timestamp;

import com.synitl.server.pojo.EnforcerAdvanceSettings;
import com.synitl.server.EnforcerAdvanceSettingsDAO;

import org.hibernate.criterion.Restrictions;

/**
 * <p>Hibernate DAO layer for EnforcerAdvanceSettingss</p>
 * <p>Generated at Thu Feb 26 22:49:48 PST 2015</p>
 *
 * @author Salto-db Generator v1.0.16 / Pojos + Hibernate mapping + Generic DAO
 * @see http://www.hibernate.org/328.html
 */
public class EnforcerAdvanceSettingsHibernateDAO extends
		AbstractHibernateDAO<EnforcerAdvanceSettings, Integer> implements
		EnforcerAdvanceSettingsDAO {

	/**
	 * Find EnforcerAdvanceSettings by dhcpIpv4Allow
	 */
	public List<EnforcerAdvanceSettings> findByDhcpIpv4Allow(Boolean dhcpIpv4Allow) {
		return findByCriteria(Restrictions.eq("dhcpIpv4Allow", dhcpIpv4Allow));
	}
	
	/**
	 * Find EnforcerAdvanceSettings by dnsIpv4Allow
	 */
	public List<EnforcerAdvanceSettings> findByDnsIpv4Allow(Boolean dnsIpv4Allow) {
		return findByCriteria(Restrictions.eq("dnsIpv4Allow", dnsIpv4Allow));
	}
	
	/**
	 * Find EnforcerAdvanceSettings by arpAllow
	 */
	public List<EnforcerAdvanceSettings> findByArpAllow(Boolean arpAllow) {
		return findByCriteria(Restrictions.eq("arpAllow", arpAllow));
	}
	
	/**
	 * Find EnforcerAdvanceSettings by ipv6Allow
	 */
	public List<EnforcerAdvanceSettings> findByIpv6Allow(Boolean ipv6Allow) {
		return findByCriteria(Restrictions.eq("ipv6Allow", ipv6Allow));
	}
	
	/**
	 * Find EnforcerAdvanceSettings by allowNonIpAndNonArp
	 */
	public List<EnforcerAdvanceSettings> findByAllowNonIpAndNonArp(Boolean allowNonIpAndNonArp) {
		return findByCriteria(Restrictions.eq("allowNonIpAndNonArp", allowNonIpAndNonArp));
	}
	
	/**
	 * Find EnforcerAdvanceSettings by filter
	 */
	public List<EnforcerAdvanceSettings> findByFilter(String filter) {
		return findByCriteria(Restrictions.eq("filter", filter));
	}
	
	/**
	 * Find EnforcerAdvanceSettings by allowLegacyClient
	 */
	public List<EnforcerAdvanceSettings> findByAllowLegacyClient(Boolean allowLegacyClient) {
		return findByCriteria(Restrictions.eq("allowLegacyClient", allowLegacyClient));
	}
	
	/**
	 * Find EnforcerAdvanceSettings by enableLocalAuth
	 */
	public List<EnforcerAdvanceSettings> findByEnableLocalAuth(Boolean enableLocalAuth) {
		return findByCriteria(Restrictions.eq("enableLocalAuth", enableLocalAuth));
	}
	
	/**
	 * Find EnforcerAdvanceSettings by enableNtp
	 */
	public List<EnforcerAdvanceSettings> findByEnableNtp(Boolean enableNtp) {
		return findByCriteria(Restrictions.eq("enableNtp", enableNtp));
	}
	
	/**
	 * Find EnforcerAdvanceSettings by ntpServer
	 */
	public List<EnforcerAdvanceSettings> findByNtpServer(String ntpServer) {
		return findByCriteria(Restrictions.eq("ntpServer", ntpServer));
	}
	
	/**
	 * Find EnforcerAdvanceSettings by enableServerCheck
	 */
	public List<EnforcerAdvanceSettings> findByEnableServerCheck(Boolean enableServerCheck) {
		return findByCriteria(Restrictions.eq("enableServerCheck", enableServerCheck));
	}
	
	/**
	 * Find EnforcerAdvanceSettings by checkInterval
	 */
	public List<EnforcerAdvanceSettings> findByCheckInterval(Integer checkInterval) {
		return findByCriteria(Restrictions.eq("checkInterval", checkInterval));
	}
	

}
