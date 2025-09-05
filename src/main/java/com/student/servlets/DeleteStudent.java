package com.student.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.dao.StudentDAO;
import com.student.dao.StudentDAOImplementation;
import com.student.util.HibernateUtil;

@WebServlet("/DeleteStudent")
public class DeleteStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  StudentDAO sdao = new StudentDAOImplementation();
	  int id = Integer.parseInt(req.getParameter("id"));
	  sdao.delete(id);
	  resp.sendRedirect("index.jsp");
	 
	}

}
