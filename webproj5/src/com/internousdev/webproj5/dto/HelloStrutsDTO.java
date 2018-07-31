package com.internousdev.webproj5.dto;

public class HelloStrutsDTO {

	private int userId;

	private String userName;

	private String password;

	private String result;


	//userIdî•ñ‚ğ‚ğ‚Æ‚Á‚Ä‚«‚Ä‚ªˆ—Œ‹‰Ê‚Æ‚µ‚Ä•Ô‚Á‚Ä‚­‚é
	public int getUserId(){
		return userId;
	}

	//int userId‚É‚Æ‚Á‚Ä‚«‚½î•ñuserId‚ğİ’è‚·‚é
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
