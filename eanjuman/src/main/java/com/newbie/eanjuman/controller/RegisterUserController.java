package com.newbie.eanjuman.controller;


import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.newbie.eanjuman.model.User;
import com.newbie.eanjuman.service.RegisterUserService;
import com.sun.istack.internal.logging.Logger;


public class RegisterUserController implements Controller {
	
	RegisterUserService registerUserService;


	private User user;
	
	
	private static final Logger logger = Logger.getLogger(RegisterUserController.class);

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if(request.getMethod().equals("GET")) {
		
			ModelAndView mav = doGet(request,response);
			return mav;
		}else {
			ModelAndView mav =  doPost(request,response);
			return mav;
		}
	}

	private ModelAndView doPost(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		setFormDataValues(request,response);
		int status = registerUserService.addUser(user);
		if(status>0) {
			
		}
		
		mav.setViewName("success");
		return mav;
	}

	private void setFormDataValues(HttpServletRequest request, HttpServletResponse response) {
		
		user = new User();
		user.setFirstName(request.getParameter("firstName"));
		user.setLastName(request.getParameter("lastName"));
		user.setPassword(request.getParameter("password"));
	    user.setPhone(request.getParameter("phone"));
	    user.setEmail(request.getParameter("email"));
	    user.setDateOfCreate(getCurrentDate());
	    user.setLastupdate(getCurrentDate());
	    
	 }

	private Timestamp getCurrentDate() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		return timestamp;
		
	}

	private  ModelAndView doGet(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		System.out.println("From SignupController");
		mav.setViewName("signup");
		return mav;
		
	}
	public RegisterUserService getRegisterUserService() {
		return registerUserService;
	}

	public void setRegisterUserService(RegisterUserService registerUserService) {
		this.registerUserService = registerUserService;
	}
	
	
	

}
