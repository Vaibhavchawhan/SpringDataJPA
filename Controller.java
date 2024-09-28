package com.deepak.SpringbootDataJpaJSP.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.deepak.SpringbootDataJpaJSP.entity.User;
import com.deepak.SpringbootDataJpaJSP.service.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@org.springframework.stereotype.Controller
public class Controller {
	@Autowired
	private UserService userService;

	@GetMapping("/regPage")
	public String openRegPage(Model model) {

		model.addAttribute("user", new User());
		return "register";
	}

	@PostMapping("/regForm")
	public String submitregForm(@ModelAttribute("user") User user, Model model) {
		boolean status = userService.registerUser(user);
		if (status) {
			model.addAttribute("successMsg", " Suceefully user Register");
		} else {
			model.addAttribute("errorMsg", " user Register error");
		}
		return "register";
	}

	@GetMapping("/loginPage")
	public String openLoginPage(Model model) {
		model.addAttribute("user", new User());
		return "login";
	}

	@PostMapping("/loginForm")
	public String submitLoginForm(@ModelAttribute("user") User user, Model model) {
		User validUser = userService.loginUser(user.getEmail(), user.getPassword());
		if (validUser != null) {
			model.addAttribute("modelName", validUser.getName());
			return "profile";
		} else {
			model.addAttribute("errorMsg", "Email Id And Password Not Matched");
			return "login";
		}
	}

	@GetMapping("/logout")
	public String logoutUser(HttpServletRequest request) {
		HttpSession session = request.getSession(false);

		if (session != null) {
			session.invalidate();

		}
		return "login";
	}
}
