/*package com.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Role;

@Repository
	@Transactional
	public class RoleDaoImpl implements RoleDao{
	@Autowired SessionFactory sf;

	@Override
	public void saveOrUpdate(Role role) {
		// TODO Auto-generated method stub
		role.setRole("ROLE_USER");
		sf.getCurrentSession().saveOrUpdate(role);
	}

	@Override
	public void saveOrUpdate(Role role) {
		// TODO Auto-generated method stub
		
	}


	}


}*/
