package net1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����׽��֣�ָ��IP Port ��ip�Ͷ˿ڵķ���˽������ӣ�
		Socket socket = null;
		BufferedReader br = null;
		try {//��ʦ������ip 192.168.202.229
			 socket = new Socket("127.0.0.1",30000);
			//����ɹ���������! ��socket����
			//�õ������������Ұ�װ��BufferedReader�����
			 br= new	BufferedReader(
					new InputStreamReader( socket.getInputStream()));
			String line = br.readLine();
			System.out.println("���Է���������Ϣ��"+line);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
				try {
					br.close();
					socket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}			
		}
	}

}
