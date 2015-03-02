package com.synitl.server;

import java.util.List;
import java.sql.Timestamp;

import com.synitl.server.pojo.GwValidateIpRange;
/**
 * <p>Generic DAO layer for GwValidateIpRanges</p>
 * <p>Generated at Thu Feb 26 22:49:48 PST 2015</p>
 *
 * @author Salto-db Generator v1.0.16 / Pojos + Hibernate mapping + Generic DAO
 * @see http://www.hibernate.org/328.html
 */
public interface GwValidateIpRangeDAO extends GenericDAO<GwValidateIpRange,Integer> {

	/*
	 * TODO : Add specific businesses daos here.
	 * These methods will be overwrited if you re-generate this interface.
	 * You might want to extend this interface and to change the dao factory to return 
	 * an instance of the new implemenation in buildGwValidateIpRangeDAO()
	 */
	  	 
	/**
	 * Find GwValidateIpRange by seq
	 */
	public List<GwValidateIpRange> findBySeq(Integer seq);

	/**
	 * Find GwValidateIpRange by enable
	 */
	public List<GwValidateIpRange> findByEnable(Boolean enable);

	/**
	 * Find GwValidateIpRange by ip
	 */
	public List<GwValidateIpRange> findByIp(String ip);

}