package com.synitl.server.hibernate;

import java.util.List;
import java.sql.Timestamp;

import com.synitl.server.pojo.Radiusgroup;
import com.synitl.server.RadiusgroupDAO;

import org.hibernate.criterion.Restrictions;

/**
 * <p>Hibernate DAO layer for Radiusgroups</p>
 * <p>Generated at Thu Feb 26 22:49:48 PST 2015</p>
 *
 * @author Salto-db Generator v1.0.16 / Pojos + Hibernate mapping + Generic DAO
 * @see http://www.hibernate.org/328.html
 */
public class RadiusgroupHibernateDAO extends
		AbstractHibernateDAO<Radiusgroup, Integer> implements
		RadiusgroupDAO {

	/**
	 * Find Radiusgroup by nps
	 */
	public List<Radiusgroup> findByNps(Boolean nps) {
		return findByCriteria(Restrictions.eq("nps", nps));
	}
	

}
