package com.synitl.server;

import java.util.List;
import java.sql.Timestamp;

import com.synitl.server.pojo.GwValidateRange;
/**
 * <p>Generic DAO layer for GwValidateRanges</p>
 * <p>Generated at Thu Feb 26 22:49:48 PST 2015</p>
 *
 * @author Salto-db Generator v1.0.16 / Pojos + Hibernate mapping + Generic DAO
 * @see http://www.hibernate.org/328.html
 */
public interface GwValidateRangeDAO extends GenericDAO<GwValidateRange,Integer> {

	/*
	 * TODO : Add specific businesses daos here.
	 * These methods will be overwrited if you re-generate this interface.
	 * You might want to extend this interface and to change the dao factory to return 
	 * an instance of the new implemenation in buildGwValidateRangeDAO()
	 */
	  	 
	/**
	 * Find GwValidateRange by selectiveValidation
	 */
	public List<GwValidateRange> findBySelectiveValidation(Boolean selectiveValidation);

	/**
	 * Find GwValidateRange by trustIpRangeIndex
	 */
	public List<GwValidateRange> findByTrustIpRangeIndex(Integer trustIpRangeIndex);

	/**
	 * Find GwValidateRange by validateIpReange
	 */
	public List<GwValidateRange> findByValidateIpReange(Integer validateIpReange);

	/**
	 * Find GwValidateRange by trustIpRange
	 */
	public List<GwValidateRange> findByTrustIpRange(Integer trustIpRange);

}