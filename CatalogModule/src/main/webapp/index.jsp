<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CompanyCatalog</title>
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
    <h2 class="display-8" style="color:rgb(238, 238, 238) ;">C O M P A N Y &nbsp; C A T A L O G &nbsp; M O D U L E</h2>
    <body style="background-color: rgb(57, 62, 70);">
        <img src="one.png" alt="first" style="position:absolute; left:200px;bottom:45px; height: 11cm;width: 10cm; ">
        <div class="wrapper" style="position:absolute; right:200px;bottom:45px;">
        <h1 style="color: rgb(0, 173, 181);">Hello Again!</h1>
    <br>
    <form name="frm" method="post" action="check">
        <input type="text" name="custid" placeholder="UserID" >
        <br>
        <input type="password" name="pass" placeholder="Password" >
        <br>
        <input type="submit" value="Sign in"  class="btn btn-outline-dark" style="background-color: rgb(0, 173, 181);">
        <!-- <p class="recover">
            <a href="newacc">Open New Account</a>
        </p> -->
    </form>
    <div class="not-member">
   Not a member? <a href="newuser">New User? Register Now</a>
      
    </div>
        
    </div>

</body>
</html>