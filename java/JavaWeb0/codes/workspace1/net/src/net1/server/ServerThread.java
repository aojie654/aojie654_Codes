package net1.server;
import java.io.*;
import java.net.*;

// ������ÿ���߳�ͨ�ŵ��߳��� 
// ��ÿ���߳�ȡ�õ���Ϣ�㲥��
public class ServerThread implements Runnable 
{
	String ip;
	// ���嵱ǰ�߳��������Socket
	Socket s = null;
	// ���߳��������Socket����Ӧ��������
	BufferedReader br = null;
	public ServerThread(Socket s)
	throws IOException
	{
		this.s = s;
		ip = s.getInetAddress().toString();
		// ��ʼ����Socket��Ӧ��������
		br = new BufferedReader(new InputStreamReader(s.getInputStream()));
	}
	public void run()
	{
		try
		{
			String content = null;
			// ����ѭ�����ϴ�Socket�ж�ȡ�ͻ��˷��͹���������
			while ((content = readFromClient()) != null)
			{	
				content = content +ip;//����ip��ַ
				System.out.println(content);//���������̨��
				// ����socketList�е�ÿ��Socket��
				// ��������������ÿ��Socket����һ��
				for (Socket s : MyServer.socketList)
				{
					PrintStream ps = new PrintStream(s.getOutputStream());
					ps.println(content);

				}
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	// �����ȡ�ͻ������ݵķ���
	private String readFromClient()
	{
		try
		{
			return br.readLine();
		}
		// �����׽���쳣��������Socket��Ӧ�Ŀͻ����Ѿ��ر�
		catch (IOException e)
		{
			// ɾ����Socket��
			MyServer.socketList.remove(s);      // ��
		}
		return null;
	}
}
