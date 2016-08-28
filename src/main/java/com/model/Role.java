package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Role {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private String roleid;

private String role;

public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
@OneToOne
@JoinColumn(name="userName")
private UserBean u;

public String getRoleid() {
	return roleid;
}
public void setRoleid(String roleid) {
	this.roleid = roleid;
}

public UserBean getU() {
	return u;
}
public void setU(UserBean u) {
	this.u = u;
}
	
	

}
