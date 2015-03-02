package com.synitl.server;

import com.synitl.server.hibernate.HibernateDAOFactory;

/**
 * Generated at Thu Feb 26 22:49:48 PST 2015
 *
 * @see http://www.hibernate.org/328.html
 * @author Salto-db Generator v1.0.16 / Pojos + Hibernate mapping + Generic DAO
 */

public abstract class DAOFactory {

	private static final DAOFactory HIBERNATE = new HibernateDAOFactory();

	public static final DAOFactory DEFAULT = HIBERNATE;
	
    /**
     * Factory method for instantiation of concrete factories.
     */
    public static DAOFactory instance(Class factory) {
        try {
            return (DAOFactory)factory.newInstance();
        } catch (Exception ex) {
            throw new RuntimeException("Couldn't create DAOFactory: " + factory);
        }
    }
	
	public abstract ClientDAO buildClientDAO();
	
	public abstract EnforcerAdvanceSettingsDAO buildEnforcerAdvanceSettingsDAO();
	
	public abstract EnforcerLogsettingDAO buildEnforcerLogsettingDAO();
	
	public abstract ExchangeActionDAO buildExchangeActionDAO();
	
	public abstract ExchangePolicyDAO buildExchangePolicyDAO();
	
	public abstract GwDAO buildGwDAO();
	
	public abstract GwValidateIpRangeDAO buildGwValidateIpRangeDAO();
	
	public abstract GwValidateRangeDAO buildGwValidateRangeDAO();
	
	public abstract LanDAO buildLanDAO();
	
	public abstract ManageServerDAO buildManageServerDAO();
	
	public abstract RadiusDAO buildRadiusDAO();
	
	public abstract RadiusgroupDAO buildRadiusgroupDAO();
	
}
