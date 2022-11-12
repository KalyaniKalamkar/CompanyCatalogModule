<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
<link rel="stylesheet" href="style.css">
</head>
<br><br>
<h2 class="container" style="color:rgb(57, 62, 70) ;">S E A R C H&nbsp; R E P O R T </h2>
  

<body style="background-color: rgb(238, 238, 238);">
    <div class="container">
       
            <br>
        Account Number : ${ac.cid}
        <br>
        Name : ${ac.cnm}
        <br>
        Type : ${ac.founded}
        <br>
        Balance : ${ac.category}
        <br>
        Country : ${ac.country}
        <br>
        EmpNo : ${ac.empno}
        
        <br><br>
       
            

        <br>
        <a href="Customer.jsp" class="btn btn-outline-dark">Home</a>
    </div>

</body>
</html>