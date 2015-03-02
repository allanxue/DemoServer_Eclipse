package com.synitl.server.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Generated at Thu Feb 26 22:49:48 PST 2015
 *
 * @author Salto-db Generator v1.0.16 / Pojos + Hibernate mapping + Generic DAO
 */
public final class HibernateUtil {

	private static SessionFactory sessionFactory;
	private static BeanFactory factory;

	static {
		try {
			String path = "../spring/applicationContext-hibernate.xml";
//			sessionFactory = new Configuration().configure(path).buildSessionFactory();	
			Resource r=new ClassPathResource(path);  
		    factory=new XmlBeanFactory(r);
		} catch (Throwable ex) {

			throw new ExceptionInInitializerError(ex);
		}
	}

	private HibernateUtil() {

	}

	/**
	 * Returns the SessionFactory used for this static class.
	 * 
	 * @return SessionFactory
	 */
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/*
	 * @return bean factory
	 */
	public static BeanFactory getBeanFactory() {
		return factory;
	}

	
	
}
