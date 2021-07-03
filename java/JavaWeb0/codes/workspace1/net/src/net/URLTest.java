package net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class URLTest {
	/**  www.baidu.com?name1=value1&name2=value2
	 * ��ָ��URL����GET����������
	 * @param url ���������URL
	 * @param param �����������ʽ����name1=value1&name2=value2����ʽ��
	 * @return URL������Զ����Դ����Ӧ
	 */
	public static String sendGet(String url , String param) 
	{
		String result = "";
		String urlName = url + "?" + param;
		try
		{
			URL realUrl = new URL(urlName);
			// �򿪺�URL֮������� ������������������ˣ��������������
			URLConnection conn = realUrl.openConnection();
			// ����ͨ�õ��������� αװhttp����httpͷ�������ã�
			conn.setRequestProperty("accept", "*/*"); 
			conn.setRequestProperty("connection", "Keep-Alive"); 
			conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)"); 
		
			//���������ӣ�
			conn.connect();
			//�����Ӧ��ͷ�ֶ�
			Map<String,List<String>> map=conn.getHeaderFields();
			for(String key:map.keySet()){
				System.out.println(key+"--->"+map.get(key));
			}
			//��þ������ݣ�  try���÷�������Ҫ�ͷŵĶ������try�����С�������ʾ��finanlly�ͷţ�
			try(BufferedReader bd = new BufferedReader(
					new InputStreamReader(
							conn.getInputStream()));
			){
				String line ;
				while((line=bd.readLine())!=null){
					result +="\n"+line;
				}
			}
			
		}catch(Exception e){
			System.out.println("����Get�����쳣��");
		}
		return result;
	}
	/**
	 * ��ָ��URL����POST����������
	 * @param url ���������URL
	 * @param param �����������ʽӦ������name1=value1&name2=value2����ʽ��
	 * @return URL������Զ����Դ����Ӧ
	 */	
	public static String sendPost(String url , String param)
	{
		String result = "";
		
		return result;
	}
	// �ṩ�����������Է���GET�����POST����
	public static void main(String args[])
	{
		// ����GET����
		String s = URLTest.sendGet("http://www.xjtucc.cn", null);
		System.out.println(s);
		// ����POST����
		//String s1 = URLTest.sendPost("http://localhost:8080/HelloWorld/login.jsp"
		//	, "userName=lilei&userPwd=123456");
		//System.out.println(s1);
	}
}
