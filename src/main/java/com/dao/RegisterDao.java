package com.dao;

import org.springframework.stereotype.Repository;

import com.model.BornUser;
import com.model.UserBean;


public interface RegisterDao {

	
/*	public void edit(BornUser ob);

	public boolean save(BornUser ob);
	*/

/*public void saveOrUpdate(UserBean userBean);*/

public void save(UserBean userBean);
}
