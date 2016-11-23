package com.umis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.umis.entity.UsersAll;
import com.umis.exception.UsersAllException;
import com.umis.repository.UsersAllRepository;
import com.umis.util.ExceptionCode;

@Component("UsersAllService")
@Transactional
public class UsersAllServiceImpl implements UsersAllService {
	
	@Autowired
    private UsersAllRepository usersAllRepository;

	@Override
	public void addUserAll(UsersAll userAll) throws UsersAllException {
		// TODO Auto-generated method stub
		if(userAll == null){
			throw new UsersAllException(ExceptionCode.UsersAll_Not_Found, "UserAll Not Found");
		}
			
		usersAllRepository.save(userAll);
	}

	@Override
	public void deleteUserAll(UsersAll userAll) throws UsersAllException {
		// TODO Auto-generated method stub
		if(userAll == null){
			throw new UsersAllException(ExceptionCode.UsersAll_Not_Found, "UserAll Not Found");
		}
		usersAllRepository.delete(userAll);
	}

	@Override
	public void updateUserAll(UsersAll userAll) throws UsersAllException {
		// TODO Auto-generated method stub
		if(userAll == null){
			throw new UsersAllException(ExceptionCode.UsersAll_Not_Found, "UserAll Not Found");
		}
		usersAllRepository.save(userAll);
	}

	@Override
	public UsersAll getUserAll(String userPhone) throws UsersAllException {
		// TODO Auto-generated method stub
		UsersAll usersAll = new UsersAll();
		usersAll = usersAllRepository.findByUserPhone(userPhone);
		if(usersAll == null){
			throw new UsersAllException(ExceptionCode.UsersAll_Not_Found, "UserAll Not Found");
		}
		return usersAll;
	}
	
	

}
