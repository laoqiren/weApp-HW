package com.umis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.umis.entity.ExtraObtain;
import com.umis.exception.ExtraObtainException;
import com.umis.repository.ExtraObtainRepository;
import com.umis.util.ExceptionCode;

@Component("ExtraObtainService")
@Transactional
public class ExtraObtainServiceImpl implements ExtraObtainService {

	 @Autowired
	 private ExtraObtainRepository extraObtainRepository;
	
	@Override
	public void addExtraObtain(ExtraObtain extraObtain) throws ExtraObtainException {
		// TODO Auto-generated method stub
		if(extraObtain == null){
			throw new ExtraObtainException(ExceptionCode.ExtraObtain_Not_Found, "ExtraObtain Not Found");
		}
		extraObtainRepository.save(extraObtain);
		
	}

	@Override
	public void deleteExtraObtain(ExtraObtain extraObtain) throws ExtraObtainException {
		// TODO Auto-generated method stub
		if(extraObtain == null){
			throw new ExtraObtainException(ExceptionCode.ExtraObtain_Not_Found, "ExtraObtain Not Found");
		}
		extraObtainRepository.delete(extraObtain);
	}

	@Override
	public void updateExtraObtain(ExtraObtain extraObtain) throws ExtraObtainException {
		// TODO Auto-generated method stub
		if(extraObtain == null){
			throw new ExtraObtainException(ExceptionCode.ExtraObtain_Not_Found, "ExtraObtain Not Found");
		}
		extraObtainRepository.save(extraObtain);
	}

	@Override
	public ExtraObtain getExtraObtain(String userNumber) throws ExtraObtainException {
		// TODO Auto-generated method stub
		
		ExtraObtain temp = new ExtraObtain();
		temp=extraObtainRepository.findByUserNumber(userNumber);
		if(temp == null){
			throw new ExtraObtainException(ExceptionCode.ExtraObtain_Not_Found, "ExtraObtain Not Found");
		}
		return temp;
	}
	
	
	

}
