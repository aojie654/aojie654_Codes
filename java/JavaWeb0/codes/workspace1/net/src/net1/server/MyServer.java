package net1.server;
import java.net.*;
import java.io.*;
import java.util.*;

//������˼· 1 �и�list�������пͻ��˵�socket
//�и��߳�һֱ׼����Ӧ�ͻ��˽������ӣ�socket
public class MyServer
{
	//���屣������Socket��ArrayList
	public static ArrayList<Socket> socketList
		= new ArrayList<>();
	public static void main(String[] args) 
		throws IOException
	{
		ServerSocket ss = new ServerSocket(30001);
		while(true)
		{
			// ���д������������һֱ�ȴ����˵�����
			Socket s = ss.accept();
			socketList.add(s);
			// ÿ���ͻ������Ӻ�����һ��ServerThread�߳�Ϊ�ÿͻ��˷���
			new Thread(new ServerThread(s)).start();
			//Ϊÿ���ͻ�����һ���߳̽��ж����ݲ��㲥��
		}
	}
}
