package demo;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo3 {
	public static void methodA() throws FileNotFoundException{
		try {
			FileReader f = new FileReader("a");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("�����׳���fileNotfound�쳣��");
			throw e;
		}
	}
	//��������ʱ�쳣����ѡ�񲻴���
	public static void methodB()throws ArithmeticException{
		try {
			methodA();//methodA�п����׳�������ʱ�쳣��Ҫ����õķ������봦��
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("����methodA�׳���fileNotfound�쳣��");
			e.printStackTrace();
		}
	}
	public static void main(String[] args){
		//�����쳣�ķ�ʽ2�֣������ж��ֱ��ε���ϣ��ɳ���Ա����
		methodB();//�����methodB�������׳��ķ�����ʱ�쳣���д���
		try {
			methodA();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("����������methodA�쳣����Ҫ��throw e�ˡ������쳣�׸�jvm�������ͣ�ˣ�");
		}
		System.out.println("����������У�");
	}
}
