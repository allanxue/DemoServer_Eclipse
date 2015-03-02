package com.synitl.server.hibernate;

import java.util.List;
import java.sql.Timestamp;

import com.synitl.server.pojo.Radius;
import com.synitl.server.RadiusDAO;

import org.hibernate.criterion.Restrictions;

/**
 * <p>Hibernate DAO layer for Radiuss</p>
 * <p>Generated at Thu Feb 26 22:49:48 PST 2015</p>
 *
 * @author Salto-db Generator v1.0.16 / Pojos + Hibernate mapping + Generic DAO
 * @see http://www.hibernate.org/328.html
 */
public class RadiusHibernateDAO extends
		AbstractHibernateDAO<Radius, Integer> implements
		RadiusDAO {

	/**
	 * Find Radius by name
	 */
	public List<Radius> findByName(String name) {
		return findByCriteria(Restrictions.eq("name", name));
	}
	
	/**
	 * Find Radius by server
	 */
	public List<Radius> findByServer(String server) {
		return findByCriteria(Restrictions.eq("server", server));
	}
	
	/**
	 * Find Radius by groupId
	 */
	@SuppressWarnings("unchecked")
	public List<Radius> findByGroupId(Integer groupId) {
		return findByCriteria(Restrictions.eq("radiusgroup.groupId", groupId));
	}
	

}
