package com.synitl.server.hibernate;

import java.util.List;
import java.sql.Timestamp;

import com.synitl.server.pojo.GwValidateIpRange;
import com.synitl.server.GwValidateIpRangeDAO;

import org.hibernate.criterion.Restrictions;

/**
 * <p>Hibernate DAO layer for GwValidateIpRanges</p>
 * <p>Generated at Thu Feb 26 22:49:48 PST 2015</p>
 *
 * @author Salto-db Generator v1.0.16 / Pojos + Hibernate mapping + Generic DAO
 * @see http://www.hibernate.org/328.html
 */
public class GwValidateIpRangeHibernateDAO extends
		AbstractHibernateDAO<GwValidateIpRange, Integer> implements
		GwValidateIpRangeDAO {

	/**
	 * Find GwValidateIpRange by seq
	 */
	public List<GwValidateIpRange> findBySeq(Integer seq) {
		return findByCriteria(Restrictions.eq("seq", seq));
	}
	
	/**
	 * Find GwValidateIpRange by enable
	 */
	public List<GwValidateIpRange> findByEnable(Boolean enable) {
		return findByCriteria(Restrictions.eq("enable", enable));
	}
	
	/**
	 * Find GwValidateIpRange by ip
	 */
	public List<GwValidateIpRange> findByIp(String ip) {
		return findByCriteria(Restrictions.eq("ip", ip));
	}
	

}
