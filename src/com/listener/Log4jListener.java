package com.listener;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;

import com.util.LoggerUtils;

public class Log4jListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		String rootPath = arg0.getServletContext().getRealPath("/");
		System.setProperty("web.root", rootPath);
		try {
			Properties properties = new Properties();
			properties.load(new FileInputStream(rootPath+"WEB-INF"+File.separator+"classes"+File.separator+"log4j.properties"));
			PropertyConfigurator.configure(properties);
		} catch (Exception e) {
			BasicConfigurator.configure();
			LoggerUtils.error(e);
		}
	}

}
