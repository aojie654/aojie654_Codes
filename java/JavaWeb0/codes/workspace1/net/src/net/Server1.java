package net;
import java.io.IOException;
import java.io.PrintStream;
import java.net.*;
public class Server1 {

	public static void main(String[] args) {
		//�΄� ��ͻ��˵��������׽������Ӳ���Ӧ�ͻ��˷���һ����Ϣ��
		
		//1 �������������׽��֣�
		//���������׽��� ֻ��ָ���˿ںţ�ip���Ǳ�����
		//���׽����Ƿ������˵ġ��ȴ��ͻ������Լ����󣡿������ɶ���׽��֣�
		Socket s=null;
		PrintStream ps =null;
		try {
			ServerSocket ss = new ServerSocket(30001);
			//ss�׽��ֵȴ��ͻ������󡣳ɹ���᷵��һ���������Ӧ���׽���
			while(true){
				s=ss.accept();//����ͻ��˷���������������s
				//s��������͸��ͻ��˵�������
				ps =new PrintStream(s.getOutputStream());
				ps.println("hello "+s.getInetAddress()+" лл���ʷ�������");
				//�ر���Դ
				ps.close();
				s.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//�ǵùر���Դ��

		}
	}

}
