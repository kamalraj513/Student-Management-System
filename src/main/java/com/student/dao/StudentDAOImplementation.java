package com.student.dao;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.student.entity.Student;
import com.student.util.HibernateUtil;

public class StudentDAOImplementation implements StudentDAO {

	private static Session session;
	private Transaction t;
	@Override
	public void addStudent(Student s) {
		session = HibernateUtil.getSession().openSession();
		t = session.beginTransaction();
		session.persist(s);
		t.commit();
		session.close();
	}
	@Override
	public ArrayList<Student> fetchAll() {
		session = HibernateUtil.getSession().openSession();
		ArrayList<Student> students = (ArrayList<Student>) session.createQuery("from Student",Student.class).list();
		session.close();
		return students;
	}
	@Override
	public void updateStudent(int id, String email, String name, String course, String Batch) {
		session = HibernateUtil.getSession().openSession();
		t = session.beginTransaction();
		Student s= session.get(Student.class, id);
		s.setName(name);
		s.setEmail(email);
		s.setCourse(course);
		s.setBatch(Batch);
		session.persist(s);
		t.commit();
		session.close();
	}
	@Override
	public void delete(int id) {
		session= HibernateUtil.getSession().openSession();
		t = session.beginTransaction();
		Student s = session.get(Student.class,id);
		if(s!=null) {
			session.remove(s);
		}
		t.commit();
		session.close();
		
	}
	@Override
	public Student fetchById(int id) {
		   Session session = HibernateUtil.getSession().openSession();  // create fresh session
		    Student s = session.get(Student.class, id);
		    session.close();  // close after use
		    return s;
	}

}
