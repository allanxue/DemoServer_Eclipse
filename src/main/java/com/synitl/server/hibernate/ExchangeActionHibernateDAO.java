package com.synitl.server.hibernate;

import java.util.List;
import java.sql.Timestamp;

import com.synitl.server.pojo.ExchangeAction;
import com.synitl.server.ExchangeActionDAO;

import org.hibernate.criterion.Restrictions;

/**
 * <p>Hibernate DAO layer for ExchangeActions</p>
 * <p>Generated at Thu Feb 26 22:49:48 PST 2015</p>
 *
 * @author Salto-db Generator v1.0.16 / Pojos + Hibernate mapping + Generic DAO
 * @see http://www.hibernate.org/328.html
 */
public class ExchangeActionHibernateDAO extends
		AbstractHibernateDAO<ExchangeAction, Integer> implements
		ExchangeActionDAO {

	/**
	 * Find ExchangeAction by exchangeId
	 */
	@SuppressWarnings("unchecked")
	public List<ExchangeAction> findByExchangeId(Integer exchangeId) {
		return findByCriteria(Restrictions.eq("exchangePolicy.exchangeId", exchangeId));
	}
	
	/**
	 * Find ExchangeAction by seq
	 */
	public List<ExchangeAction> findBySeq(Integer seq) {
		return findByCriteria(Restrictions.eq("seq", seq));
	}
	
	/**
	 * Find ExchangeAction by hiStatus
	 */
	public List<ExchangeAction> findByHiStatus(Boolean hiStatus) {
		return findByCriteria(Restrictions.eq("hiStatus", hiStatus));
	}
	
	/**
	 * Find ExchangeAction by userAuth
	 */
	public List<ExchangeAction> findByUserAuth(Boolean userAuth) {
		return findByCriteria(Restrictions.eq("userAuth", userAuth));
	}
	
	/**
	 * Find ExchangeAction by policyCheck
	 */
	public List<ExchangeAction> findByPolicyCheck(Boolean policyCheck) {
		return findByCriteria(Restrictions.eq("policyCheck", policyCheck));
	}
	
	/**
	 * Find ExchangeAction by action
	 */
	public List<ExchangeAction> findByAction(Integer action) {
		return findByCriteria(Restrictions.eq("action", action));
	}
	

}
