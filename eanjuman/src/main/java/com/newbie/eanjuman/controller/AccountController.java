package com.newbie.eanjuman.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.newbie.eanjuman.command.Account;
import com.newbie.eanjuman.service.AccountService;

@Controller
public class AccountController {

	@Autowired
	AccountService accountService;

	@RequestMapping(path = "account", method = RequestMethod.GET)
	public String getAccount(Model model) {
		Account account = new Account();
		model.addAttribute("account", account);
		return "account";

	}

}
