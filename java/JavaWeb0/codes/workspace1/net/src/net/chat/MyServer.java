package net.chat;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.net.*;
//��Ҫ����server�ࡣһ��list����ͻ���socket �������߳����У�
//��һ��server�̸߳�����տͻ������ݣ����㲥�������ˣ�
public class MyServer {
	//list�������пͻ����߳�
	public static List<Socket> list = new ArrayList<Socket>();
	
	public static void main(String[] args) throws IOException{
		//����serversocket
		ServerSocket ss = new ServerSocket(30001);
		while(true){//�ȴ��ͻ����󡣲��������Ӻõ��׽���
			Socket s = ss.accept();
			list.add(s);//���ܲ������׽���s��list�У�
			//��������մ˿ͻ����߳���������Ҫ����˿ͻ���Ϣ�Ľ��պ͹㲥�������ˣ�
			new Thread(new ServerThread(s)).start();
		}
	}
}
