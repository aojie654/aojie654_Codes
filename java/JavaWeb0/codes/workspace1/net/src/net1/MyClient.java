package net1;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MyClient {
	//���������� 1 ���շ�������Ϣ�� 2 ������Ϣ����������
	public static void main(String[] args) throws UnknownHostException, IOException{
		Socket s  = new Socket("192.168.202.229",30000);
		//���˿ͻ��˵��׽�����Ϊ�˿ͻ��˵Ľ����߳�����������
		//����1 �ܹ��������Է���������Ϣ��
		new Thread(new ClientThread(s)).start();
		//����2 ������Ϣ��������
		//�õ���������������������
		PrintStream ps = new PrintStream(s.getOutputStream());
		//�õ�������
		Scanner scanner = new Scanner(System.in);
		//ѭ������м�����Ϣ�����͸���������
		while(scanner.hasNext()){
			String str=scanner.next();
			if(str.endsWith("exit")){
				break;
			}else{
				ps.println(str);
			}
		}
		scanner.close();
		ps.close();
		s.close();
	}

}
