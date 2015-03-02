package com.synitl.server;

import java.util.List;
import java.sql.Timestamp;

import com.synitl.server.pojo.Radius;
/**
 * <p>Generic DAO layer for Radiuss</p>
 * <p>Generated at Thu Feb 26 22:49:48 PST 2015</p>
 *
 * @author Salto-db Generator v1.0.16 / Pojos + Hibernate mapping + Generic DAO
 * @see http://www.hibernate.org/328.html
 */
public interface RadiusDAO extends GenericDAO<Radius,Integer> {

	/*
	 * TODO : Add specific businesses daos here.
	 * These methods will be overwrited if you re-generate this interface.
	 * You might want to extend this interface and to change the dao factory to return 
	 * an instance of the new implemenation in buildRadiusDAO()
	 */
	  	 
	/**
	 * Find Radius by name
	 */
	public List<Radius> findByName(String name);

	/**
	 * Find Radius by server
	 */
	public List<Radius> findByServer(String server);

	/**
	 * Find Radius by groupId
	 */
	public List<Radius> findByGroupId(Integer groupId);

}