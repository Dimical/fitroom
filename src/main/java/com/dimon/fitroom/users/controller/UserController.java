package com.dimon.fitroom.users.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dimon.fitroom.users.dto.UserDTO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "UserController", tags = "Users")
@RestController
public class UserController {
	
	@ApiOperation(value = "Get list of Users", response = UserDTO.class, tags = "getUsers")
    @GetMapping(value = "/api/users")
    public @ResponseBody UserDTO getTestData() {


        return new UserDTO();
    }
}
