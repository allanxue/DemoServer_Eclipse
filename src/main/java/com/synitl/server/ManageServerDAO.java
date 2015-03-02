package com.synitl.server;

import java.util.List;
import java.sql.Timestamp;

import com.synitl.server.pojo.ManageServer;
/**
 * <p>Generic DAO layer for ManageServers</p>
 * <p>Generated at Thu Feb 26 22:49:48 PST 2015</p>
 *
 * @author Salto-db Generator v1.0.16 / Pojos + Hibernate mapping + Generic DAO
 * @see http://www.hibernate.org/328.html
 */
public interface ManageServerDAO extends GenericDAO<ManageServer,Integer> {

	/*
	 * TODO : Add specific businesses daos here.
	 * These methods will be overwrited if you re-generate this interface.
	 * You might want to extend this interface and to change the dao factory to return 
	 * an instance of the new implemenation in buildManageServerDAO()
	 */
	  	 
	/**
	 * Find ManageServer by name
	 */
	public List<ManageServer> findByName(String name);

	/**
	 * Find ManageServer by ip
	 */
	public List<ManageServer> findByIp(String ip);

	/**
	 * Find ManageServer by description
	 */
	public List<ManageServer> findByDescription(String description);

}