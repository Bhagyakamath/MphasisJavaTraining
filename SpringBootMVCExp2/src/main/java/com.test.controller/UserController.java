package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.model.User;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class UserController {
	
//	@RequestMapping("/submituser")
//	public String submitForm(HttpServletRequest request, Model model) {
//		String usr=request.getParameter("user");
//		String pass=request.getParameter("pwd");
//		
//		User user=new User();
//		user.setUserName(usr);
//		user.setPassword(pass);
//		model.addAttribute("info", user);
//		
//		return "userdata";
//	}
	
	@RequestMapping("/submituser")
	public String submitForm(@RequestParam("user") String usr, @RequestParam("pwd") String pas, Model model, User user) {
		user.setPassword(pas);
		user.setUserName(usr);
		model.addAttribute("info", user);
		return "userdata";
	}
}
