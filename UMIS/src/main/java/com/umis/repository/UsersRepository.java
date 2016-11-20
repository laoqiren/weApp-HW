package com.umis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.umis.entity.Users;

//模糊查詢不太正常

/*Saving an entity can be performed via the CrudRepository.save(…)-Method. It will persist or merge 
 * the given entity using the underlying JPA EntityManager. If the entity has not been persisted yet 
 * Spring Data JPA will save the entity via a call to the entityManager.persist(…) method, 
 * otherwise the entityManager.merge(…) method will be called.
 * 
 * 意思是save方法在使用时如果表中没有该项，就插入该项，否则就更新该项
 * 链接 http://docs.spring.io/spring-data/data-jpa/docs/current/reference/html/#jpa.entity-persistence.saving-entites
 */

public interface UsersRepository extends JpaRepository<Users, Integer>{
	
	public Users findByUserName(String userName);        
	
	public List<Users> findByUserNameLike(String userName);
	
	@Query("select u from Users u where u.userName like :userName")
	public Users findUserNameLike(@Param("userName") String userName);

	@Query("select u from Users u where u.userNumber = :userNumber")   //在语句里用名称来匹配查询参数
	public Users findByUserNumber(@Param("userNumber") String userNumber);
	
	
	/*
	@Query("select u from Users u where u.userPhone = ?1")   //在语句里使用参数的索引号匹配查询参数
	public List<Users> findByUserPhone(String userPhone);
	
	public List<Users> findFirst10ByUserPhone(String userPhone);   //获得符合查询条件的前10 条语句
	*/
}

