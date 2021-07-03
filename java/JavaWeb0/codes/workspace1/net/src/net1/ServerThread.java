package net1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
//�㲥�м��Ϸ���Ϣ��ip��ַ��
//��ʼ�����������Socket ͬʱ ���շ��������ݣ�����ӡ����̨��
public class ServerThread implements Runnable{

	private Socket s;
	private BufferedReader br=null;
	//��ʼ�����࣡�����׽��ֺ�������
	public ServerThread(Socket s) throws IOException{
		this.s = s;
		br = new BufferedReader(
			new InputStreamReader(	s.getInputStream()));
	}
	//�������շ��������ݣ�����ӡ��
	public void run(){
		String content;
		try {//��readFromClientΪnull˵���ͻ��˳���
			while((content=readFromClient())!=null){
				//forѭ��ÿ���ͻ��˵��׽��֣�
				for(Socket s:MyServer.list){
					PrintStream ps =new PrintStream(s.getOutputStream());
					ps.print(content);//�㲥��ÿ���ͻ��ˣ�
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String readFromClient(){
		try {
			return br.readLine();
		} catch (IOException e) {
			//��������쳣��˵���ͻ������ˡ�����Ҫ��list���Ƴ���s
			MyServer.list.remove(s);
		}
		return null;//�������������return null
	}
}
