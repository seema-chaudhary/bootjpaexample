package com.jps.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jps.test.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
	public List<User> findByName(String name);
	
	public List<User> findByNameAndCity(String name, String City);
	
//	public List<User> findByNameOrderByName(String name);
//	public List<User> findByNameStartingWith(String prefix);
//	public List<User> findByNameEndingWith(String suffix);
//	public List<User> findByNameContaining(String word);
//	public List<User> findByNameLike(String likepattern);
//	public List<User> findByAgeLessThan(int age);
//	public List<User> findByAgeGreaterThanEqual(int age);
//	public List<User> findByAgeIn(Collection<Integer> ages);
	
//	Creating custom query************************************************
//	@Query
//	JPQL Query
//	nativeQuery
	
	@Query("select u FROM User u")
	public List<User> getAllUserS();
	
	@Query("select u FROM User u WHERE u.name=:n")
	public List<User> getUserByNameS(@Param("n")String name);
	
	@Query("select u FROM User u WHERE u.name=:n and u.city=:c")
	public List<User> getUserByNameCity(@Param("n")String name,@Param("c")String city);
	
//	Creating native-query or SQL Query **********
	
	@Query(value="select * from user", nativeQuery=true)
	public List<User> getAllUsersSQL();
	
}
