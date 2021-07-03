package net1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

//��ʼ�����������Socket ͬʱ ���շ��������ݣ�����ӡ����̨��
public class ClientThread implements Runnable{

	private Socket s;
	private BufferedReader br=null;
	//��ʼ�����࣡�����׽��ֺ�������
	public ClientThread(Socket s) throws IOException{
		this.s = s;
		br = new BufferedReader(
			new InputStreamReader(	s.getInputStream()));
	}
	//�������շ��������ݣ�����ӡ��
	public void run(){
		String content;
		try {
			while((content=br.readLine())!=null){
				System.out.println("���Է�����:"+content);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
