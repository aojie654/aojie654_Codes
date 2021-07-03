package bean;

import java.io.Serializable;

public class UserBean implements Serializable{

	private static final long serialVersionUID = 1L;
	//����bean����û���������
	private String userName;
	private String userPwd;
	
	//�޲ι��캯��
	public UserBean(){}
	//�вι��캯��
	public UserBean(String name,String pwd){
		this.userName=name;
		this.userPwd=pwd;
	}	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
}
