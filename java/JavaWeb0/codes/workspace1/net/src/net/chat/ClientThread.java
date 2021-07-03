package net.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
//���շ���������Ϣ������ӡ������̨��
public class ClientThread implements Runnable{
	private Socket s;//�׽���
	private BufferedReader br;//�ͻ������������Ƿ��������͵���Ϣ��
	public ClientThread(Socket s) throws IOException{
		this.s =s;
		//�ͻ��˵õ���������Ҳ���ǵõ����������͹��������ݣ�
		br = new BufferedReader(
				new InputStreamReader(
						s.getInputStream()));
	}
	//���շ������˷��͵����ݣ�����ӡ������̨
	@Override
	public void run() {
		String line;
		try {//ѭ���ӷ������˶�ȡ���ݣ������Ϊnull���ӡ����̨��
			while((line=br.readLine())!=null){
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
