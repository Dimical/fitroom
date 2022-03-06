package com.dimon.fitroom.users.dto;

import io.swagger.annotations.ApiModelProperty;

public class UserDTO {

	@ApiModelProperty(notes = "Surname of the User", name = "surname", value = "test surname")
	private String surname;
	
	@ApiModelProperty(notes = "Name of the User", name = "name", value = "test name")
	private String name;

	@ApiModelProperty(notes = "Mail of the User", name = "mail", required = true, value = "test mail")
	private String mail;

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

}
