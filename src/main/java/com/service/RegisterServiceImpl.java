package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.RegisterDao;
import com.model.BornUser;
import com.model.UserBean;


//service 
@Service
//t
@Transactional
public class RegisterServiceImpl implements RegisterService {

	
	@Autowired
	private RegisterDao dao;
	
	
	/*@Override
	public boolean save(BornUser ob)
	{
		dao.save(ob);
		return false;
	}
	
	public void edit(BornUser ob){
		dao.edit(ob);
	}*/

	@Override
	public void save(UserBean userBean) {
		// TODO Auto-generated method stub
		      dao.save(userBean);
	}
}
