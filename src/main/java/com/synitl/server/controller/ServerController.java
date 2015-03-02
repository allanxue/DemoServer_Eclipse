package com.synitl.server.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.ServletContextAware;

import com.synitl.server.pojo.Client;
import com.synitl.server.pojo.Gw;
@Controller
public class ServerController implements ServletContextAware {
	
	@Autowired
	ApplicationContext applicationContext;
	private ServletContext servletContext;

	@RequestMapping(value = "/manage/gw/add", method={RequestMethod.POST,RequestMethod.GET})
	public String add(Locale locale, Model model) {
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		Gw gateway = new Gw();
		model.addAttribute("gateway", gateway);
		return "server/gw";
	}
	
	@Override
	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
	}

}
