package demo;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("a�����ڣ����Բ����ҵ���");
			FileReader f =new FileReader("a");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("e�쳣���󱻲����ˣ���ӡ��Ϣ");
			e.printStackTrace();
		}
		System.out.println("����������У�");
	}

}
