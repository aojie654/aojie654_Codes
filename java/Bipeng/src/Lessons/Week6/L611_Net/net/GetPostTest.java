package Lessons.Week6.L611_Net.net;


import java.net.*;


public class GetPostTest
{
	/**
	 * 向指定URL发送GET方法的请求
	 * @param url 发送请求的URL
	 * @param param 请求参数，格式满足name1=value1&name2=value2的形式。
	 * @return URL所代表远程资源的响应
	 */
	public static String sendGet(String url , String param) 
	{
		String result = "";
		String urlName = url + "?" + param;
		try
		{
			URL realUrl = new URL(urlName);
			// 打开和URL之间的连接
			URLConnection conn = realUrl.openConnection();
			// 设置通用的请求属性
			conn.setRequestProperty("accept", "*/*"); 
			conn.setRequestProperty("connection", "Keep-Alive"); 
			conn.setRequestProperty("user-agent"
				, "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)"); 
		}catch(Exception e){
		  System.out.println("get请求异常！");
		}
		return "";
	}
	/**
	 * 向指定URL发送POST方法的请求
	 * @param url 发送请求的URL
	 * @param param 请求参数，格式应该满足name1=value1&name2=value2的形式。
	 * @return URL所代表远程资源的响应
	 */	
	public static String sendPost(String url , String param)
	{
		String result = "";
		
		return result;
	}
	// 提供主方法，测试发送GET请求和POST请求
	public static void main(String args[])
	{
		// 发送GET请求
		//String s = GetPostTest.sendGet("http://localhost:8080/HelloWorld/", null);
		//System.out.println(s);
		// 发送POST请求
		String s1 = GetPostTest.sendPost("http://localhost:8080/HelloWorld/login.jsp"
			, "userName=lilei&userPwd=123456");
		System.out.println(s1);
	}
}
