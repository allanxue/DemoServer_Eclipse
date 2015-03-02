package com.synitl.server;

import java.util.List;
import java.sql.Timestamp;

import com.synitl.server.pojo.Radiusgroup;
/**
 * <p>Generic DAO layer for Radiusgroups</p>
 * <p>Generated at Thu Feb 26 22:49:48 PST 2015</p>
 *
 * @author Salto-db Generator v1.0.16 / Pojos + Hibernate mapping + Generic DAO
 * @see http://www.hibernate.org/328.html
 */
public interface RadiusgroupDAO extends GenericDAO<Radiusgroup,Integer> {

	/*
	 * TODO : Add specific businesses daos here.
	 * These methods will be overwrited if you re-generate this interface.
	 * You might want to extend this interface and to change the dao factory to return 
	 * an instance of the new implemenation in buildRadiusgroupDAO()
	 */
	  	 
	/**
	 * Find Radiusgroup by nps
	 */
	public List<Radiusgroup> findByNps(Boolean nps);

}