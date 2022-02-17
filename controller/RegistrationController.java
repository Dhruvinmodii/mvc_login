package mvc_mysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mvc_mysql.model.User;
import mvc_mysql.service.UserService;

@Controller
public class RegistrationController {
	@Autowired
	public UserService userservice;
	
	@RequestMapping(path = "/register" , method = RequestMethod.GET)
	public String showRegister()
	{
		return "register";
	}
	
	@RequestMapping(path = "/registerprocess" , method = RequestMethod.POST)
	public String adduser(@ModelAttribute("user") User user , Model model)
	{
		userservice.register(user);
		model.addAttribute("name" , user.getName());
		return "welcome";
	}
}
