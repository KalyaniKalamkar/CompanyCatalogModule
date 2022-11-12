<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>spider</title>
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
    <h2 class="display-8" style="color:rgb(238, 238, 238); position:absolute; left:200px;">C O M P A N Y &nbsp;D E T A I L S</h2>
    <body style="background-color: rgb(57, 62, 70);">
   <img src="three.png" alt="first" style="position:absolute; left:200px;bottom:45px; height: 11cm;width: 10cm; ">
        <div class="wrapper" style="position:absolute; right:200px;bottom:0.1px;height: 13cm;width: 10cm;">
       
        
    
    <form name="frm" method="post" action="addacc">
        <input type="text" name="Cid" placeholder="CompanyID" >
        <br>
        <input type="text" name="Cnm" placeholder="CompanyName" >
        <br>
        <input type="text" name="Founded" placeholder="CompanyFoundationYear" >
        <br>
        <input type="text" name="Category" placeholder="Category" >
        <br>
        <input type="text" name="Country" placeholder="Country" >
        <br>
        <input type="text" name="Empno" placeholder="EmpNo" >
        <br>
        <input type="submit" value="Submit"  class="btn btn-outline-dark" style="background-color: rgb(0, 173, 181);">
        <!-- <p class="recover">
            <a href="newacc">Open New Account</a>
        </p> -->
        <br>
        
    
     <a href="index.jsp" class="btn btn-outline-light">Home</a>
     
        
    </form>
   
        
    </div>

</body>
</html>