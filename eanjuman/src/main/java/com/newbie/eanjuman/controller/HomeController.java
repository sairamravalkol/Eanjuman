package com.newbie.eanjuman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(path = "home", method = RequestMethod.GET)
	public String getAccount(Model model) {
		
		return "home";
	}

}
