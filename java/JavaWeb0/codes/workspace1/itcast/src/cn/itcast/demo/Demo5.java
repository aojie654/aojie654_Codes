package cn.itcast.demo;

import java.util.Random;

public class Demo5 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int se_1 = ran.nextInt(6) + 1;// 1 - 6
		int se_2 = ran.nextInt(6) + 1;// 1 - 6
		
		System.out.println("��һ�����ӵĵ�����"+se_1);
		System.out.println("�ڶ������ӵĵ�����"+se_2);
		int total = se_1 + se_2;
		
		if(total > 7){
			System.out.print("�����ǣ�");
			System.out.println("��");
			System.out.println();
		}else if(total < 7){
			System.out.print("�����ǣ�");
			System.out.println("С");
			System.out.println();
		}else {
			System.out.print("�����ǣ�");
			System.out.println("ɱ");
			System.out.println();
		}
		
		
		
	}
}
