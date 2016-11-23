package com.umis.service;

import com.umis.entity.UsersAll;
import com.umis.exception.UsersAllException;

public interface UsersAllService {
	
	public void addUserAll(UsersAll userAll) throws UsersAllException;
	public void deleteUserAll(UsersAll userAll) throws UsersAllException;
	public void updateUserAll(UsersAll userAll) throws UsersAllException;
	public UsersAll getUserAll(String userPhone) throws UsersAllException;
	
	

}
