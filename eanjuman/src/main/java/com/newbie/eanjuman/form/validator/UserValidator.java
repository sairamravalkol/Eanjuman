package com.newbie.eanjuman.form.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.newbie.eanjuman.model.User;

public class UserValidator implements Validator {

	public boolean supports(Class<?> aclass) {
		return User.class.equals(aclass);
	}

	public void validate(Object command, Errors errors) {
				
			User user = (User)command;
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "required");
			
	}

}
