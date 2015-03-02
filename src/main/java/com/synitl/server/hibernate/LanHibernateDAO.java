package com.synitl.server.hibernate;

import java.util.List;
import java.sql.Timestamp;

import com.synitl.server.pojo.Lan;
import com.synitl.server.LanDAO;

import org.hibernate.criterion.Restrictions;

/**
 * <p>Hibernate DAO layer for Lans</p>
 * <p>Generated at Thu Feb 26 22:49:48 PST 2015</p>
 *
 * @author Salto-db Generator v1.0.16 / Pojos + Hibernate mapping + Generic DAO
 * @see http://www.hibernate.org/328.html
 */
public class LanHibernateDAO extends
		AbstractHibernateDAO<Lan, Integer> implements
		LanDAO {

	/**
	 * Find Lan by radiusgroupId
	 */
	@SuppressWarnings("unchecked")
	public List<Lan> findByRadiusgroupId(Integer radiusgroupId) {
		return findByCriteria(Restrictions.eq("radiusgroup.radiusgroupId", radiusgroupId));
	}
	
	/**
	 * Find Lan by exchangepolicyId
	 */
	public List<Lan> findByExchangepolicyId(Integer exchangepolicyId) {
		return findByCriteria(Restrictions.eq("exchangepolicyId", exchangepolicyId));
	}
	
	/**
	 * Find Lan by enforcerAdvancesettingId
	 */
	@SuppressWarnings("unchecked")
	public List<Lan> findByEnforcerAdvancesettingId(Integer enforcerAdvancesettingId) {
		return findByCriteria(Restrictions.eq("enforcerAdvanceSettings.enforcerAdvancesettingId", enforcerAdvancesettingId));
	}
	
	/**
	 * Find Lan by enforcerLogsettingId
	 */
	@SuppressWarnings("unchecked")
	public List<Lan> findByEnforcerLogsettingId(Integer enforcerLogsettingId) {
		return findByCriteria(Restrictions.eq("enforcerLogsetting.enforcerLogsettingId", enforcerLogsettingId));
	}
	

}
