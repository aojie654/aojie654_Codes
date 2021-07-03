package net1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class URLTest {
	/**html form get  http://www.baidu.com?name1=value1&name2=value2
	 * ��ָ��URL����GET����������
	 * @param url ���������URL
	 * @param param �����������ʽ����name1=value1&name2=value2����ʽ��
	 * @return URL������Զ����Դ����Ӧ
	 */
	public static String sendGet(String url , String param) 
	{
		StringBuffer result = new StringBuffer();
		String urlName = url + "?" + param;
		try
		{
			URL realUrl = new URL(urlName);
			// �򿪺�URL֮������� ��url��ַ�����������ӣ�
			URLConnection conn = realUrl.openConnection();
			// ����ͨ�õ��������� http����ͷ�������ã�
			conn.setRequestProperty("accept", "*/*"); 
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("Charset", "utf-8");
			conn.setRequestProperty("user-agent"
				, "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)"); 
			
			//������������
			conn.connect();
			//�����Ӧͷ����ӡ��Ӧͷ��Ϣ��
			Map<String,List<String>> map=conn.getHeaderFields();
			for(String key:map.keySet()){
				System.out.println(key+"--->"+map.get(key));
			}
			//�õ�������  
			//try(){} ���÷��У����п��Զ����ʼ����Դ����ʡ��finally�е�close��
			try(InputStream input=conn.getInputStream();
					BufferedReader br = new BufferedReader(
					new InputStreamReader(input)))
				{		
					//ѭ��ȡ���ݣ�
					String line;
					while((line=br.readLine())!=null){
						result.append("\n"+line);
						//result + = "\n"+line;
					}
				}
		}catch(Exception e){
		  System.out.println("get�����쳣��");
		}
		return result.toString();
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
		String s1 = URLTest.sendPost("http://localhost:8080/HelloWorld/login.jsp"
			, "userName=lilei&userPwd=123456");
		System.out.println(s1);
	}
}
