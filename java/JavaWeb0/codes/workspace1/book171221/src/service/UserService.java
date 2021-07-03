package service;

import java.util.List;

import bean.User;
import dao.BookCategoryDAO;
import dao.UserDAO;

public class UserService {
	/**
	 * ��������û���Ϣ�б�
	 * 
	 * @return List<User> �û���Ϣ�б�
	 */
	public List<User>  getUserList(){
		
		List<User> userList;
		UserDAO userdao = new UserDAO();
		userList = userdao.getUserList();
		return userList;
	}
	
	/**
	 * ����ƶ�id�û�
	 * 
	 * @return User �û���Ϣ
	 */
	public User  getUser(String id){
		
		User user;
		UserDAO userdao = new UserDAO();
		user = userdao.getUser(Integer.valueOf(id));
		return user; 
	}
	
	/**
	 * ����ɾ��һ���û�
	 * @param String id
	 *	
	 */
	public void deleteUser(String id){
		UserDAO userdao = new UserDAO();
		userdao.delete(Integer.valueOf(id).intValue());
	}
	
	/**
	 * ����ɾ������û�
	 * @param String id
	 *	
	 */
	public void deleteUsers(String[] ids){
		for(String id:ids){
		UserDAO userdao = new UserDAO();
		userdao.delete(Integer.valueOf(id).intValue());
		}
	}
	
	//����һ���û��� 
	public void insertUser(User user){
		UserDAO userdao = new UserDAO();
		userdao.insertUser(user);
	}
	
	//����һ���û��� 
	public void updateUser(User user){
		UserDAO userdao = new UserDAO();
		userdao.updateUser(user);
	}
}
