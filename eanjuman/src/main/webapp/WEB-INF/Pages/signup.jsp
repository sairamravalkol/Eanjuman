<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SignupPage</title>
<link rel="stylesheet" type="text/css" href="resources/easStyles/pagestyle.css">
  <link rel="stylesheet" type="text/css" href="resources/easStyles/signupForm.css">
  <script type="text/javascript" src="resources/js/signup.js"></script>
 
</head>

<body>

  <div class="container">

    <header>

      <img id="jblogo" src="resources/easStyles/img/jblogo.png" alt="jblogo" width="200" height="200">
      <img id="ealogo" src="resources/easStyles/img/eanjuman.png" alt="eanjuman">
    </header>
    

<div id="maincontent">
    <h2 id="welcome">Welcome to Jai Bhavani E-Anjuman System...</h2>
     
      <div id="signupFormContent">
        <table id="signupFormTable">
          <tr>
            <td>
          <h3>Please Create An Account To Use This Application...</h3>
          <hr>
          <form id="signupForm" method="POST" action="signupController" onsubmit="return validateSignup()">
            <table id="inputTable">
              <tr>
                <td><label>First Name</label></td>
                <td><input type="text" id="firstName" name="firstName" placeholder="eg. Sairam" autofocus required></td>
                <td><label>Last Name</label></td>
                <td><input type="text" id="lastName" name="lastName" placeholder="eg. Ravalkol" required></td>
              </tr>
              <tr>
                <td><label>Password</label></td>
                <td><input type="password" id="password" name="password" required></td>
                <td><label>Password Confirm</label></td>
                <td><input type="password" id="rePassword" name="password" required></td>
              </tr>
              <tr>
                <td><label>Phone</label></td>
                <td><input type="text" id="phone" name="phone" placeholder="Eg. 9876543210" required></td>
                <td><label>Email</label></td>
                <td><input type="email" id="email" name="email" placeholder="Eg. sairam.r@gmail.com" required></td>
              </tr>
              <tr>
                <td colspan="4"><input type="checkbox" id="termsAndConditions" required>
                <label>Please read and agree to the <a href="#">terms & conditions</a>
                   of the Eanjuman System.</label></td>
              </tr>
              <tr>
                <td><input type="submit" id="submnit" name="submit" value="Create Account"></td>
                <td><input type="reset" id="reset" name="reset" Value="Clear"></td>
              </tr>
              <tr>
              <td colspan="4" align="right">Are you an existing user, Please click here ><a href="loginController"><input type="button" id="login" value="Login"></a></td>
              </tr>
            </table>
          </form>
            </td>
          </tr>
          <table>
        </div>

</div>
    <footer> Copyright &copy; 2015 to 2017 All rights reserved <a href="#">www.eanjuman.com</a> </footer>

  </div>

</body>
</html>