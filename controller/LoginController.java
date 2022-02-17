package mvc_mysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mvc_mysql.model.Login;
import mvc_mysql.model.User;
import mvc_mysql.service.UserService;

@Controller
public class LoginController {
	@Autowired
	UserService userservice;
	
	@RequestMapping(path="/login" , method = RequestMethod.GET)
	public String showLogin()
	{
		return "login";		
	}
	
	@RequestMapping(path = "/loginprocess" , method = RequestMethod.POST)
	public String loginProcess(@ModelAttribute("login") Login login , Model model)
	{
		User user = userservice.validateUser(login);
		if (null != user)
		{
			model.addAttribute("Name" , user.getName());
			return "welcome";	
		}
		else
		{
			model.addAttribute("message" , "username or password is wrong!!");
			return "login";
		}	
	}
	
}
