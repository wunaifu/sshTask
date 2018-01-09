package com.wnf.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.wnf.entity.User;
import com.wnf.service.UserService;

@SessionAttributes(value = "user")
@Controller
public class UserController {
	@Autowired
	UserService userService;
//	@Autowired
//	User user;

	@RequestMapping(name = "login")
	public String DOlogin(HttpServletRequest request, ModelMap modelMap) {
		System.out.println("成功");
		return null;
	}
}
