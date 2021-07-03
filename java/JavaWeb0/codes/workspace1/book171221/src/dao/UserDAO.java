package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DBmanager.*;
import bean.*;

import java.sql.PreparedStatement;

/**
 * �������User�������ݿ��е�����
 * 
 * 
 */
public class UserDAO {

	
	// ���ݿ������
	DBManager dbm = null;
	// ���ݿ�����
	private Connection conn = null;
	// �Ự
	private Statement stmt = null;
	// �����
	private ResultSet rs = null;
	// Ԥ��������
	private PreparedStatement pstmt = null;
	
	/**
	 * �޲ι��캯��
	 * 
	 */
	public UserDAO() {
		dbm=new DBManager();
		this.conn=dbm.getConnection();
	}

	/**
	 * �вι��캯��
	 * @param conn
	 */
	public UserDAO(DBManager dbm,Connection conn) {
		this.dbm=dbm;
		this.conn=conn;
	}
	
	/**
	 * ��֤�û�Ȩ��
	 */
	public boolean userTest(User u) {
		// ��ѯ���ݿ��SQL���
		String sql = "select * from user where name=\'" + u.getName()
				+ " \'and pass =\'" + u.getPass() + "\'";
		
		try {
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			// �ж��û��Ƿ������ݿ���
			if (rs.next()) {
				return true;	// �ڣ�������
			} else {
				return false;	// ���ڣ����ؼ�
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			// �ر����ݿ�����
			dbm.closeAll(rs,stmt,conn);
		}
		return false;
	}
	
	/**
	 * ��ȡָ��Id�û�
	 */
	public User getUser(int id) {
		// ��ѯ���ݿ��SQL���
		String sql = "select * from user where id="+id+";";
		User u =new User();
		try {
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			// �ж��û��Ƿ������ݿ���
			if(rs.next()){
				u = new User();
				u.setId(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setPass(rs.getString(3));
				u.setRole(rs.getInt(4));
				u.setRealName(rs.getString(5));
				u.setPhone(rs.getString(6));
				u.setEmail(rs.getString(7));
				u.setAddress(rs.getString(8));
				u.setAge(rs.getInt(9));
				u.setSex(rs.getString(10));
				u.setRegisterDate(rs.getDate(11));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			// �ر����ݿ�����
			dbm.closeAll(rs,stmt,conn);
		}
		return u;
	}
	
	
	/**
	 * ����һ���û�����USER��
	 * @param user
	 */
	public void insertUser(User user) {
		String sql = "insert into user(name,pass,role,realName,phone,email,address,age,sex,registerDate) values(?,?,?,?,?,?,?,?,?,?)";
		
		try {
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			// ���Ԥ��������
			pstmt = conn.prepareStatement(sql);
			// ���ν����Բ������ݿ�
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getPass());
			pstmt.setString(3, String.valueOf(user.getRole()));
			pstmt.setString(4, user.getRealName());
			pstmt.setString(5, user.getPhone());
			pstmt.setString(6, user.getEmail());
			pstmt.setString(7, user.getAddress());
			pstmt.setString(8, String.valueOf(user.getAge()));
			pstmt.setString(9, user.getSex());
			pstmt.setString(10, String.valueOf(user.getRegisterDate()));
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();

		}finally {
			// �ر����ݿ�����
			dbm.closeAll(rs,stmt,conn);
		}
	}
	
	/**
	 * ����һ���û�����USER��
	 * @param user
	 */
	public void updateUser(User user) {
		String sql = "update user set name = ?,realName=?,phone =?, email =?,address=?," +
		"age=?,sex=? where id = "+ user.getId();
		try {
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			// ���Ԥ��������
			pstmt = conn.prepareStatement(sql);
			// ���ν����Բ������ݿ�
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getRealName());
			pstmt.setString(3, user.getPhone());
			pstmt.setString(4, user.getEmail());
			pstmt.setString(5, user.getAddress());
			pstmt.setString(6, String.valueOf(user.getAge()));
			pstmt.setString(7, user.getSex());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			// �ر����ݿ�����
			dbm.closeAll(rs,stmt,conn);
		}
	}
	
	/**
	 * ��ѯ����USER����
	 * @param name
	 * @return
	 */
	public List<User> getUserList(){
		String querry = "select name,age,sex,id from user ;";
		List<User> userList = new ArrayList<User>();
		try{
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			stmt = conn.createStatement();
			rs = stmt.executeQuery(querry);
			while(rs.next()){
				User u = new User();
				u.setName(rs.getString(1));
				u.setAge(rs.getInt(2));
				u.setSex(rs.getString(3));
				u.setId(rs.getInt(4));
				userList.add(u);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
				// �ر����ݿ�����
				dbm.closeAll(rs,stmt,conn);
			}
		return userList;
	}
	/**
	 * ����������ѯһ��USER����
	 * @param name
	 * @return
	 */
	public User querryUserbyName(String name){
		String querry = "select * from user where name = \'"+ name+"\';";
		User u = null;
		
		try{
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			stmt = conn.createStatement();
			rs = stmt.executeQuery(querry);
			
			while(rs.next()){
				u = new User();
				u.setId(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setPass(rs.getString(3));
				u.setRole(rs.getInt(4));
				u.setRealName(rs.getString(5));
				u.setPhone(rs.getString(6));
				u.setEmail(rs.getString(7));
				u.setAddress(rs.getString(8));
				u.setAge(rs.getInt(9));
				u.setSex(rs.getString(10));
				u.setRegisterDate(rs.getDate(11));
				
			}
			
			return u;
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
				// �ر����ݿ�����
				dbm.closeAll(rs,stmt,conn);
			}
		return u;
	}
	
	/**
	 * �ж��Ƿ��ǹ���Ա
	 * @param u
	 * 			
	 * @return
	 * 		����ǹ���Ա��������
	 * 		���Ƿ��ؼ�
	 */
	public boolean adminTest(String name,String password){
		//��ѯ���ݿ��SQL���
		String sql = "select * from user where name=\'" + name
				+ " \'and pass=\'" + password+"\'and role=0";
		try {
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			// �ж��û��Ƿ������ݿ���
			if (rs.next()) {
				return true;	// �ڣ�������
			} else {
				return false;	// ���ڣ����ؼ�
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			// �ر����ݿ�����
			dbm.closeAll(rs,stmt,conn);
		}
		return false;
	}
	
	/**
	 * �����û�ID��ɾ��һ���û�����
	 * @param id
	 */
	public void delete(int id){
		
		String delete = "delete from user where id = "+id+";";
		
		try{
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			stmt = conn.createStatement();
			stmt.executeUpdate(delete);
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			dbm.closeAll(null, stmt, conn);
		}
	}
	
}
