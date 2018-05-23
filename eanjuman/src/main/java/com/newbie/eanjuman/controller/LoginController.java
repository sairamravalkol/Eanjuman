package com.newbie.eanjuman.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LoginController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String requestMethod = request.getMethod();
		if(requestMethod.equals("GET")) {
			
			ModelAndView mav = doGet(request,response);
			return mav;
		}
		else {
			ModelAndView mav = doPost(request,response);
			return mav;
		}
	}

	private ModelAndView doPost(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("This is submit or POST");
		ModelAndView mav = new ModelAndView();
		System.out.println(request.getParameter("email"));
		System.out.println(request.getParameter("password"));
		mav.setViewName("home");
		return mav;
		
	}

	private ModelAndView doGet(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("This is formview or GET");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		return mav;
	}

}
