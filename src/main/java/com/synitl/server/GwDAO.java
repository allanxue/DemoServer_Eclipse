package com.synitl.server;

import java.util.List;
import java.sql.Timestamp;

import com.synitl.server.pojo.Gw;
/**
 * <p>Generic DAO layer for Gws</p>
 * <p>Generated at Thu Feb 26 22:49:48 PST 2015</p>
 *
 * @author Salto-db Generator v1.0.16 / Pojos + Hibernate mapping + Generic DAO
 * @see http://www.hibernate.org/328.html
 */
public interface GwDAO extends GenericDAO<Gw,Integer> {

	/*
	 * TODO : Add specific businesses daos here.
	 * These methods will be overwrited if you re-generate this interface.
	 * You might want to extend this interface and to change the dao factory to return 
	 * an instance of the new implemenation in buildGwDAO()
	 */
	  	 
	/**
	 * Find Gw by maxPackageEachValidation
	 */
	public List<Gw> findByMaxPackageEachValidation(Integer maxPackageEachValidation);

	/**
	 * Find Gw by intervalDuringValidation
	 */
	public List<Gw> findByIntervalDuringValidation(Integer intervalDuringValidation);

	/**
	 * Find Gw by timeToBlockClient
	 */
	public List<Gw> findByTimeToBlockClient(Integer timeToBlockClient);

	/**
	 * Find Gw by allowTrustedClient
	 */
	public List<Gw> findByAllowTrustedClient(Integer allowTrustedClient);

	/**
	 * Find Gw by allowTrustedButRecordUntrusted
	 */
	public List<Gw> findByAllowTrustedButRecordUntrusted(Boolean allowTrustedButRecordUntrusted);

	/**
	 * Find Gw by nonHiForNonWindows
	 */
	public List<Gw> findByNonHiForNonWindows(Boolean nonHiForNonWindows);

	/**
	 * Find Gw by policySerialNumberFirst
	 */
	public List<Gw> findByPolicySerialNumberFirst(Boolean policySerialNumberFirst);

	/**
	 * Find Gw by popupForWindowsWithoutClient
	 */
	public List<Gw> findByPopupForWindowsWithoutClient(Boolean popupForWindowsWithoutClient);

	/**
	 * Find Gw by popupMessage
	 */
	public List<Gw> findByPopupMessage(String popupMessage);

	/**
	 * Find Gw by httpRedirectWithoutClient
	 */
	public List<Gw> findByHttpRedirectWithoutClient(Boolean httpRedirectWithoutClient);

	/**
	 * Find Gw by httpRedirectUrl
	 */
	public List<Gw> findByHttpRedirectUrl(String httpRedirectUrl);

	/**
	 * Find Gw by httpRedirectPort
	 */
	public List<Gw> findByHttpRedirectPort(Integer httpRedirectPort);

	/**
	 * Find Gw by enforcerLogsetting
	 */
	public List<Gw> findByEnforcerLogsetting(Integer enforcerLogsetting);

	/**
	 * Find Gw by enforcerAdvancesetting
	 */
	public List<Gw> findByEnforcerAdvancesetting(Integer enforcerAdvancesetting);

	/**
	 * Find Gw by gwValidationRange
	 */
	public List<Gw> findByGwValidationRange(Integer gwValidationRange);

}