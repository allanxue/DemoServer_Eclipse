package com.synitl.server;

import java.util.List;
import java.sql.Timestamp;

import com.synitl.server.pojo.Lan;
/**
 * <p>Generic DAO layer for Lans</p>
 * <p>Generated at Thu Feb 26 22:49:48 PST 2015</p>
 *
 * @author Salto-db Generator v1.0.16 / Pojos + Hibernate mapping + Generic DAO
 * @see http://www.hibernate.org/328.html
 */
public interface LanDAO extends GenericDAO<Lan,Integer> {

	/*
	 * TODO : Add specific businesses daos here.
	 * These methods will be overwrited if you re-generate this interface.
	 * You might want to extend this interface and to change the dao factory to return 
	 * an instance of the new implemenation in buildLanDAO()
	 */
	  	 
	/**
	 * Find Lan by radiusgroupId
	 */
	public List<Lan> findByRadiusgroupId(Integer radiusgroupId);

	/**
	 * Find Lan by exchangepolicyId
	 */
	public List<Lan> findByExchangepolicyId(Integer exchangepolicyId);

	/**
	 * Find Lan by enforcerAdvancesettingId
	 */
	public List<Lan> findByEnforcerAdvancesettingId(Integer enforcerAdvancesettingId);

	/**
	 * Find Lan by enforcerLogsettingId
	 */
	public List<Lan> findByEnforcerLogsettingId(Integer enforcerLogsettingId);

}