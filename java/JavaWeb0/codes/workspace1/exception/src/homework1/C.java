package homework1;

import java.io.FileNotFoundException;

public class C {
	// ����C�࣬���������У�����B���method�������������쳣�����׳���
	//�������׳����쳣���쳣�׸���JVM��JVM���쳣��Ϣ��ӡ�����������
	public static void main(String[] args){
		B b = new B();
		
		try {
			b.method();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("������������B���׳����ļ�δ�ҵ��쳣��");
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("������������B���׳��������쳣��");
		}
		
		System.out.println("�������������У�");
		
	}
}
