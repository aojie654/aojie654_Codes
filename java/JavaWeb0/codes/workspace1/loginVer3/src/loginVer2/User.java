package loginVer2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class User {
	//����һ����֤���������û�����������֤��
	//�汾1 �û����������ݷ������С�
	public static String[][] data ={{"bi","123"},{"xiaowang","111"},{"admin","admin"},
			{"lily","123456"},{"ab","ab"},{"9p","9p"}};
	public static boolean checkLogin(String name,String pass){
		boolean ok=false;
		//�������������check �ж��Ƿ���ȷ��
		for(int i=0;i<data.length;i++){
			if(name.equals(data[i][0])&&pass.equals(data[i][1])){
				ok= true;
			}
		}
		return ok;
	}
	
	public static boolean checkLogin2(String name,String pass){
		boolean ok=false;
		//�������������check �ж��Ƿ���ȷ��
		//�� ɾ �� �� ����sql��䡣
		//����resultset��ֻ�в���һ��sql���
		//1 �������ݿ���������ǰ����jar���ѵ���
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			String url ="jdbc:mysql://192.168.202.229:3306/bookstore";
			//2������������
			Connection conn = DriverManager.getConnection(url, "java", "java");
			//3 �����������Statement����
			Statement state=conn.createStatement();
			//4ִ��sql��䡣��������
			ResultSet rs =state.executeQuery("select name,pass from user");
			//5 ����ResultSet�������//�����select���
			String userName=null,passWord=null;
			
			while(rs.next()){
				userName = rs.getString("name");
				passWord = rs.getString("pass");
				if(name.equals(userName)&&pass.equals(passWord)){
					ok=true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			//�ر���Դ��
		}
		return ok;
	}
	//�˷����������Ժ����Ƿ���ȷ
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ok=User.checkLogin("lily", "123456");
		System.out.println(ok);
		ok=User.checkLogin("9p", "9p");
		System.out.println(ok);
		ok=User.checkLogin("9p", "xxx");
		System.out.println(ok);
	}
}
