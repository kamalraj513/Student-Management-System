<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Student</title>
    <!-- Use our custom stylesheet instead of Bootstrap -->
    <link rel="stylesheet" href="index.css">
</head>
<header class="site-header" >
    <div class="logo">Add Student Credentials</div>
    <nav style="margin-top: 10px;">
    </nav>
</header>
<body class="container mt-5">

    <div class="card p-4 mb-4 shadow">
        <form action="addStudent" method="post" class="row g-3" style="padding-bottom:30px">
            <div class="col-md-4">
                <input type="text" name="name" placeholder="Enter Name" required>
            </div>
            <div class="col-md-4">
                <input type="email" name="email" placeholder="Enter Email" required>
            </div>
            <div class="col-md-3">
                <input type="text" name="course" placeholder="Enter Course" required>
            </div>
            <div class="col-md-3">
                <input type="text" name="batch" placeholder="Enter Batch" required>
            </div>
            <div class="col-md-1">
                <button type="submit" class="btn btn-primary w-100">Add Student</button>
            </div>
        </form>

        <div class="col-md-1">
            <a href="index.jsp" class="btn btn-danger w-100">Back to Home</a>
        </div>
    </div>

</body>
</html>
