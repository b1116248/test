package com.internousdev.webproj5.dto;

public class HelloStrutsDTO {

	private int userId;

	private String userName;

	private String password;

	private String result;


	//userId�������Ƃ��Ă��Ă��������ʂƂ��ĕԂ��Ă���
	public int getUserId(){
		return userId;
	}

	//int userId�ɂƂ��Ă������userId��ݒ肷��
	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getUserName(){
		return userName;
	}

	public void setUserName(String userName){
		this.userName = userName;
}

	public String getPassword(){
		return password;
		}


	public void setPassword(String password) {
		this.password = password;
	}

	public String getResult(){
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	}
