package com.listener;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.PropertyConfigurator;

public class Log4jListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		String rootPath = arg0.getServletContext().getRealPath("/");
		System.out.println(rootPath);
		System.setProperty("web.root", rootPath);
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(rootPath+"WEB-INF"+File.separator+"classes"+File.separator+"log4j.properties"));
			System.out.println("获取key值: "+properties.get("log4j.rootLogger"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		PropertyConfigurator.configure(properties);
	}

}
