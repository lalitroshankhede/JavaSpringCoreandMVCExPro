package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.dao.UserDao;
import com.model.User;

@Controller
public class UserController {

	// setting and getting property automatically 
	@Autowired
	private UserDao userDao;

	
	// Handling Form Request for Registration Process
	
	@RequestMapping(path = "/registerForm", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute("user") User user, Model model) {
		System.out.println(user);

		int createUser = userDao.createUser(user);

		model.addAttribute("message", createUser);

		return "index";
	}

	
 
	// Handling Form Request for Login Process
	
	@RequestMapping(path = "/loginForm", method = RequestMethod.POST)
	public RedirectView handleLoginForm(@ModelAttribute User user, Model model, HttpServletRequest request) {

		List<User> users = userDao.getAllUser();
       
	 
		String email = user.getEmail();
		String password = user.getPassword();
		
		
		for (User u : users) {
			
			if (email.equals(u.getEmail()) && password.equals(u.getPassword())) {
 	
				 RedirectView redirectView = new RedirectView();
				 
				redirectView.setUrl(request.getContextPath() + "/menus");
				
				 return redirectView;
				
			}
          
			
		}
		 
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;

	}
	
	
	
	

}
