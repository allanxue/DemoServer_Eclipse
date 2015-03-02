package com.synitl.server.hibernate;

import java.util.List;
import java.sql.Timestamp;

import com.synitl.server.pojo.ExchangePolicy;
import com.synitl.server.ExchangePolicyDAO;

import org.hibernate.criterion.Restrictions;

/**
 * <p>Hibernate DAO layer for ExchangePolicys</p>
 * <p>Generated at Thu Feb 26 22:49:48 PST 2015</p>
 *
 * @author Salto-db Generator v1.0.16 / Pojos + Hibernate mapping + Generic DAO
 * @see http://www.hibernate.org/328.html
 */
public class ExchangePolicyHibernateDAO extends
		AbstractHibernateDAO<ExchangePolicy, Integer> implements
		ExchangePolicyDAO {

	/**
	 * Find ExchangePolicy by lanId
	 */
	@SuppressWarnings("unchecked")
	public List<ExchangePolicy> findByLanId(Integer lanId) {
		return findByCriteria(Restrictions.eq("lan.lanId", lanId));
	}
	
	/**
	 * Find ExchangePolicy by name
	 */
	public List<ExchangePolicy> findByName(String name) {
		return findByCriteria(Restrictions.eq("name", name));
	}
	
	/**
	 * Find ExchangePolicy by enabled
	 */
	public List<ExchangePolicy> findByEnabled(Boolean enabled) {
		return findByCriteria(Restrictions.eq("enabled", enabled));
	}
	
	/**
	 * Find ExchangePolicy by model
	 */
	public List<ExchangePolicy> findByModel(String model) {
		return findByCriteria(Restrictions.eq("model", model));
	}
	
	/**
	 * Find ExchangePolicy by ip
	 */
	public List<ExchangePolicy> findByIp(String ip) {
		return findByCriteria(Restrictions.eq("ip", ip));
	}
	
	/**
	 * Find ExchangePolicy by seq
	 */
	public List<ExchangePolicy> findBySeq(Integer seq) {
		return findByCriteria(Restrictions.eq("seq", seq));
	}
	

}
