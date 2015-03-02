package com.synitl.server.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.ServletContextAware;

import com.synitl.server.hibernate.GwHibernateDAO;
import com.synitl.server.hibernate.HibernateDAOFactory;
import com.synitl.server.hibernate.LanHibernateDAO;
import com.synitl.server.hibernate.ManageServerHibernateDAO;
import com.synitl.server.manage.Site;
import com.synitl.server.pojo.Client;

@Controller
public class PolicyController implements ServletContextAware{

	@Autowired
	ApplicationContext applicationContext;
	private ServletContext servletContext;
	private static final Logger logger = LoggerFactory.getLogger(PolicyController.class);
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String policy(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Site site = new Site();
		ManageServerHibernateDAO msDAO = HibernateDAOFactory.getinstance().buildManageServerDAO();
		site.setMs(msDAO.findAll());
		LanHibernateDAO lanDAO = HibernateDAOFactory.getinstance().buildLanDAO();
		site.setLans(lanDAO.findAll());
		
		GwHibernateDAO gwDAO = HibernateDAOFactory.getinstance().buildGwDAO();
		site.setGws(gwDAO.findAll());
		model.addAttribute("site", site);
		return "server/manage";
	}
	
	@RequestMapping(value = "/policy", method={RequestMethod.POST,RequestMethod.GET})
	public String test(Locale locale, Model model) {
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		Client cli = new Client();
		cli.setUser("Allan");
		model.addAttribute("client", cli);
		return "policy/policy";
	}
	
	

	@Override
	public void setServletContext(ServletContext context) {
		servletContext = context;
	}
	
}
