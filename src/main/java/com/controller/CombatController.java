package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CombatController {
	
	@RequestMapping(value={"admin/home","/home"})
	public String home(){
		return "mypage";
	}

}
