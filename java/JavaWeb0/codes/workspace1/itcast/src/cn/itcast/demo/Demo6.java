package cn.itcast.demo;

import java.util.Random;

public class Demo6 {

	public static void main(String[] args) {
		/*
		 * ����һ����֤�� �� 4λ  ��д��ĸ Сд��ĸ ����
		 * 1,����һ���ַ����������еĴ�д��ĸ Сд��ĸ ����
		 * 2.����һ������Ǳ�
		 * 3.��ȡ4���ַ�
		 * 
		 */
		//1.׼������Դ
		String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		//2.��������Ǳ�
		Random ran = new Random();
		for (int i = 0; i < 4; i++) {
			int index = ran.nextInt(str.length() - 1);
			//3.��ȡ�ַ�
			char ch = str.charAt(index);
			System.out.print(ch);
		}
		
	}
}
