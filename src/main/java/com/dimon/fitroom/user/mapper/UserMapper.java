package com.dimon.fitroom.user.mapper;

import java.util.Date;

import com.dimon.fitroom.user.dao.entity.UserEntity;
import com.dimon.fitroom.user.dto.UserDTO;

public final class UserMapper {

	private static UserMapper instance;
    public String value;

    private UserMapper() {
    }

    public static UserMapper getInstance(String value) {
        if (instance == null) {
            instance = new UserMapper();
        }
        return instance;
    }
    
    public static UserDTO toDTO(UserEntity userEntity) {
    	UserDTO userDTO = new UserDTO();
    	userDTO.setMail(userEntity.getMail());
    	userDTO.setName(userEntity.getName());
    	userDTO.setSurname(userEntity.getSurname());
    	userDTO.setRegisterDate(userEntity.getRegisterDate());
    	return userDTO;
    }
    
    public static UserEntity fromDTO(UserDTO userDTO) {
    	UserEntity userEntity = new UserEntity();
    	userEntity.setMail(userDTO.getMail());
    	userEntity.setName(userDTO.getName());
    	userEntity.setSurname(userDTO.getSurname());
    	userEntity.setRegisterDate(userDTO.getRegisterDate());
    	return userEntity;
    }
}
