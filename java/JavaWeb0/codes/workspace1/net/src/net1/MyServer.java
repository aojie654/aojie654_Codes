package net1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class MyServer {
	public static List<Socket> list= new ArrayList<Socket>();
	//������˼· 1 �и�list�������пͻ��˵�socket
	//�и��߳�һֱ׼����Ӧ�ͻ��˽������ӣ�socket
	public static void main(String[] args) throws IOException {
		ServerSocket ss =new ServerSocket(30001) ;
		while(true){
			Socket s = ss.accept();//1 ���տͻ�����������
			list.add(s);//2 ���׽��ֵ�list�У�
			new Thread(new ServerThread(s)).start();//�����ͻ����׽����߳�
		}
	}

}
