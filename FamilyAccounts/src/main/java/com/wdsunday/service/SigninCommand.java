package com.wdsunday.service;

import com.fasterxml.jackson.annotation.JsonInclude;

public class SigninCommand {

	String userName;

	String password;





	public String getAccount() {
		return userName;
	}

	public void setAccount(String account) {
		this.userName = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public SigninCommand() {

	}
}