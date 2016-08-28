package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.LoginDao;
import com.model.User;


@Service
@Transactional
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginDao ld;
	
	@Override
	public boolean CheckUser(User u) {
		boolean b=false;
		b=ld.CheckUser(u);
		if(b==true){
			b=true;
		}
		return b;
	}

}
