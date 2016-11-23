package com.umis.service;

import com.umis.entity.ExtraObtain;
import com.umis.exception.ExtraObtainException;


public interface ExtraObtainService {
	
	public void addExtraObtain(ExtraObtain extraObtain) throws ExtraObtainException;
	public void deleteExtraObtain(ExtraObtain extraObtain) throws ExtraObtainException;
	public void updateExtraObtain(ExtraObtain extraObtain) throws ExtraObtainException;
	public ExtraObtain getExtraObtain(String userNumber) throws ExtraObtainException;

}
