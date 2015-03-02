package com.synitl.server.hibernate;

import com.synitl.server.DAOFactory;
import com.synitl.server.ClientDAO;
import com.synitl.server.EnforcerAdvanceSettingsDAO;
import com.synitl.server.EnforcerLogsettingDAO;
import com.synitl.server.ExchangeActionDAO;
import com.synitl.server.ExchangePolicyDAO;
import com.synitl.server.GwDAO;
import com.synitl.server.GwValidateIpRangeDAO;
import com.synitl.server.GwValidateRangeDAO;
import com.synitl.server.LanDAO;
import com.synitl.server.ManageServerDAO;
import com.synitl.server.RadiusDAO;
import com.synitl.server.RadiusgroupDAO;

/**
 * Generated at Thu Feb 26 22:49:48 PST 2015
 *
 * @see http://www.hibernate.org/43.html
 * @author Salto-db Generator v1.0.16 / Pojos + Hibernate mapping + Generic DAO
 */
public class HibernateDAOFactory extends DAOFactory {

	/* (non-Javadoc)
	 * @see com.synitl.server.DAOFactory#buildClientDAO()
	 */
	@Override
	public ClientDAO buildClientDAO() {
		return new ClientHibernateDAO();
	}
	
	/* (non-Javadoc)
	 * @see com.synitl.server.DAOFactory#buildEnforcerAdvanceSettingsDAO()
	 */
	@Override
	public EnforcerAdvanceSettingsDAO buildEnforcerAdvanceSettingsDAO() {
		return new EnforcerAdvanceSettingsHibernateDAO();
	}
	
	/* (non-Javadoc)
	 * @see com.synitl.server.DAOFactory#buildEnforcerLogsettingDAO()
	 */
	@Override
	public EnforcerLogsettingDAO buildEnforcerLogsettingDAO() {
		return new EnforcerLogsettingHibernateDAO();
	}
	
	/* (non-Javadoc)
	 * @see com.synitl.server.DAOFactory#buildExchangeActionDAO()
	 */
	@Override
	public ExchangeActionDAO buildExchangeActionDAO() {
		return new ExchangeActionHibernateDAO();
	}
	
	/* (non-Javadoc)
	 * @see com.synitl.server.DAOFactory#buildExchangePolicyDAO()
	 */
	@Override
	public ExchangePolicyDAO buildExchangePolicyDAO() {
		return new ExchangePolicyHibernateDAO();
	}
	
	/* (non-Javadoc)
	 * @see com.synitl.server.DAOFactory#buildGwDAO()
	 */
	@Override
	public GwDAO buildGwDAO() {
		return new GwHibernateDAO();
	}
	
	/* (non-Javadoc)
	 * @see com.synitl.server.DAOFactory#buildGwValidateIpRangeDAO()
	 */
	@Override
	public GwValidateIpRangeDAO buildGwValidateIpRangeDAO() {
		return new GwValidateIpRangeHibernateDAO();
	}
	
	/* (non-Javadoc)
	 * @see com.synitl.server.DAOFactory#buildGwValidateRangeDAO()
	 */
	@Override
	public GwValidateRangeDAO buildGwValidateRangeDAO() {
		return new GwValidateRangeHibernateDAO();
	}
	
	/* (non-Javadoc)
	 * @see com.synitl.server.DAOFactory#buildLanDAO()
	 */
	@Override
	public LanDAO buildLanDAO() {
		return new LanHibernateDAO();
	}
	
	/* (non-Javadoc)
	 * @see com.synitl.server.DAOFactory#buildManageServerDAO()
	 */
	@Override
	public ManageServerDAO buildManageServerDAO() {
		return new ManageServerHibernateDAO();
	}
	
	/* (non-Javadoc)
	 * @see com.synitl.server.DAOFactory#buildRadiusDAO()
	 */
	@Override
	public RadiusDAO buildRadiusDAO() {
		return new RadiusHibernateDAO();
	}
	
	/* (non-Javadoc)
	 * @see com.synitl.server.DAOFactory#buildRadiusgroupDAO()
	 */
	@Override
	public RadiusgroupDAO buildRadiusgroupDAO() {
		return new RadiusgroupHibernateDAO();
	}
	
}
