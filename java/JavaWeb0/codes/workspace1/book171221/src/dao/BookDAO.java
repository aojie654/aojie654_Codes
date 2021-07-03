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
 * ʵ�ֶ�BOOK�Ĺ���
 *
 */
public class BookDAO {
	
	
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
	public BookDAO() {
		dbm=new DBManager();
		this.conn=dbm.getConnection();
	}
	
	/**
	 * �вι��캯��
	 * @param conn
	 */
	public BookDAO(DBManager dbm,Connection conn) {
		this.dbm=dbm;
		this.conn=conn;
	}
	
	/**
	 * ���ݱ������ѯBOOK
	 * @param id
	 * @return BOOK����
	 */
	public Book querryBookbyId(int bookId){
		
		String querry = "select * from book where id = "+ bookId +";";
		
		Book book = null;
		try{
			book = new Book();
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			stmt = conn.createStatement();
			rs = stmt.executeQuery(querry);
			
			if(rs.next()){
				book.setId(rs.getInt(1));
				book.setName(rs.getString(2));
				book.setIsbn(rs.getString(3));
				book.setAuthor(rs.getString(4));
				book.setPublishing(rs.getString(5));
				book.setPrice(rs.getFloat(6));
				book.setCategoryId(rs.getInt(7));
				book.setIntroduction(rs.getString(8));
				book.setOnSaleDate(rs.getDate(9));
				book.setOnPublishDate(rs.getDate(10));
				book.setOnSaleNum(rs.getInt(11));
				book.setRemainNum(rs.getInt(12));
				book.setImage(rs.getString(13));
				
				return book;
			}
			
			return book;
		}catch(Exception e ){
			e.printStackTrace();
		}finally{
			dbm.closeAll(rs, stmt, conn);
		}
		return book;
	}
	
	/**
	 * ��ѯ���е�ͼ��
	 * @return ARRAYLIST ��ѯ���
	 */
	public List<Book> querryAllBooks(){
		String querry = "select * from book;";
		
		List<Book> al = null;
		
		try{
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			stmt = conn.createStatement();
			rs = stmt.executeQuery(querry);
			al = new ArrayList<Book>();
			
			while(rs.next()){
				Book bk = new Book();
				bk.setId(rs.getInt(1));
				bk.setName(rs.getString(2));
				bk.setIsbn(rs.getString(3));
				bk.setAuthor(rs.getString(4));
				bk.setPublishing(rs.getString(5));
				bk.setPrice(rs.getFloat(6));
				bk.setCategoryId(rs.getInt(7));
				bk.setIntroduction(rs.getString(8));
				bk.setOnSaleDate(rs.getDate(9));
				bk.setOnPublishDate(rs.getDate(10));
				bk.setOnSaleNum(rs.getInt(11));
				bk.setRemainNum(rs.getInt(12));
				bk.setImage(rs.getString(13));
				
				al.add(bk);
			}
			
			return al;
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			dbm.closeAll(rs, stmt, conn);
		}
		
		return al;
	}
	
		
	
	
	/**
	 * ����һ���鵽���ݿ�
	 * @param book
	 */
	public void insert(Book book){
		String insert = "insert into book(name,isbn,author,publishing,price,categoryId,introduction,onSaleDate,onPublishDate,onSaleNum,remainNum,image)" +
						"values(?,?,?,?,?,?,?,?,?,?,?,?);";
		
		
		try{
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			pstmt = conn.prepareStatement(insert);
			pstmt.setString(1, book.getName());
			pstmt.setString(2, book.getIsbn());
			pstmt.setString(3, book.getAuthor());
			pstmt.setString(4,book.getPublishing());
			pstmt.setDouble(5,book.getPrice());
			pstmt.setInt(6,book.getCategoryId());
			pstmt.setString(7,book.getIntroduction());
			pstmt.setDate(8,book.getOnSaleDate());
			pstmt.setDate(9,book.getOnPublishDate());
			pstmt.setInt(10,book.getOnSaleNum());
			pstmt.setInt(11,book.getRemainNum());
			pstmt.setString(12,book.getImage());
			
			pstmt.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			dbm.closeAll(rs, pstmt, conn);
		}
	}
	
	/**
	 * ����IDɾ��һ����
	 * @param bookId
	 */
	public void delete(int bookId){
		String delete = "delete from book where id = "+ bookId+ ";";
		
		try{
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			stmt = conn.createStatement();
			stmt.executeUpdate(delete);
		}catch(Exception e){
			e.printStackTrace()
			;
		}finally{
			dbm.closeAll(null, stmt, conn);
		}
	}
	
	/**
	 * ����һ�������Ϣ
	 * @param book
	 */
	public void update(Book book){
		String update = "update book set name = ?,isbn=?,author =?, publishing =?,price=?," +
				"categoryId=?,introduction=?,onSaleDate=?,onPublishDate=?,onSaleNum =?,remainNum=?,image=? where id = "+ book.getId();
		
		try{
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			pstmt = conn.prepareStatement(update);
			pstmt.setString(1, book.getName());
			pstmt.setString(2, book.getIsbn());
			pstmt.setString(3, book.getAuthor());
			pstmt.setString(4,book.getPublishing());
			pstmt.setDouble(5,book.getPrice());
			pstmt.setInt(6,book.getCategoryId());
			pstmt.setString(7,book.getIntroduction());
			pstmt.setDate(8,book.getOnSaleDate());
			pstmt.setDate(9,book.getOnPublishDate());
			pstmt.setInt(10,book.getOnSaleNum());
			pstmt.setInt(11,book.getRemainNum());
			pstmt.setString(12,book.getImage());
			
			pstmt.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			dbm.closeAll(null, pstmt, conn);
		}
	}
	
	/**
	 * �����������
	 * @param bookId
	 * @param saleNum
	 * @throws SQLException 
	 */
	public void updateNum(int bookId,int saleNum) throws SQLException{
		
		String querry = "select remainNum from book where id="+bookId;
		String sql;
		
		try{
			if(conn.isClosed()){
				conn = dbm.getConnection();
			}
			stmt = conn.createStatement();
			rs = stmt.executeQuery(querry);
			int num=0;
			if(rs.next()){
			 num = rs.getInt(1);
			}
			sql= "update book set remainNum ="+(num-saleNum)+" where id="+ bookId+ ";";
			stmt.executeUpdate(sql);
		}catch(SQLException e){
			e.printStackTrace();
			throw e;
		}finally{
			dbm.closeAll(rs,stmt,conn);
		}
		
	}
	
	
}
