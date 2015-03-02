package com.synitl.server;

import java.util.List;
import java.sql.Timestamp;

import com.synitl.server.pojo.Client;
/**
 * <p>Generic DAO layer for Clients</p>
 * <p>Generated at Thu Feb 26 22:49:47 PST 2015</p>
 *
 * @author Salto-db Generator v1.0.16 / Pojos + Hibernate mapping + Generic DAO
 * @see http://www.hibernate.org/328.html
 */
public interface ClientDAO extends GenericDAO<Client,Integer> {

	/*
	 * TODO : Add specific businesses daos here.
	 * These methods will be overwrited if you re-generate this interface.
	 * You might want to extend this interface and to change the dao factory to return 
	 * an instance of the new implemenation in buildClientDAO()
	 */
	  	 
	/**
	 * Find Client by name
	 */
	public List<Client> findByName(String name);

	/**
	 * Find Client by ip
	 */
	public List<Client> findByIp(String ip);

	/**
	 * Find Client by mac
	 */
	public List<Client> findByMac(String mac);

	/**
	 * Find Client by uuid
	 */
	public List<Client> findByUuid(String uuid);

	/**
	 * Find Client by domain
	 */
	public List<Client> findByDomain(String domain);

	/**
	 * Find Client by ip1
	 */
	public List<Client> findByIp1(String ip1);

	/**
	 * Find Client by mac1
	 */
	public List<Client> findByMac1(String mac1);

	/**
	 * Find Client by ip2
	 */
	public List<Client> findByIp2(String ip2);

	/**
	 * Find Client by mac2
	 */
	public List<Client> findByMac2(String mac2);

	/**
	 * Find Client by user
	 */
	public List<Client> findByUser(String user);

}