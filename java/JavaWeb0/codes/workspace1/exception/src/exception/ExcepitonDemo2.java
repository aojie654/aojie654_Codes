package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExcepitonDemo2 {
	// ����A�࣬������������menthoda��menthodb��a���׳�����ʱ�쳣��b���׳�������ʱ�쳣��
	// ����B�࣬��menthod�����е���A�������������ֱ�����쳣���񣬴����׳��쳣��
	// ����C�࣬���������У�����B���method�������������쳣�����׳���

	//throws���������׳�����쳣��֮���ö��ŷָ���
	public static void method () throws FileNotFoundException,ClassCastException{
		try {
			FileReader f = new FileReader("a");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("�ļ�a�Ҳ������쳣��method�������񣬲��׳���");
			throw e;//�ӳ��쳣��
		}
	}
	public static void methodb () {
		try {
			method();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("����method�ܳ����쳣��");
			//throw e;
		}
	}
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		methodb();
		System.out.println("����������go on��");
	}

}
