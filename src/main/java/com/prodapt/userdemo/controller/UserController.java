package com.prodapt.userdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.prodapt.userdemo.entity.User;
import com.prodapt.userdemo.entity.UserDetails;
import com.prodapt.userdemo.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/registration")
	public String showRegistrationForm(@ModelAttribute("user" ) User user, @ModelAttribute("userdetails") UserDetails userdetails) {
		return "registration";
	}
	
	@PostMapping("/saveuser")
	public ModelAndView saveUser(@ModelAttribute("user" ) User user, @ModelAttribute("userdetails") UserDetails userdetails) {
		user.setUserDetails(userdetails);
		User userdata = userService.addUser(user);
		ModelAndView mv = new ModelAndView();
		mv.addObject("userData",userdata );
		mv.setViewName("registration");
		return mv;
	}
	


}
