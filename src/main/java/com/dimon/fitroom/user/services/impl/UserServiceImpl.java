package com.dimon.fitroom.user.services.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dimon.fitroom.user.dao.entity.UserEntity;
import com.dimon.fitroom.user.dao.repository.UserRepository;
import com.dimon.fitroom.user.dto.UserDTO;
import com.dimon.fitroom.user.mapper.UserMapper;
import com.dimon.fitroom.user.services.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	/**
	 * return list of UserDTO from DAO
	 */
	@Override
	public List<UserDTO> getUsers() {
		List<UserEntity> userEntities = userRepository.findAll();
		List<UserDTO> userDTOs = new ArrayList<UserDTO>();
		for (UserEntity userEntity : userEntities) {
			userDTOs.add(UserMapper.toDTO(userEntity));
		}
		return userDTOs;
	}

	@Override
	public void initData() {
		
		UserDTO user1 = new UserDTO();
		user1.setMail("1@mail.com");
		user1.setName("1name");
		user1.setSurname("surname1");
		user1.setRegisterDate(new Date());
		userRepository.save(UserMapper.fromDTO(user1));

		UserDTO user2 = new UserDTO();
		user2.setMail("2@mail.com");
		user2.setName("2name");
		user2.setSurname("surname2");
		user2.setRegisterDate(new Date());
		userRepository.save(UserMapper.fromDTO(user2));

		UserDTO user3 = new UserDTO();
		user3.setMail("3@mail.com");
		user3.setName("3name");
		user3.setSurname("surname3");
		user3.setRegisterDate(new Date());
		userRepository.save(UserMapper.fromDTO(user3));

		UserDTO user4 = new UserDTO();
		user4.setMail("4@mail.com");
		user4.setName("4name");
		user4.setSurname("surname4");
		user4.setRegisterDate(new Date());
		userRepository.save(UserMapper.fromDTO(user4));

		UserDTO user5 = new UserDTO();
		user5.setMail("5@mail.com");
		user5.setName("5name");
		user5.setSurname("surname5");
		user5.setRegisterDate(new Date());
		userRepository.save(UserMapper.fromDTO(user5));

	}

}
