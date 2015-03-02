package com.synitl.server.hibernate;

import org.springframework.beans.factory.BeanFactory;

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

	private static BeanFactory beanFactory = null;
	private static HibernateDAOFactory factory = null;
	
	public static HibernateDAOFactory getinstance() {
		beanFactory = HibernateUtil.getBeanFactory();
		factory = new HibernateDAOFactory();
		return factory;
	}
	
	
	/* (non-Javadoc)
	 * @see com.synitl.server.DAOFactory#buildClientDAO()
	 */
	@Override
	public ClientHibernateDAO buildClientDAO() {
		return (ClientHibernateDAO) beanFactory.getBean("clientDAO");
	}
	
	/* (non-Javadoc)
	 * @see com.synitl.server.DAOFactory#buildEnforcerAdvanceSettingsDAO()
	 */
	@Override
	public EnforcerAdvanceSettingsHibernateDAO buildEnforcerAdvanceSettingsDAO() {
		return (EnforcerAdvanceSettingsHibernateDAO) beanFactory.getBean("enforcerAdvanceSettingsDAO");
	}
	
	/* (non-Javadoc)
	 * @see com.synitl.server.DAOFactory#buildEnforcerLogsettingDAO()
	 */
	@Override
	public EnforcerLogsettingHibernateDAO buildEnforcerLogsettingDAO() {
		return (EnforcerLogsettingHibernateDAO) beanFactory.getBean("enforcerLogsettingDAO");
	}
	
	/* (non-Javadoc)
	 * @see com.synitl.server.DAOFactory#buildExchangeActionDAO()
	 */
	@Override
	public ExchangeActionHibernateDAO buildExchangeActionDAO() {
		return (ExchangeActionHibernateDAO) beanFactory.getBean("exchangeActionDAO");
	}
	
	/* (non-Javadoc)
	 * @see com.synitl.server.DAOFactory#buildExchangePolicyDAO()
	 */
	@Override
	public ExchangePolicyHibernateDAO buildExchangePolicyDAO() {
		return (ExchangePolicyHibernateDAO) beanFactory.getBean("exchangePolicyDAO");
	}
	
	/* (non-Javadoc)
	 * @see com.synitl.server.DAOFactory#buildGwDAO()
	 */
	@Override
	public GwHibernateDAO buildGwDAO() {
		return (GwHibernateDAO) beanFactory.getBean("gwDAO");
	}
	
	/* (non-Javadoc)
	 * @see com.synitl.server.DAOFactory#buildGwValidateIpRangeDAO()
	 */
	@Override
	public GwValidateIpRangeHibernateDAO buildGwValidateIpRangeDAO() {
		return (GwValidateIpRangeHibernateDAO) beanFactory.getBean("gwValidateIpRangeDAO");
	}
	
	/* (non-Javadoc)
	 * @see com.synitl.server.DAOFactory#buildGwValidateRangeDAO()
	 */
	@Override
	public GwValidateRangeHibernateDAO buildGwValidateRangeDAO() {
		return (GwValidateRangeHibernateDAO) beanFactory.getBean("gwValidateRangeDAO");
	}
	
	/* (non-Javadoc)
	 * @see com.synitl.server.DAOFactory#buildLanDAO()
	 */
	@Override
	public LanHibernateDAO buildLanDAO() {
		return (LanHibernateDAO) beanFactory.getBean("lanDAO");
	}
	
	/* (non-Javadoc)
	 * @see com.synitl.server.DAOFactory#buildManageServerDAO()
	 */
	@Override
	public ManageServerHibernateDAO buildManageServerDAO() {
		return (ManageServerHibernateDAO) beanFactory.getBean("manageServerDAO");
	}
	
	/* (non-Javadoc)
	 * @see com.synitl.server.DAOFactory#buildRadiusDAO()
	 */
	@Override
	public RadiusHibernateDAO buildRadiusDAO() {
		return (RadiusHibernateDAO) beanFactory.getBean("radiusDAO");
	}
	
	/* (non-Javadoc)
	 * @see com.synitl.server.DAOFactory#buildRadiusgroupDAO()
	 */
	@Override
	public RadiusgroupHibernateDAO buildRadiusgroupDAO() {
		return (RadiusgroupHibernateDAO) beanFactory.getBean("radiusgroupDAO");
	}
	
}
