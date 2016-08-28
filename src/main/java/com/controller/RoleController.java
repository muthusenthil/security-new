/*package com.controller;



	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.servlet.ModelAndView;

	import com.niit.foodcart.dao.impl.RoleDao;
	import com.niit.foodcart.model.Role;

	@Controller
	public class RoleController {
	@Autowired RoleDao roledao;

	//@RequestMapping(value="/role",method=RequestMethod.GET)
	//public String getrole()
	//{
//		return "role";
	//}
	@ModelAttribute("role")
	public Role bala(){
		return new Role();
	}
	@RequestMapping(value="/role",method=RequestMethod.POST)
	public ModelAndView role(@ModelAttribute("role") Role role){
		
		roledao.saveOrUpdate(role);
		ModelAndView mv=new ModelAndView("foodproducts");
		return mv;
	}
	}

}*/
