package com.dimon.fitroom.user.dto;

import java.util.Date;
import io.swagger.annotations.ApiModelProperty;

public class UserDTO {

	@ApiModelProperty( name = "surname", value = "test surname", example = "Jean")
	private String surname;
	
	@ApiModelProperty( name = "name", value = "test name", example = "Martin")
	private String name;

	@ApiModelProperty( name = "mail", required = true, value = "test mail", example = "jean.martin@mail.com")
	private String mail;
	
	@ApiModelProperty( name = "registerDate", value = "Register date")
	private Date registerDate;

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * @return the registerDate
	 */
	public Date getRegisterDate() {
		return registerDate;
	}

	/**
	 * @param registerDate the registerDate to set
	 */
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

}
