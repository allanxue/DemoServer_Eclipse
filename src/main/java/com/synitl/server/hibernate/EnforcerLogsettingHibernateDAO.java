package com.synitl.server.hibernate;

import java.util.List;
import java.sql.Timestamp;

import com.synitl.server.pojo.EnforcerLogsetting;
import com.synitl.server.EnforcerLogsettingDAO;

import org.hibernate.criterion.Restrictions;

/**
 * <p>Hibernate DAO layer for EnforcerLogsettings</p>
 * <p>Generated at Thu Feb 26 22:49:48 PST 2015</p>
 *
 * @author Salto-db Generator v1.0.16 / Pojos + Hibernate mapping + Generic DAO
 * @see http://www.hibernate.org/328.html
 */
public class EnforcerLogsettingHibernateDAO extends
		AbstractHibernateDAO<EnforcerLogsetting, Integer> implements
		EnforcerLogsettingDAO {

	/**
	 * Find EnforcerLogsetting by serverLogEnable
	 */
	public List<EnforcerLogsetting> findByServerLogEnable(Boolean serverLogEnable) {
		return findByCriteria(Restrictions.eq("serverLogEnable", serverLogEnable));
	}
	
	/**
	 * Find EnforcerLogsetting by serverLogUpload
	 */
	public List<EnforcerLogsetting> findByServerLogUpload(Boolean serverLogUpload) {
		return findByCriteria(Restrictions.eq("serverLogUpload", serverLogUpload));
	}
	
	/**
	 * Find EnforcerLogsetting by serverLogMax
	 */
	public List<EnforcerLogsetting> findByServerLogMax(Integer serverLogMax) {
		return findByCriteria(Restrictions.eq("serverLogMax", serverLogMax));
	}
	
	/**
	 * Find EnforcerLogsetting by serverLogRecord
	 */
	public List<EnforcerLogsetting> findByServerLogRecord(Integer serverLogRecord) {
		return findByCriteria(Restrictions.eq("serverLogRecord", serverLogRecord));
	}
	
	/**
	 * Find EnforcerLogsetting by clientLogEnable
	 */
	public List<EnforcerLogsetting> findByClientLogEnable(Boolean clientLogEnable) {
		return findByCriteria(Restrictions.eq("clientLogEnable", clientLogEnable));
	}
	
	/**
	 * Find EnforcerLogsetting by clientLogUpload
	 */
	public List<EnforcerLogsetting> findByClientLogUpload(Boolean clientLogUpload) {
		return findByCriteria(Restrictions.eq("clientLogUpload", clientLogUpload));
	}
	
	/**
	 * Find EnforcerLogsetting by clientLogMax
	 */
	public List<EnforcerLogsetting> findByClientLogMax(Integer clientLogMax) {
		return findByCriteria(Restrictions.eq("clientLogMax", clientLogMax));
	}
	
	/**
	 * Find EnforcerLogsetting by clientLogRecord
	 */
	public List<EnforcerLogsetting> findByClientLogRecord(Integer clientLogRecord) {
		return findByCriteria(Restrictions.eq("clientLogRecord", clientLogRecord));
	}
	
	/**
	 * Find EnforcerLogsetting by commLogEnable
	 */
	public List<EnforcerLogsetting> findByCommLogEnable(Boolean commLogEnable) {
		return findByCriteria(Restrictions.eq("commLogEnable", commLogEnable));
	}
	
	/**
	 * Find EnforcerLogsetting by commLogUpload
	 */
	public List<EnforcerLogsetting> findByCommLogUpload(Boolean commLogUpload) {
		return findByCriteria(Restrictions.eq("commLogUpload", commLogUpload));
	}
	
	/**
	 * Find EnforcerLogsetting by commLogMax
	 */
	public List<EnforcerLogsetting> findByCommLogMax(Integer commLogMax) {
		return findByCriteria(Restrictions.eq("commLogMax", commLogMax));
	}
	
	/**
	 * Find EnforcerLogsetting by commLogRecord
	 */
	public List<EnforcerLogsetting> findByCommLogRecord(Integer commLogRecord) {
		return findByCriteria(Restrictions.eq("commLogRecord", commLogRecord));
	}
	
	/**
	 * Find EnforcerLogsetting by commLogFilter
	 */
	public List<EnforcerLogsetting> findByCommLogFilter(Integer commLogFilter) {
		return findByCriteria(Restrictions.eq("commLogFilter", commLogFilter));
	}
	

}
