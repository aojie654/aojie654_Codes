package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import DBmanager.DBManager;
import bean.*;

/**
 * ʵ�ֶԹ��ﳵ�Ĺ���
 *
 */
public class BookCartDAO {
	
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
	public BookCartDAO(){
		dbm=new DBManager();
		this.conn=dbm.getConnection();
	}
	
	/**
	 * �вι��캯��
	 * @param conn
	 */
	public BookCartDAO(DBManager dbm,Connection con){
		this.dbm=dbm;
		this.conn=con;
	}
	
	/**
	 * ɾ�����ﳵ�е�һ����¼
	 * @param id
	 * @throws SQLException 
	 */
	public void deleteCart(String bookId) throws SQLException{
		
		String delete;
		delete = "delete from cart where bookId="+bookId+";";
		
		try{
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			stmt = conn.createStatement();
			stmt.executeUpdate(delete);
			
		}catch(SQLException e){
			e.printStackTrace();
			throw e;
		}finally{
			dbm.closeAll(rs, stmt, conn);
		}	
	}
	
	
	/**
	 * ɾ���û����ﳵ�е����м�¼
	 * @param userName
	 * @throws SQLException 
	 */
	public void deleteUserCart(String userName) throws SQLException{
		
		String delete;
		delete = "delete from cart where userName='"+userName+"';";
		try{
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			stmt = conn.createStatement();
			stmt.executeUpdate(delete);
			
		}catch(SQLException e){
			e.printStackTrace();
			throw e;
		}finally{
			dbm.closeAll(rs,stmt,conn);
		}	
	}
	
	/**
	 * ���ﳵ�в���һ����¼
	 * @param cart
	 */
	public void insertCart(BookCart cart){
		
		
		String name=cart.getName();
		float unitPrice = cart.getUnitPrice();
		float totalPrice = cart.getTotalPrice(); 
		int number = cart.getNumber();
		Date date = cart.getAddDate();
		int bookId = cart.getBookId();
		String userName = cart.getUserName();

		String insert = "insert into cart(userName,name,unitPrice,number,totalPrice,addDate,bookId)" +
						"values(?,?,?,?,?,?,?);";
		
		try{
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			pstmt = conn.prepareStatement(insert);
			pstmt.setString(1, userName);
			pstmt.setString(2,name);
			pstmt.setFloat(3, unitPrice);
			pstmt.setInt(4,number);
			pstmt.setFloat(5,totalPrice);
			pstmt.setDate(6,date);
			pstmt.setInt(7,bookId);
			pstmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			dbm.closeAll(rs, pstmt, conn);
		}
		
	}
	
	/**
	 * ���ﳵ�и���һ����¼
	 * @param cart
	 */
	public void updateCart(BookCart cart){
		
		float unitPrice = cart.getUnitPrice();
		float totalPrice = cart.getTotalPrice(); 
		int number = cart.getNumber();
		Date date = cart.getAddDate();
		int bookId = cart.getBookId();

		String update = "update cart set unitPrice= ?,number =?,totalPrice=?,addDate=? where bookId= " +
						bookId;
		
		try{
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			pstmt = conn.prepareStatement(update);
			pstmt.setFloat(1, unitPrice);
			pstmt.setInt(2,number);
			pstmt.setFloat(3, totalPrice);
			pstmt.setDate(4,date);
			pstmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			dbm.closeAll(rs, pstmt, conn);
		}
		
	}
	
	/**
	 * �����û�������ѯ��Ӧ�Ĺ��ﳵ��¼
	 * @param userName
	 * @return
	 */
	public List<BookCart> querryCart(String userName){
		
		
		String querry = "select * from cart where userName=\'"+userName+"\';";

		BookCart cart=null; 
		List<BookCart> allCart = new ArrayList<BookCart>();
			
			
		try{
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			stmt = conn.createStatement();
			rs = stmt.executeQuery(querry);
			
			while(rs.next()){
			cart = new BookCart();
			cart.setId(rs.getInt(1));
			cart.setUserName(rs.getString(2));
			cart.setName(rs.getString(3));
			cart.setUnitPrice(rs.getFloat(4));
			cart.setNumber(rs.getInt(5));
			cart.setTotalPrice(rs.getFloat(6));
			cart.setAddDate(rs.getDate(7));
			cart.setBookId(rs.getInt(8));
			allCart.add(cart);
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
				dbm.closeAll(rs, stmt, conn);
		}
		return allCart;
	}
	
	/**
	 * �����û�������ID����ѯ��Ӧ��ĳ�����ﳵ��¼
	 * @param userName
	 * @param bookId
	 * @return
	 */
	public BookCart querryCartById(String userName,int bookId){
		
		
		String querry = "select * from cart where userName=\'"+userName+"\' and bookId ="+bookId + ";";
		BookCart cart=null;
		
		try{
			conn = dbm.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(querry);
			
			if(rs.next()){
			cart = new BookCart();
			cart.setId(rs.getInt(1));
			cart.setUserName(rs.getString(2));
			cart.setName(rs.getString(3));
			cart.setUnitPrice(rs.getFloat(4));
			cart.setNumber(rs.getInt(5));
			cart.setTotalPrice(rs.getFloat(6));
			cart.setAddDate(rs.getDate(7));
			cart.setBookId(rs.getInt(8));
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			dbm.closeAll(rs, stmt, conn);
		}
		return cart;
	}
}
