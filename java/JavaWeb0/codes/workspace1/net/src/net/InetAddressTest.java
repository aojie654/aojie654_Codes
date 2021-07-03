package net;

import java.io.IOException;
import java.net.InetAddress;

public class InetAddressTest {

	public static void main(String[] args) throws IOException {
		//InetAddress û���캯����IP�󶨵ġ�
		InetAddress ipnet=InetAddress.getByName("www.163.com");
		boolean bool=ipnet.isReachable(2000);
		System.out.println("���� �Ƿ�ɴ�:"+bool);
		System.out.println(ipnet.getHostName());
		System.out.println(ipnet.getHostAddress());
		
		InetAddress local =InetAddress.getLocalHost();
		System.out.println("local �Ƿ�ɴ"+local.isReachable(2000));
		System.out.println(local.getHostName());
		System.out.println(local.getHostAddress());
		
	}

}
