package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.User;

@Repository
@Transactional
public class LoginDaoImpl implements LoginDao{
	
	@Autowired
	private SessionFactory sf;
	@Override
	public boolean CheckUser(User u) {
		boolean isvaliduser=false;
		
		Query q=sf.openSession().createQuery("from UserFe where name= '"+u.getUserName()+"' and password='"+u.getPassword()+"'");
		List<User> lu=q.list();
		int s=lu.size();
		if(s==1)
		{
			isvaliduser=true;
		}
		
		return isvaliduser;
	}

}
