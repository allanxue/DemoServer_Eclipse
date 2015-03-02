package com.synitl.server.hibernate;

import java.util.List;
import java.sql.Timestamp;

import com.synitl.server.pojo.Gw;
import com.synitl.server.GwDAO;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 * <p>Hibernate DAO layer for Gws</p>
 * <p>Generated at Thu Feb 26 22:49:48 PST 2015</p>
 *
 * @author Salto-db Generator v1.0.16 / Pojos + Hibernate mapping + Generic DAO
 * @see http://www.hibernate.org/328.html
 */
public class GwHibernateDAO extends
		AbstractHibernateDAO<Gw, Integer> implements
		GwDAO {

	/**
	 * Find Gw by maxPackageEachValidation
	 */
	public List<Gw> findByMaxPackageEachValidation(Integer maxPackageEachValidation) {
		return findByCriteria(Restrictions.eq("maxPackageEachValidation", maxPackageEachValidation));
	}
	
	/**
	 * Find Gw by intervalDuringValidation
	 */
	public List<Gw> findByIntervalDuringValidation(Integer intervalDuringValidation) {
		return findByCriteria(Restrictions.eq("intervalDuringValidation", intervalDuringValidation));
	}
	
	/**
	 * Find Gw by timeToBlockClient
	 */
	public List<Gw> findByTimeToBlockClient(Integer timeToBlockClient) {
		return findByCriteria(Restrictions.eq("timeToBlockClient", timeToBlockClient));
	}
	
	/**
	 * Find Gw by allowTrustedClient
	 */
	public List<Gw> findByAllowTrustedClient(Integer allowTrustedClient) {
		return findByCriteria(Restrictions.eq("allowTrustedClient", allowTrustedClient));
	}
	
	/**
	 * Find Gw by allowTrustedButRecordUntrusted
	 */
	public List<Gw> findByAllowTrustedButRecordUntrusted(Boolean allowTrustedButRecordUntrusted) {
		return findByCriteria(Restrictions.eq("allowTrustedButRecordUntrusted", allowTrustedButRecordUntrusted));
	}
	
	/**
	 * Find Gw by nonHiForNonWindows
	 */
	public List<Gw> findByNonHiForNonWindows(Boolean nonHiForNonWindows) {
		return findByCriteria(Restrictions.eq("nonHiForNonWindows", nonHiForNonWindows));
	}
	
	/**
	 * Find Gw by policySerialNumberFirst
	 */
	public List<Gw> findByPolicySerialNumberFirst(Boolean policySerialNumberFirst) {
		return findByCriteria(Restrictions.eq("policySerialNumberFirst", policySerialNumberFirst));
	}
	
	/**
	 * Find Gw by popupForWindowsWithoutClient
	 */
	public List<Gw> findByPopupForWindowsWithoutClient(Boolean popupForWindowsWithoutClient) {
		return findByCriteria(Restrictions.eq("popupForWindowsWithoutClient", popupForWindowsWithoutClient));
	}
	
	/**
	 * Find Gw by popupMessage
	 */
	public List<Gw> findByPopupMessage(String popupMessage) {
		return findByCriteria(Restrictions.eq("popupMessage", popupMessage));
	}
	
	/**
	 * Find Gw by httpRedirectWithoutClient
	 */
	public List<Gw> findByHttpRedirectWithoutClient(Boolean httpRedirectWithoutClient) {
		return findByCriteria(Restrictions.eq("httpRedirectWithoutClient", httpRedirectWithoutClient));
	}
	
	/**
	 * Find Gw by httpRedirectUrl
	 */
	public List<Gw> findByHttpRedirectUrl(String httpRedirectUrl) {
		return findByCriteria(Restrictions.eq("httpRedirectUrl", httpRedirectUrl));
	}
	
	/**
	 * Find Gw by httpRedirectPort
	 */
	public List<Gw> findByHttpRedirectPort(Integer httpRedirectPort) {
		return findByCriteria(Restrictions.eq("httpRedirectPort", httpRedirectPort));
	}
	
	/**
	 * Find Gw by enforcerLogsetting
	 */
	@SuppressWarnings("unchecked")
	public List<Gw> findByEnforcerLogsetting(Integer enforcerLogsetting) {
		return findByCriteria(Restrictions.eq("enforcerLogsetting.enforcerLogsetting", enforcerLogsetting));
	}
	
	/**
	 * Find Gw by enforcerAdvancesetting
	 */
	@SuppressWarnings("unchecked")
	public List<Gw> findByEnforcerAdvancesetting(Integer enforcerAdvancesetting) {
		return findByCriteria(Restrictions.eq("enforcerAdvanceSettings.enforcerAdvancesetting", enforcerAdvancesetting));
	}
	
	/**
	 * Find Gw by gwValidationRange
	 */
	@SuppressWarnings("unchecked")
	public List<Gw> findByGwValidationRange(Integer gwValidationRange) {
		return findByCriteria(Restrictions.eq("gwValidateRange.gwValidationRange", gwValidationRange));
	}
	
	/**
	 * Find All
	 */
	@SuppressWarnings("unchecked")
	public List<Gw> findAll() {
		return findByCriteria(Restrictions.eq("enabled", 1));
	}
	
}
