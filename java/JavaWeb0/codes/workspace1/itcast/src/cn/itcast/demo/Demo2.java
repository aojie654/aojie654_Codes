package cn.itcast.demo;

public class Demo2 {

	public static void main(String[] args) {
		//�ڶ��ַ�ʽ
		String str = "Hello hello World !";
		//��һ�ַ�ʽ
		String str2 = new String("Hello hello World !");
		System.out.println(str);
		
		System.out.println(str2);
		
		System.out.println("----------------");
		
		int index = str.indexOf('h');
		System.out.println(index);
		System.out.println("-----------");
		
		int length = str.length();
		System.out.println(length);
		System.out.println("-------------");
		char ch = str.charAt(7);
		System.out.println(ch);
		System.out.println("------------------");
		
		String s = str.toUpperCase();
		System.out.println(s);
		
		/*
		 * ��ӡ�ַ����е�ÿ���ַ�
		 */
		for (int i = 0; i < str.length(); i++) {
			
			System.out.println(str.charAt(i));
		}
	}
}
