package net1;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
	public static void main(String[] args) throws IOException{
		//������socket ��ָ��ip��������portҪָ��
		ServerSocket ss = new ServerSocket(30001);
		//���������������Ӧ ��127.0.0.1
		while(true){//Socket s = new Socket("192.168.202.229",30000);
			Socket s = ss.accept();//ss�׽��ֵȴ��ͻ��˷�������
			// s���ǽ����õķ������˵��׽��֣�
			PrintStream ps =new PrintStream(s.getOutputStream());
			ps.println("hello��лл��ķ��ʣ�"+s.getInetAddress());
			
			//�ر���Դ
			ps.close();
			s.close();
		}
		
		
	}
}
