package com.rajesh.HibDemo;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class SessionFactoryUtil {
	private SessionFactoryUtil() {}
	
	public static SessionFactory sf = null;
	
	public static SessionFactory getSessionFactory() {
		if (sf == null) {
			Configuration cfg = new Configuration().configure();
			StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
			ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
			sf = cfg.buildSessionFactory(serviceRegistry);
		}
		return sf;
	}
}
