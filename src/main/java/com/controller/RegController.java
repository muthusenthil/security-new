/*package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.*;
import com.service.RegisterService;


@Controller
public class RegController {
	
	@Autowired(required = true)
	RegisterService rs;
	
	
	@ModelAttribute("regform")
	public BornUser getfh() {
		return new BornUser();
	}

	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String getregister() {

		return "register";

	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView BornUser(@ModelAttribute("regform") BornUser ob, BindingResult result) {
		rs.save(ob);
		rs.edit(ob);
		ModelAndView mv = new ModelAndView("login");
		mv.addObject("msg", "you successfully registered");
		return mv;
	}


}
*/