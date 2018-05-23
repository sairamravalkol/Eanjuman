<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>

<head>
    <script type="text/javascript" src="resources/js/home.js"></script>
    <link rel="stylesheet" type="text/css" href="resources/easStyles/pagestyle.css">
    <link rel="stylesheet" type="text/css" href="resources/easStyles/signupForm.css">
</head>

<body onload="startTime()">

    <div class="container">

        <header>

            <img id="jblogo" src="resources/easStyles/img/jblogo.png" alt="jblogo" width="200" height="200">
            <img id="ealogo" src="resources/easStyles/img/eanjuman.png" alt="eanjuman">
            <h1 id="currentDate"></h1>
        </header>
        <header id="mainnav">
            <ul>
                <li><a class="" href="home">Home</a></li>
                <li><a href="account">Account</a></li>
                <li><a href="#contact">Loan</a></li>
                <li><a href="#about">MonthlySheet</a></li>
                <li style="float:right"><a href="#about">Logout</a></li>
                <li style="float:right"><a href="#contact">Profile</a></li>

            </ul>
        </header>


        <div id="maincontent">

            <h1>Welcome to Eanjuman</h1>
            <div id="signupFormContent">
                <table id="signupFormTable">
                    <tr>
                        <td>
                            <h3>Account Request</h3>
                            
                            <hr>
                            <form id="signupForm">
                                <table id="inputTable">
                                    <tr>
                                        <td><label>First Name</label></td>
                                        <td><input type="text" id="firstName" name="firstName" placeholder="John" autofocus
                                                required></td>
                                        <td><label>Last Name</label></td>
                                        <td><input type="text" id="lastName" name="lastName" placeholder="Smith" required></td>
                                    </tr>
                                    <tr>
                                        <td><label>Father Name</label></td>
                                        <td><input type="text" id="fathername" name="fathername" required></td>
                                        <td><label>Date Of Birth</label></td>
                                        <td><input type="date" id="dob" name="dob"></td>
                                    </tr>
                                    <tr>
                                        <td><label>Address</label></td>
                                        <td><input type="text" id="address" name="address" placeholder="khajaguda" required></td>
                                        <td><label>Phone1</label></td>  
                                        <td><input type="text" id="phone1" name="phone1" placeholder="9848422921" required></td>                                 </tr>
                                    <tr>
                                        <td><label>Phone2</label></td>
                                        <td><input type="text" id="phone2" name="phone2" placeholder="8792364076" required></td>
                                        <td><label>City</label></td>
                                        <td><input type="text" id="city" name="city" placeholder="Hyderabad"
                                                required></td>
                                    </tr>
                                    <tr>
                                        <td><label>Email</label></td>
                                        <td><input type="email" id="email" name="email" placeholder="sairam.r@gmail.com" required></td>
                                        
                                    </tr>
                                    <tr>
                                        <td colspan="4"><input type="checkbox" id="termsAndConditions" required>
                                            <label>Please read and agree to the <a href="#">terms & conditions</a>
                   of the Eanjuman System.</label></td>
                                    </tr>
                                    <tr>
                                        <td><input type="submit" id="submnit" name="submit" value="Save"></td>
                                        <td><input type="reset" id="reset" name="reset" Value="Clear"></td>
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