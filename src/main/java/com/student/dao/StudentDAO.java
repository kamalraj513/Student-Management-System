package com.student.dao;

import java.util.ArrayList;

import com.student.entity.Student;

public interface StudentDAO {

	void addStudent(Student s);
	ArrayList<Student> fetchAll();
	void delete(int id);
	Student fetchById(int id);
	void updateStudent(int id, String email, String name, String course, String Batch);
}
