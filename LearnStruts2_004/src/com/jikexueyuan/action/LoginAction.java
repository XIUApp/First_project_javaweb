package com.jikexueyuan.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

//这是linlin这个用户进行的分支开发，等待合并分支
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	
	public String execute ()
	{
		if (this.username.equals("admin") && this.password.equals("123")){
			System.out.println("登录成功");
			return "success";
		}
		else{
			System.out.println("登录失败");
			return "fail";
		}
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
