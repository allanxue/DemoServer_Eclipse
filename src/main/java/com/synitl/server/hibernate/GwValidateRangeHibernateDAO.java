package com.synitl.server.hibernate;

import java.util.List;
import java.sql.Timestamp;

import com.synitl.server.pojo.GwValidateRange;
import com.synitl.server.GwValidateRangeDAO;

import org.hibernate.criterion.Restrictions;

/**
 * <p>Hibernate DAO layer for GwValidateRanges</p>
 * <p>Generated at Thu Feb 26 22:49:48 PST 2015</p>
 *
 * @author Salto-db Generator v1.0.16 / Pojos + Hibernate mapping + Generic DAO
 * @see http://www.hibernate.org/328.html
 */
public class GwValidateRangeHibernateDAO extends
		AbstractHibernateDAO<GwValidateRange, Integer> implements
		GwValidateRangeDAO {

	/**
	 * Find GwValidateRange by selectiveValidation
	 */
	public List<GwValidateRange> findBySelectiveValidation(Boolean selectiveValidation) {
		return findByCriteria(Restrictions.eq("selectiveValidation", selectiveValidation));
	}
	
	/**
	 * Find GwValidateRange by trustIpRangeIndex
	 */
	public List<GwValidateRange> findByTrustIpRangeIndex(Integer trustIpRangeIndex) {
		return findByCriteria(Restrictions.eq("trustIpRangeIndex", trustIpRangeIndex));
	}
	
	/**
	 * Find GwValidateRange by validateIpReange
	 */
	@SuppressWarnings("unchecked")
	public List<GwValidateRange> findByValidateIpReange(Integer validateIpReange) {
		return findByCriteria(Restrictions.eq("gwValidateIpRange.validateIpReange", validateIpReange));
	}
	
	/**
	 * Find GwValidateRange by trustIpRange
	 */
	@SuppressWarnings("unchecked")
	public List<GwValidateRange> findByTrustIpRange(Integer trustIpRange) {
		return findByCriteria(Restrictions.eq("gwValidateIpRange.trustIpRange", trustIpRange));
	}
	

}
