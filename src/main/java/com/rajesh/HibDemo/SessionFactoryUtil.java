package com.rajesh.HibDemo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {
	private SessionFactoryUtil() {}
	
	public static SessionFactory sf = null;
	
	public static SessionFactory getSessionFactory() {
		if (sf == null) {
			Configuration cfg = new Configuration().configure();
			sf = cfg.buildSessionFactory();
		}
		return sf;
	}
}
