package com.jikexueyuan.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

//����linlin����û����еķ�֧�������ȴ��ϲ���֧
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	
	public String execute ()
	{
		if (this.username.equals("admin") && this.password.equals("123")){
			System.out.println("��¼�ɹ�");
			return "success";
		}
		else{
			System.out.println("��¼ʧ��");
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
