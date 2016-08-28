package com.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Component;

import com.service.RegisterService;

@Component
public class Demohandler {
	public UserBean initFlow(){
		return new UserBean();
	}
 
	
	@Autowired(required=true)
	private RegisterService rs;
	
	public String validateDetails(UserBean userBean,MessageContext messageContext){
		
	
	
		String status = "success";
		if(userBean.getUserName().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"userName").defaultText("UserName cannot be Empty").build());
			status = "failure";
		}
		if(userBean.getEmail().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"email").defaultText("Email cannot be Empty").build());
			status = "failure";
		}
		if(userBean.getPassword().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"password").defaultText("Password cannot be Empty").build());
			status = "failure";
		}
		if(userBean.getAddress().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"address").defaultText("Address cannot be Empty").build());
			status = "failure";
		}
		if(userBean.getPhonenumber().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"phonenumber").defaultText("Phonenumber cannot be Empty").build());
			status = "failure";
		}
		if(userBean.getAge()==null){
			messageContext.addMessage(new MessageBuilder().error().source(
					"age").defaultText("Age cannot be Empty").build());
			status = "failure";
		}
		rs.save(userBean);
		return status;
	}
	

}
