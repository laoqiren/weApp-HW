package com.umis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.umis.entity.ExtraObtain;
import com.umis.entity.Users;

public interface ExtraObtainRepository extends JpaRepository<ExtraObtain, Integer> {
	
	public ExtraObtain findByUserNumber(String userNumber);
}
