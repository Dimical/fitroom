package com.dimon.fitroom.user.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dimon.fitroom.user.dto.UserDTO;
import com.dimon.fitroom.user.services.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "UserController", tags = "Users")
@RestController
public class UserController {
	
	@Resource
	UserService userService;
	
	@ApiOperation(value = "Get list of Users", response = UserDTO.class, tags = "getUsers")
    @GetMapping(value = "/api/users")
    public @ResponseBody List<UserDTO> getTestData() {

        return userService.getUsers();
        
    }
	
	@ApiOperation(value = "Get list of Users", response = UserDTO.class, tags = "getUsers")
    @GetMapping(value = "/api/initData")
    public @ResponseBody List<UserDTO> initUsers() {

		userService.initData();
        return null;
        
    }
}
