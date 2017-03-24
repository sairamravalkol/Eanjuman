<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="true"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<head>
  <link rel="stylesheet" type="text/css" href="resources/easStyles/pagestyle.css">
  <link rel="stylesheet" type="text/css" href="resources/easStyles/loginForm.css">
</head>

<body>

  <div class="container">

    <header>

      <img id="jblogo" src="resources/easStyles/img/jblogo.png" alt="jblogo" width="200" height="200">
      <img id="ealogo" src="resources/easStyles/img/eanjuman.png" alt="eanjuman">
    </header>


    <div id="maincontent">
      <h2 id="welcome">Welcome to Jai Bhavani E-Anjuman System...</h2>

      <div id="loginFormContent">
        <table id="loginFormTable">
          <tr>
            <td>
              <h3>Please Login...</h3>
              <hr>
              <form id="loginForm" method="POST" action="loginController">
                <table id="inputTable">
                  <tr>
                    <td><label>Email</label></td>
                    <td><input type="email" id="" name="email" placeholder="e.g. sairam.r@gmail.com" autofocus required></td>
                  </tr>
                  <tr>
                    <td><label>Password</label></td>
                    <td><input type="password" id="password" name="password" required></td>
                  </tr>
                  <tr align="right">
                    <td colspan="2">forgot <a href="#">Email/Password?</a>
                      <td>
                  </tr>
                  <tr>
                    <td><input type="submit" id="submit" value="Login >" ></td>
                    <td><input type="reset" id="reset" Value="Clear"></td>
                  </tr>
                  <tr>
                    <td colspan="2">
                      <p>Are you New to this, Please Register here ></p>
                    </td>
                    <td>
                      <a href="signupController"><input type="button" id="signup" Value="SignUp"></a>
                    </td>
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