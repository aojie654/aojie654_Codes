package demo;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo5 {

	public static void main(String[] args){
		
		//�������쳣�� ͬʱʹ�ö��catch�����쳣��
		try{
		//1����ת���쳣��
			int num = Integer.parseInt("abc");
		//2��ָ���쳣��
			String s = null;
			s.charAt(0);
		//3���޷������쳣�� ������ʱ�쳣��
			Class.forName("java.lang.Object");
		//4�ļ��Ҳ����쳣   ������ʱ�쳣��
			FileReader f = new FileReader("a");
		//5�����쳣��
			int a=0,b=1,c=0;
			c=b/a;
		//6����Խ���쳣��
			String[] strs = new String[3];
			strs[3]="abc";
		}catch(NumberFormatException |NullPointerException e){
			System.out.println("����ת���쳣���� ��ָ�� �쳣��"); 
		}catch(ClassNotFoundException e){
			System.out.println("���޷��ҵ��쳣��");	
		}catch(FileNotFoundException e){
			System.out.println("�ļ�û���ҵ��쳣��");
		}catch(ArithmeticException e){
			System.out.println("�����쳣��");
		}catch(Exception e){//�ܹ����������쳣��Exception������ 
			//Խ����쳣��Խ����ţ� Խ������쳣��Խ��ǰ�ţ�
			System.out.println("����������������ʱ�쳣��");
			System.out.println(e.toString());
		}
		
		System.out.println("������������");
	}
}
