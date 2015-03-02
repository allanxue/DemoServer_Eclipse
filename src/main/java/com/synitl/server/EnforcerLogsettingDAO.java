package com.synitl.server;

import java.util.List;
import java.sql.Timestamp;

import com.synitl.server.pojo.EnforcerLogsetting;
/**
 * <p>Generic DAO layer for EnforcerLogsettings</p>
 * <p>Generated at Thu Feb 26 22:49:48 PST 2015</p>
 *
 * @author Salto-db Generator v1.0.16 / Pojos + Hibernate mapping + Generic DAO
 * @see http://www.hibernate.org/328.html
 */
public interface EnforcerLogsettingDAO extends GenericDAO<EnforcerLogsetting,Integer> {

	/*
	 * TODO : Add specific businesses daos here.
	 * These methods will be overwrited if you re-generate this interface.
	 * You might want to extend this interface and to change the dao factory to return 
	 * an instance of the new implemenation in buildEnforcerLogsettingDAO()
	 */
	  	 
	/**
	 * Find EnforcerLogsetting by serverLogEnable
	 */
	public List<EnforcerLogsetting> findByServerLogEnable(Boolean serverLogEnable);

	/**
	 * Find EnforcerLogsetting by serverLogUpload
	 */
	public List<EnforcerLogsetting> findByServerLogUpload(Boolean serverLogUpload);

	/**
	 * Find EnforcerLogsetting by serverLogMax
	 */
	public List<EnforcerLogsetting> findByServerLogMax(Integer serverLogMax);

	/**
	 * Find EnforcerLogsetting by serverLogRecord
	 */
	public List<EnforcerLogsetting> findByServerLogRecord(Integer serverLogRecord);

	/**
	 * Find EnforcerLogsetting by clientLogEnable
	 */
	public List<EnforcerLogsetting> findByClientLogEnable(Boolean clientLogEnable);

	/**
	 * Find EnforcerLogsetting by clientLogUpload
	 */
	public List<EnforcerLogsetting> findByClientLogUpload(Boolean clientLogUpload);

	/**
	 * Find EnforcerLogsetting by clientLogMax
	 */
	public List<EnforcerLogsetting> findByClientLogMax(Integer clientLogMax);

	/**
	 * Find EnforcerLogsetting by clientLogRecord
	 */
	public List<EnforcerLogsetting> findByClientLogRecord(Integer clientLogRecord);

	/**
	 * Find EnforcerLogsetting by commLogEnable
	 */
	public List<EnforcerLogsetting> findByCommLogEnable(Boolean commLogEnable);

	/**
	 * Find EnforcerLogsetting by commLogUpload
	 */
	public List<EnforcerLogsetting> findByCommLogUpload(Boolean commLogUpload);

	/**
	 * Find EnforcerLogsetting by commLogMax
	 */
	public List<EnforcerLogsetting> findByCommLogMax(Integer commLogMax);

	/**
	 * Find EnforcerLogsetting by commLogRecord
	 */
	public List<EnforcerLogsetting> findByCommLogRecord(Integer commLogRecord);

	/**
	 * Find EnforcerLogsetting by commLogFilter
	 */
	public List<EnforcerLogsetting> findByCommLogFilter(Integer commLogFilter);

}