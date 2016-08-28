	package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.User;
import com.service.LoginService;


@Controller
public class FrontController {
	
	

	@Autowired
	LoginService ls;
	
	
	@RequestMapping(value={"/","admin/back","/index","/back"})
	private String multi()
	{
		return "index";
	}
	
	
	@RequestMapping("/click")
	private String multiple()
	{
		return "boseoverear";
	}
	
	
	@RequestMapping("/login")
	private String mass()
	{
		return "login";
	}
	
	/*@RequestMapping("/uploadFile")
	private String messie()
	{
		return "singleUpload";
	}*/
	
	
	
/*	@RequestMapping("/login")
	private String mass()
	{
		return "login";
	}*/

	@RequestMapping("/sennheiser1")
	private String hello()
	{
		return "sennheiser";
	}
	
	@RequestMapping("/skullcandy1")
	private String sample()
	{
		return "skullcandy";
	}
	
	
	@RequestMapping("/sony1/back")
	private String demo()
	{
		return "sony";
	}
	
	
	@RequestMapping("/bose1")
	private String dull()
	{
		return "bose";
	}
	
	@RequestMapping("/panasonic1")
	private String vary()
	{
		return "panasonic";
	}
	
	@RequestMapping("/beats1")
	private String apps()
	{
		return "beats";
	}
	
	@RequestMapping("/monster1")
	private String quick()
	{
		return "monster";
	}
	
	@RequestMapping("/sentey1")
	private String mat()
	{
		return "sentey";
	}
	/*@RequestMapping("/new")
	private String wat()
	{
		return "bo";
	}
	*/
	@RequestMapping(value="/link",method=RequestMethod.POST)
	public ModelAndView loginuser(@RequestParam("name") String name,@RequestParam("pwd") String pwd){
		boolean isvaliduser =false;
		User u=new User();
		u.setUserName(name);
		u.setPassword(pwd);
		isvaliduser =ls.CheckUser(u);
		ModelAndView mv=new ModelAndView("index");
		if(isvaliduser==true)
		{
		mv.addObject("msg", "hello welcome");
		mv.addObject("name", u.getUserName());
		}
		return mv;
	}
	
}
