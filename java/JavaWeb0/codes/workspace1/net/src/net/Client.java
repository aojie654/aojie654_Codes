package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		//�����ͻ��˵��׽��֣�  //IP �Ͷ˿ںţ�
		Socket socket = null;
		BufferedReader br = null;
		try {//�׽���Ո�� ����ip��ַ��port̖��
			socket = new Socket("127.0.0.1",30001);
			//�õ�����
			br =new BufferedReader(
				new InputStreamReader( socket.getInputStream()));
			//��ȡ���ݣ�
			String line =br.readLine();
			//����ȡ������д������̨��
			System.out.println("from server��"+line);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			//�ر���Դ��
			try {
				br.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}

}
