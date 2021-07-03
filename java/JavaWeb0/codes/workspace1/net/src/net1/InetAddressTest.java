package net1;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

	public static void main(String[] args) {
		//InetAddressû�й��캯��
		//www.163.com
		try {
			InetAddress inet = InetAddress.getByName("www.163.com");
			boolean bool = inet.isReachable(2000);//�Ƿ��ܷ��ʸ�������
			System.out.println("baidu �Ƿ񵽴"+bool);
			System.out.println(inet.getHostAddress());
			//System.out.println(inet.getCanonicalHostName());
			
			InetAddress local =InetAddress.getLocalHost();
			boolean bool2 =local.isSiteLocalAddress();
			System.out.println("local :is site "+bool2);
			System.out.println(local.getHostName());
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
