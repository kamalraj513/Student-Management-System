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

@WebServlet("/UpdateStudent")
public class UpdateStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    int id = Integer.parseInt(req.getParameter("id"));
	    StudentDAO sdao = new StudentDAOImplementation();
	    Student student = sdao.fetchById(id); // create this method in DAO
	    req.setAttribute("student", student);
	    req.getRequestDispatcher("edit.jsp").forward(req, resp);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    int id = Integer.parseInt(req.getParameter("id"));
	    String name = req.getParameter("name");
	    String email = req.getParameter("email");
	    String course = req.getParameter("course");
	    String batch = req.getParameter("batch");

	    StudentDAO sdao = new StudentDAOImplementation();
	    sdao.updateStudent(id, email, name, course, batch);

	    resp.sendRedirect("index.jsp"); 
	}

}
