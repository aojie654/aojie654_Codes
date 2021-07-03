package net.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ServerThread implements Runnable{
	private String ip;//�õ��ͻ���ip��ַ
	private Socket s;//���������뵱ǰ�ͻ��������׽��֣�
	private BufferedReader br;//�õ��ͻ���������
	public ServerThread(Socket s) throws IOException{
		this.s =s;//��ʼ��s
		ip=s.getInetAddress().toString();//��ʼ��ip��ַ
		//�ͻ��˵õ���������Ҳ���ǵõ����������͹��������ݣ�
		br = new BufferedReader(
				new InputStreamReader(
						s.getInputStream()));
	}
	@Override
	public void run() {
		String content ;
		//�㲥��ÿ���׽�����Ϣ��
		while((content =readFromClient())!=null){
			content +=ip;//������ݼ��Ͽͻ���ip
			for(Socket s:MyServer.list){//�������е��׽��֡�
				//��ÿ���׽��ַ�����Ϣ
				PrintStream ps;
				try {
					ps = new PrintStream(s.getOutputStream());
					ps.println(content);	
				} catch (IOException e) {
				}
			}
		}
	}
	private String readFromClient(){
		try {
			return br.readLine();
		} catch (IOException e) {
			//�ͻ��������ˡ�list���Ƴ����ߵ��׽���s
			MyServer.list.remove(s);
		}
		return null;
	}
}
