package homework1;

import java.io.FileNotFoundException;

public class B {
	// ����B�࣬��menthod�����е���A�������������ֱ�����쳣���񣬴����׳��쳣��
	public void method() throws ArithmeticException,FileNotFoundException{
		A a = new A();
		try {
			a.methodA();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("B�ಶ����A��mehtodA�����������쳣��");
			//throw e;
		}
		try {
			a.methodB();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("B�ಶ����A��mehtodb�������ļ�δ�ҵ��쳣��");
			throw e;
		}
		
	}
}
