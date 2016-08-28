package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;


@Entity(name = "register")
@Component

public class BornUser {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String fname;
	private String lname;
	private String email;
	private int phnumber;
	private String password;
	private String cPassword;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhnumber() {
		return phnumber;
	}
	public void setPhnumber(int phnumber) {
		this.phnumber = phnumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getcPassword() {
		return cPassword;
	}
	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}

}
