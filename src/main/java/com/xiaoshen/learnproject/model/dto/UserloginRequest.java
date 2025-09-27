package com.xiaoshen.learnproject.model.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserloginRequest implements Serializable {

	/**
	 * 账号
	 */
	private String userAccount;

	/**
	 * 密码
	 */
	private String userPassword;


	private static final long serialVersionUID = 1L;
	
}
