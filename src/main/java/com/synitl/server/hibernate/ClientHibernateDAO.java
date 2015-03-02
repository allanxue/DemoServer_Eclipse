package com.synitl.server.hibernate;

import java.util.List;
import java.sql.Timestamp;

import com.synitl.server.pojo.Client;
import com.synitl.server.ClientDAO;

import org.hibernate.criterion.Restrictions;

/**
 * <p>Hibernate DAO layer for Clients</p>
 * <p>Generated at Thu Feb 26 22:49:47 PST 2015</p>
 *
 * @author Salto-db Generator v1.0.16 / Pojos + Hibernate mapping + Generic DAO
 * @see http://www.hibernate.org/328.html
 */
public class ClientHibernateDAO extends
		AbstractHibernateDAO<Client, Integer> implements
		ClientDAO {

	/**
	 * Find Client by name
	 */
	public List<Client> findByName(String name) {
		return findByCriteria(Restrictions.eq("name", name));
	}
	
	/**
	 * Find Client by ip
	 */
	public List<Client> findByIp(String ip) {
		return findByCriteria(Restrictions.eq("ip", ip));
	}
	
	/**
	 * Find Client by mac
	 */
	public List<Client> findByMac(String mac) {
		return findByCriteria(Restrictions.eq("mac", mac));
	}
	
	/**
	 * Find Client by uuid
	 */
	public List<Client> findByUuid(String uuid) {
		return findByCriteria(Restrictions.eq("uuid", uuid));
	}
	
	/**
	 * Find Client by domain
	 */
	public List<Client> findByDomain(String domain) {
		return findByCriteria(Restrictions.eq("domain", domain));
	}
	
	/**
	 * Find Client by ip1
	 */
	public List<Client> findByIp1(String ip1) {
		return findByCriteria(Restrictions.eq("ip1", ip1));
	}
	
	/**
	 * Find Client by mac1
	 */
	public List<Client> findByMac1(String mac1) {
		return findByCriteria(Restrictions.eq("mac1", mac1));
	}
	
	/**
	 * Find Client by ip2
	 */
	public List<Client> findByIp2(String ip2) {
		return findByCriteria(Restrictions.eq("ip2", ip2));
	}
	
	/**
	 * Find Client by mac2
	 */
	public List<Client> findByMac2(String mac2) {
		return findByCriteria(Restrictions.eq("mac2", mac2));
	}
	
	/**
	 * Find Client by user
	 */
	public List<Client> findByUser(String user) {
		return findByCriteria(Restrictions.eq("user", user));
	}
	

}
