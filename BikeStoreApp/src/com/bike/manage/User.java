package com.bike.manage;

public class User {
	private int userId;
	private String userName;
	private String userMobile;
	private String userEmail;
	private String userAddress;
	
	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserMobile() {
		return userMobile;
	}


	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}


	public String getUserEmail() {
		return userEmail;
	}


	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}


	public String getUserAddress() {
		return userAddress;
	}


	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	
	
	public int getUserId() {
		return userId;
	}
	
		

	


	public User(int userId, String userName, String userMobile, String userEmail, String userAddress) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userMobile = userMobile;
		this.userEmail = userEmail;
		this.userAddress = userAddress;
	}


	public User(String userName, String userMobile, String userEmail, String userAddress) {
		super();
		this.userName = userName;
		this.userMobile = userMobile;
		this.userEmail = userEmail;
		this.userAddress = userAddress;
	}


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userMobile=" + userMobile + ", userEmail="
				+ userEmail + ", userAddress=" + userAddress + "]";
	}


	



	
}
