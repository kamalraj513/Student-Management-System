package com.student.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.dao.StudentDAO;
import com.student.dao.StudentDAOImplementation;
import com.student.entity.Student;


public class AddStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

		  @Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			StudentDAO sdao = new StudentDAOImplementation();
			Student s = new Student();
			s.setName(req.getParameter("name"));
			s.setEmail(req.getParameter("email"));
			s.setCourse(req.getParameter("course"));
			s.setBatch(req.getParameter("batch"));
			
			sdao.addStudent(s);
			
			resp.sendRedirect("index.jsp");
		}
}
