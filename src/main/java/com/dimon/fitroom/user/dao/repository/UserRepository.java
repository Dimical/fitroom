package com.dimon.fitroom.user.dao.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.dimon.fitroom.user.dao.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Long>{

	List<UserEntity> findAll();
	
	UserEntity findByNameLike(String nameLike);
	
	UserEntity findByMailLike(String mailLike);

	UserEntity findBySurnameLike(String nameLike);
	
	UserEntity findByRegisterDateGreaterThan(Date nameLike);

}
