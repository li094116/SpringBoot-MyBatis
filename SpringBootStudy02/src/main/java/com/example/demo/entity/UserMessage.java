package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 实体类：当前类的一个对象可以封装USER_MESSAGE表中一行用户信息
 * @author 李禹锡
 *
 */
public class UserMessage implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer userId;
	
	private String userName;
	
	private String userPassword;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date userBirthday;
	
	private String userEmail;
	
	private Integer userSex;
	
	

	public UserMessage() {
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Date getUserBirthday() {
		return userBirthday;
	}

	public void setUserBirthday(Date userBirthday) {
		this.userBirthday = userBirthday;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Integer getUserSex() {
		return userSex;
	}

	public void setUserSex(Integer userSex) {
		this.userSex = userSex;
	}

	@Override
	public String toString() {
		return "UserMessage [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", userBirthday=" + userBirthday + ", userEmail=" + userEmail + ", userSex=" + userSex + "]";
	}
	
	

}
