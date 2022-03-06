package com.dimon.fitroom.user.services;

import java.util.List;

import com.dimon.fitroom.user.dto.UserDTO;

public interface UserService {

	public List<UserDTO> getUsers();
	
	public void initData();
	
}
