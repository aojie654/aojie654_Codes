package cn.itcast.demo;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		String checkCode = "3N2q";
		//�û�������Ҫ����֤��һ�£�����ע��ɹ�
		Scanner sc = new Scanner(System.in);
		System.out.println("��������֤�룬3N2q");
		//��ȡ�û��������֤��
		String ck_user = sc.next();
		//ת��ΪСд
		/*checkCode = checkCode.toLowerCase();
		ck_user  = ck_user.toLowerCase();*/
		System.out.println("�û����룺"+ck_user);
		
		//�ȶ��ַ����Ƿ����
		boolean flag = checkCode.equalsIgnoreCase(ck_user);
		if(flag){
			System.out.println("ע��ɹ���");
		}else{
			System.err.println("ע��ʧ�ܣ�");
		}
		
		
		
		
	}
}
