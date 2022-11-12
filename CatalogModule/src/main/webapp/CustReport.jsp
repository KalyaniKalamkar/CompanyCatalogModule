<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="spring" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body>
    <div class="container">
        <br><br>
        <h2 class="display-4">User Report</h2>
        <hr>
        <table class="table table-bordered table-hover">
            <tr style="color:steelblue">
            <th>CustomerID
            <th>Name
            <th>Password
            <th>UserType
            
            </th>
            </tr>
            
<spring:forEach items="${lst}" var="ac" >
<tr>
<td>${ac.custid}
<td>${ac.custnm}
<td>${ac.pass}
<td>${ac.usertype}

</tr>

</spring:forEach>
        </table>
        <br>
        <a href="Admin.jsp" class="btn btn-outline-dark">Home</a>
    </div>

</body>
</html>