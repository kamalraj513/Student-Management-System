<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.List" %>
<%@ page import="com.student.dao.StudentDAO" %>
<%@ page import="com.student.dao.StudentDAOImplementation" %>
<%@ page import="com.student.entity.Student" %>
<%
    StudentDAO dao = new StudentDAOImplementation();
    List<Student> students = dao.fetchAll();
%>
<!DOCTYPE html>
<html> 
<head>
    <title>Student Management</title>
    <link rel="stylesheet" href="index.css">
    <!--<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">-->
</head>

 <!-- Header -->
<header class="site-header" >
    <div class="logo">🏫 My Institution</div>
    <nav style="margin-top: 10px;">
       <!--  - <a href="index.jsp" class="nav-link">Home</a>-->
        <a href="add.jsp" class="nav-link">Add Student</a>
    </nav>
</header>

<body class="container mt-5" style="margin-top:100px;">

    <!-- Add Student Form 
    <div class="card p-4 mb-4 shadow"><a href="add.jsp" class="btn btn-primary">Add Student</a></div>-->

    <!-- Student List -->
    <div class="row">
        <%
            for(Student s : students) {
        %>
        <div class="col-md-4 mb-3">
            <div class="card shadow p-3">
                <h5><%= s.getName() %></h5>
                <p>Email: <%= s.getEmail() %></p>
                <p>Course: <%= s.getCourse() %></p>
                <p>Batch: <%=s.getBatch() %></p>

                <div class="d-flex justify-content-between">
                    <!-- Edit redirects to servlet with student ID -->
                    <form action="UpdateStudent" method="get">
                        <input type="hidden" name="id" value="<%= s.getId() %>">
                        <button type="submit" class="btn btn-primary btn-sm">Edit</button>
                    </form>

                    <!-- Delete student -->
                    <form action="DeleteStudent" method="post">
                        <input type="hidden" name="id" value="<%= s.getId() %>">
                        <button type="submit" class="btn btn-danger btn-sm">Delete</button>
                    </form>
                </div>
            </div>
        </div>
        <%
            }
        %>
    </div>

</body>
</html>
