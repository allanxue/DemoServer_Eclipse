package com.synitl.server.hibernate;

import java.util.List;
import java.sql.Timestamp;

import com.synitl.server.pojo.ManageServer;
import com.synitl.server.ManageServerDAO;

import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>Hibernate DAO layer for ManageServers</p>
 * <p>Generated at Thu Feb 26 22:49:48 PST 2015</p>
 *
 * @author Salto-db Generator v1.0.16 / Pojos + Hibernate mapping + Generic DAO
 * @see http://www.hibernate.org/328.html
 */
@Transactional
public class ManageServerHibernateDAO extends
		AbstractHibernateDAO<ManageServer, Integer> implements
		ManageServerDAO {

	/**
	 * Find ManageServer by name
	 */
	public List<ManageServer> findByName(String name) {
		return findByCriteria(Restrictions.eq("name", name));
	}
	
	/**
	 * Find ManageServer by ip
	 */
	public List<ManageServer> findByIp(String ip) {
		return findByCriteria(Restrictions.eq("ip", ip));
	}
	
	/**
	 * Find ManageServer by description
	 */
	public List<ManageServer> findByDescription(String description) {
		return findByCriteria(Restrictions.eq("description", description));
	}
	

}
