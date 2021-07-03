package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DBmanager.*;
import bean.*;

/**
 * ʵ��ͼ��������
 * 
 */

public class BookCategoryDAO {
	
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
	public BookCategoryDAO(){
		dbm=new DBManager();
		this.conn=dbm.getConnection();
	}
	
	/**
	 * �вι��캯��
	 * @param conn
	 */
	public BookCategoryDAO(DBManager dbm,Connection con){
		this.dbm=dbm;
		this.conn=con;
	}
	
	/**
	 * �������������ѯ��Ӧ�������󷵻�
	 * @param id
	 * @return BookCategory
	 */
	
	public BookCategory querryUseName(String name) {
		String querry = "select * from category where name = \'"+name+"\'";

		BookCategory  bc = null;
		try{
			bc = new BookCategory();
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			stmt = conn.createStatement();
			rs = stmt.executeQuery(querry);
			
			if(rs.next()){
				bc.setId(rs.getInt(1));
				bc.setName(rs.getString(2));
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			dbm.closeAll(rs, stmt, conn);
		}
		return bc;
	}
	
	/**
	 * ����ID����ѯ��Ӧ��������
	 * @param id
	 * @return ������
	 */
	public BookCategory querry(int id){
		String querry = "select * from category where id = "+id+";";
		BookCategory  bc = null;
		try{
			bc = new BookCategory();
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			stmt = conn.createStatement();
			rs = stmt.executeQuery(querry);
			
			while(rs.next()){
				bc.setId(rs.getInt(1));
				bc.setName(rs.getString(2));
			}
		return bc;
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			dbm.closeAll(rs, stmt, conn);
		}
		return bc;
	}
	
	
	/**
	 * ��һ����������뵽���ݿ���
	 * @param bc
	 */
	public void insert(BookCategory bc){
		String insert = "insert into category(name) values(?);";
		
		try{
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			pstmt = conn.prepareStatement(insert);
			pstmt.setString(1, bc.getName());
			pstmt.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			dbm.closeAll(null, pstmt, conn);
		}
	}
	
	/**
	 * ����ID��ɾ��һ��������
	 * @param id
	 */
	public void delete(int id){
		
		String delete = "delete from category where id = "+id+";";
		
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
	
	/**
	 * ����һ��������
	 * @param bc
	 */
	public void update(BookCategory bc){
		String update = "update category set name = ?  where id = "+ bc.getId()+";";
		
		try{
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			pstmt = conn.prepareStatement(update);
			pstmt.setString(1,bc.getName());
			pstmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			dbm.closeAll(null, pstmt, conn);
		}
	}
	
	/**
	 * ��ѯ����ͼ�����
	 * @return
	 */
	public List<BookCategory> querryCategory() {
		String sql = "select * from category";
	
		List<BookCategory> categoryList = null;
		try {
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			stmt = conn.createStatement();
			categoryList = new ArrayList<BookCategory>();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				BookCategory bc =new BookCategory();
				bc.setId(rs.getInt(1));
				bc.setName(rs.getString(2));
				categoryList.add(bc);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbm.closeAll(rs,stmt,conn);
		}
		return categoryList;
	}
}
