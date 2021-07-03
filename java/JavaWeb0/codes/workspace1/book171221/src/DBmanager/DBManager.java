package DBmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * ���������������ݿ�,�ر����ݿ�
 * 
 * 
 */
public class DBManager {
	/**
	 * �޲ι��캯��
	 * 
	 */
	public DBManager() {

	}

	private Connection conn = null;

	private String url = "jdbc:mysql://localhost:3306/bookstore";

	private String username = "root";

	private String password = "root";
	
	private boolean transactionON = false; 

	/**
	 * ������ݿ����Ӷ���
	 * 
	 * @return conn ���ݿ����Ӷ���
	 */
	public Connection getConnection() {

		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			conn = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;
	}

	/**
	 * �ر����ݿ�
	 */
	public void closeAll(ResultSet rs,Statement stmt,Connection conn) {

		try {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null&&!isTransactionON()) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ��������
	 * @param conn
	 * 
	 */
	public void startTransaction(Connection conn)throws SQLException{
		this.transactionON=true;
		conn.setAutoCommit(false);
	}
	
	/**
	 * �ύ������
	 * 
	 * @param conn ���ݿ����Ӷ���
	 * @throws SQLException 
	 */
	public void commitTransaction(Connection conn) throws SQLException{		
		conn.commit();
		conn.setAutoCommit(true);
		this.transactionON=false;
	}
	
	/**
	 * �ع�������
	 * 
	 * @param conn ���ݿ����Ӷ���
	 */
	public void rollbackTransaction(Connection conn){
		
		try {
			this.transactionON=false;
			conn.rollback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * �ж������Ƿ���
	 * 
	 * @return  transactionON
	 */
	public boolean isTransactionON() {
		return transactionON;
	}
}
