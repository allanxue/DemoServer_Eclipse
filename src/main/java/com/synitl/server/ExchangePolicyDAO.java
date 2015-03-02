package com.synitl.server;

import java.util.List;
import java.sql.Timestamp;

import com.synitl.server.pojo.ExchangePolicy;
/**
 * <p>Generic DAO layer for ExchangePolicys</p>
 * <p>Generated at Thu Feb 26 22:49:48 PST 2015</p>
 *
 * @author Salto-db Generator v1.0.16 / Pojos + Hibernate mapping + Generic DAO
 * @see http://www.hibernate.org/328.html
 */
public interface ExchangePolicyDAO extends GenericDAO<ExchangePolicy,Integer> {

	/*
	 * TODO : Add specific businesses daos here.
	 * These methods will be overwrited if you re-generate this interface.
	 * You might want to extend this interface and to change the dao factory to return 
	 * an instance of the new implemenation in buildExchangePolicyDAO()
	 */
	  	 
	/**
	 * Find ExchangePolicy by lanId
	 */
	public List<ExchangePolicy> findByLanId(Integer lanId);

	/**
	 * Find ExchangePolicy by name
	 */
	public List<ExchangePolicy> findByName(String name);

	/**
	 * Find ExchangePolicy by enabled
	 */
	public List<ExchangePolicy> findByEnabled(Boolean enabled);

	/**
	 * Find ExchangePolicy by model
	 */
	public List<ExchangePolicy> findByModel(String model);

	/**
	 * Find ExchangePolicy by ip
	 */
	public List<ExchangePolicy> findByIp(String ip);

	/**
	 * Find ExchangePolicy by seq
	 */
	public List<ExchangePolicy> findBySeq(Integer seq);

}