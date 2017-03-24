function validateSignup() {
	var isValid = true;
	var password = document.getElementById('password').value;
	var rePassword =  document.getElementById('rePassword').value;
	var phone = document.getElementById('phone').value;
	if(password.length<=5) {

		alert("Password must be morethan 5 charecters");
		return false;
	}
	else if(password!=rePassword) {

		alert("Password must be same");
		return false;	
	}
	else if( isNaN(phone)) {
		alert("Please Enter Valid Phone number");
		return false
	}
	else if(phone.length!=10) {
		alert("Please Enter 10 Digit Phone number");
		return false;
	}
}
