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
 * �������TradeRecord�����ݿ��е�����
 *
 */ 
public class TradeRecordDAO {
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
	public TradeRecordDAO() {
		dbm=new DBManager();
		this.conn=dbm.getConnection();
	}
	
	/**
	 * �вι��캯��
	 * @param conn
	 */
	public TradeRecordDAO(DBManager dbm,Connection conn) {
		this.dbm=dbm;
		this.conn=conn;
	}
	
	/**
	 * ��һ�����׼�¼������뵽���ݿ���
	 * @param tr
	 * @throws SQLException 
	 */
	public void insertRecord(TradeRecord tr) throws SQLException {
		// ���ݿ�������
		String sql = "insert into traderecord(userId,bookId,tradeNum,sum) values(?,?,?,?)";
		
		try {
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			// ���Ԥ��������
			pstmt = conn.prepareStatement(sql);
			// ���ν����Բ������ݿ�
			pstmt.setString(1, String.valueOf(tr.getUserId()));
			pstmt.setString(2, String.valueOf(tr.getBookId()));
			pstmt.setString(3, String.valueOf(tr.getTradeNum()));
			pstmt.setString(4, String.valueOf(tr.getSum()));
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			// �ر����ݿ�����
			dbm.closeAll(rs,stmt,conn);
		}
	}
	
	/**
	 * ��ѯ�������ۼ�¼
	 */
	public List<TradeRecord> querryRecord() {
		String sql = "select * from traderecord";
		List<TradeRecord> recordList = null;
		try {
			if(conn.isClosed()){
				conn =	dbm.getConnection();
			}
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			recordList = new ArrayList<TradeRecord>();
			
			while(rs.next()) {
				TradeRecord tr = new TradeRecord();
				tr.setId(rs.getInt(1));
				tr.setUserId(rs.getInt(2));
				tr.setBookId(rs.getInt(3));
				tr.setTradeNum(rs.getInt(4));
				tr.setSum(rs.getDouble(5));
				recordList.add(tr);
			}
			return recordList;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbm.closeAll(rs,stmt,conn);
			
		}
		return recordList;
	}
}
