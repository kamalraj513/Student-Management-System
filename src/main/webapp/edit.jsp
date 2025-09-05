<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.student.entity.Student" %>
<%
    Student s = (Student) request.getAttribute("student"); // Set in servlet
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Student</title>
    <!-- Reuse same CSS file as Add Student -->
    <link rel="stylesheet" href="index.css">
</head>

<header class="site-header" >
    <div class="logo">Edit Student Credentials</div>
    <nav style="margin-top: 10px;">
    </nav>
</header>

<body class="container mt-5">

    <div class="card p-4 mb-4 shadow">
        <form action="UpdateStudent" method="post" class="row g-3" style="padding-bottom:30px">
            <input type="hidden" name="id" value="<%= s.getId() %>">

            <div class="col-md-4">
                <input type="text" name="name" placeholder="Enter Name" value="<%= s.getName() %>" required>
            </div>
            <div class="col-md-4">
                <input type="email" name="email" placeholder="Enter Email" value="<%= s.getEmail() %>" required>
            </div>
            <div class="col-md-3">
                <input type="text" name="course" placeholder="Enter Course" value="<%= s.getCourse() %>" required>
            </div>
            <div class="col-md-3">
                <input type="text" name="batch" placeholder="Enter Batch" value="<%= s.getBatch() %>" required>
            </div>
            <div class="col-md-1">
                <button type="submit" class="btn btn-primary w-100">Update</button>
            </div>
        </form>

        <div class="col-md-1">
            <a href="index.jsp" class="btn btn-danger w-100">Back to Home</a>
        </div>
    </div>

</body>
</html>
