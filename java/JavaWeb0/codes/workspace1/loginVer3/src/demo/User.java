package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//�Ե�¼��Ϣ������֤��
public class User {
	//���ڲ����û�������Ϣ��
	private static String [][] data={{"bi","123"},{"admin","admin"},
		{"lily","123456"},{"tiger","scott"},{"root","root"}};
	
	//��֤�û��������룡
	public static boolean checkLogin(String user ,String pass){
		boolean ok = false;
		for(int i=0;i<data.length;i++){
			//data[i][0] i�е�һ��Ԫ�ء��϶����û�����
			//data[i][1] i�еڶ���Ԫ�أ� �϶������롣
			if(user.equals(data[i][0])&&pass.equals(data[i][1])){
				ok=true;
				break;
			}
		}
		return ok;
	}
	
	public static boolean checkLogin2(String user, String pass){
		boolean ok = false;
		//�������ݿ⣡sql ="select * from user"
		//sql����м������ͣ��� ɾ ��  �顣ֻ�в�����sql��䷵�ؽ����
		//1 ע�����ݿ����������࣡
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection conn=null;
		Statement state=null;//�Ƚϼ򵥣�
		//��Statement�����ܸ�ǿ��Ч�ʸ��ߡ�sql������У�������Ҫ�趨ʱʹ�á�
		PreparedStatement pst=null;
		ResultSet rs=null;//�����
		try{
			//2������ݿ�����  
			//��Ƿ��ţ� Сд��ĸ
			String url = "jdbc:mysql://192.168.202.229:3306/bookstore";
			 conn=DriverManager.getConnection(url, "java", "java");
			//3��ò������ݿ�ľ��Statement����
			 state = conn.createStatement();
			//4ִ��sql��䣬��ý�� select ���ʹ��executeQuery
			 rs=	state.executeQuery("select name,pass from user;");
			 //������ ɾ ��ʹ���ĸ�������executeUpdate
			 //int count=  state.executeUpdate(sql);
			
			 //5�����select�������Ҫ�Է��صĽ�������д���resultSet
			//��������rs������������н����
			String userName="",passWord="";
			while(rs.next()){//rs.next()�ж�ֻҪ������������������ѭ��
				userName=rs.getString("name");
				passWord=rs.getString("pass");
				if(userName.equals(user)&&passWord.equals(pass)){
					ok=true;
					break;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {//6 �ر���Դ�����򿪵���Դ�����ȹرգ�
				if(rs!=null){
					rs.close();
				}
				if(state!=null){
					state.close();
				}
				if(conn!=null){
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//���ؽ��
		return ok;
	}
	
	
	//����User���Ƿ���ȷ��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ok = User.checkLogin("bi", "123");
		System.out.println(ok);
		ok = User.checkLogin("admin", "admin");
		System.out.println(ok);
		ok = User.checkLogin("lily", "123");
		System.out.println(ok);
		ok = User.checkLogin("roott", "root");
		System.out.println(ok);
	}

}
