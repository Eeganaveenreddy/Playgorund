package com.sathya.spring.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController 
{
	@RequestMapping(value="loginpage",method=RequestMethod.GET)
	public ModelAndView getLoginPage()
	{
		return new ModelAndView("login","loginFormBackingObject",new Login());
	}
	@RequestMapping(value="check",method=RequestMethod.POST)
	public ModelAndView processRequest(@Valid@ModelAttribute("loginFormBackingObject")Login login,BindingResult result)
	{
		if(result.hasErrors())
		{
			return new ModelAndView("login");
		}
		else
		{
			String username = login.getUname();
			String password = login.getPwd();
			if(username.equals("Sathya")&&password.equals("java"))
			{
				return new ModelAndView("success");
			}
			else
			{
				return new ModelAndView("failure");
			}
		}
	}
}
