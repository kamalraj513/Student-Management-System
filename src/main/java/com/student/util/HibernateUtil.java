package com.student.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.student.entity.Student;

public class HibernateUtil {

	 

	private static SessionFactory session;

	static 
	{
		try {
			session = new Configuration()
					.configure("config.xml")
					.addAnnotatedClass(Student.class)
					.buildSessionFactory();
		} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static SessionFactory getSession()
	{
		return session;
	}
}
