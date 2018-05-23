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
                <li><a class="active" href="home">Home</a></li>
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
               <img id="jbya-pic" src="resources/easStyles/img/jbya-pic.jpg" align="center" alt="JBYA Group PICTURE" width="900" height="600">
               <div id="about">               <h2 style="text-align: center;"><span style="color: #ff6600;"><strong>Jai Bhavani Youth Association</strong></span></h2>
               <p style="text-align: justify;">Jai Bhavani youth association formed in 2009 and started celebrating <strong>Vinayaka</strong>&nbsp;mandapam and immersion festival. This society can offer all devotional things and financial help for who are members of Anjuman.</p>
               <p style="text-align: justify;">Anjuman basically it's one of funds collection and loan distributed system for who seek money for their personal use.</p>
               <p style="text-align: justify;">&nbsp;We celebrate Vinayaka Chaviti for every year and takes some sufficient amount from Anjuman, the used fund will be using in celebrating immersion ceremony.</p>
               <p style="text-align: justify;">Every individual who member of Anjuman will deposit&nbsp;the amount 200 in their account and if he/she need amount to take the loan, The loan will be repaid at next month with interest of 2%, this will continue for next year.</p>
            </div>

        </div>
        <footer> Copyright &copy; 2015 to 2017 All rights reserved <a href="#">www.eanjuman.com</a> </footer>

    </div>

</body>

</html>