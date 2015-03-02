package com.synitl.server;

import java.util.List;
import java.sql.Timestamp;

import com.synitl.server.pojo.ExchangeAction;
/**
 * <p>Generic DAO layer for ExchangeActions</p>
 * <p>Generated at Thu Feb 26 22:49:48 PST 2015</p>
 *
 * @author Salto-db Generator v1.0.16 / Pojos + Hibernate mapping + Generic DAO
 * @see http://www.hibernate.org/328.html
 */
public interface ExchangeActionDAO extends GenericDAO<ExchangeAction,Integer> {

	/*
	 * TODO : Add specific businesses daos here.
	 * These methods will be overwrited if you re-generate this interface.
	 * You might want to extend this interface and to change the dao factory to return 
	 * an instance of the new implemenation in buildExchangeActionDAO()
	 */
	  	 
	/**
	 * Find ExchangeAction by exchangeId
	 */
	public List<ExchangeAction> findByExchangeId(Integer exchangeId);

	/**
	 * Find ExchangeAction by seq
	 */
	public List<ExchangeAction> findBySeq(Integer seq);

	/**
	 * Find ExchangeAction by hiStatus
	 */
	public List<ExchangeAction> findByHiStatus(Boolean hiStatus);

	/**
	 * Find ExchangeAction by userAuth
	 */
	public List<ExchangeAction> findByUserAuth(Boolean userAuth);

	/**
	 * Find ExchangeAction by policyCheck
	 */
	public List<ExchangeAction> findByPolicyCheck(Boolean policyCheck);

	/**
	 * Find ExchangeAction by action
	 */
	public List<ExchangeAction> findByAction(Integer action);

}