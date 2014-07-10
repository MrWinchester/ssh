package com.dean.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dean.web.model.User;
import com.dean.web.service.UserService;

/**
 * @author Lucifer
 * @version create time：Jul 9, 2014 5:40:18 PM
 */
@Controller
public class UserController 
{
	@Resource
	private UserService service;
	
	@RequestMapping("/loginView")
	public String loginView()
	{
		return "login";
	}
	
	@RequestMapping("/login")
	public ModelAndView login(User user)
	{
		ModelAndView mav = new ModelAndView();
		User u = service.loginCheck(user);
		
		if(null==u)
		{
			mav.setViewName("login");
			mav.addObject("errorMsg", "用户名或密码错误");
			return mav;
		}else
		{
			mav.setViewName("success");
			mav.addObject("user", u);
			return mav;
		}
	}
}
