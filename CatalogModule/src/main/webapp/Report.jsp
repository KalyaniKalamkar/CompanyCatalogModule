<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="spring" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
    h2{
     text-align:center
    }
    </style>
<link rel="stylesheet" href="bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
<link rel="stylesheet" href="style.css">
</head>
<br><br>
<h2 class="display-8" style="color:rgb(57, 62, 70) ;">C O M P A N Y &nbsp; R E P O R T </h2>
  

<body style="background-color: rgb(238, 238, 238);">
    <div class="container">
        <br>
        <table class="table table-bordered table-hover">
            <tr style="color:rgb(0, 173, 181)">
            <th>Company Id
            <th>Name
            <th>Founded
            <th>Category
            <th>Country
            <th>Empno
            </th>
            </tr>
            
<spring:forEach items="${list}" var="ac" >
<tr>
<td>${ac.cid}
<td>${ac.cnm}
<td>${ac.founded}
<td>${ac.category}
<td>${ac.country}
<td>${ac.empno}
</tr>

</spring:forEach>
        </table>
        <br>
        <a href="index.jsp" class="btn btn-outline-dark">Home</a>
    </div>

</body>
</html>