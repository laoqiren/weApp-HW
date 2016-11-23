package com.umis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.umis.entity.Users;
import com.umis.entity.UsersAll;

public interface UsersAllRepository extends JpaRepository<UsersAll, Integer> {
	
	public UsersAll findByUserPhone(String userPhone);

}
