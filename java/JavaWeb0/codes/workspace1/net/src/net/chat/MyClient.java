package net.chat;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

//�����ࡣ�ֱ��������̡߳�һ�����ܷ�������Ϣ����ӡ������̨
//��һ�����ܼ������룬���͸������������̻߳�Ҫ������������������ӣ�ͬʱ������һ���߳�
public class MyClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//1 ��������
		Socket s = new Socket("127.0.0.1",30001);
		//2 ����һ���̹߳��������߳̽��շ��������ݣ�����ӡ������̨��
		new Thread(new ClientThread(s)).start();
		//���߳̽��ܼ������룬���͸���������
		//3 �õ��������
		PrintStream ps = new PrintStream(
				s.getOutputStream());
		//4 ȡ�ü�������
		Scanner scanner = new Scanner(System.in);
		String line;
		//ֻҪ�м������ݣ���ѭ����á�
		while(scanner.hasNext()){
			line =scanner.next();
			if(line.equals("exit")){
				break;//�����exit�ַ��������˳����� �������͸���������
			}else{//5 ��������line����������
				ps.println(line);
			}
		}
		//�ر���Դ �ر�˳����
		ps.close();
		s.close();
	}
}
