package demo;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo2 {
	//�׸�jvm���к�������                                                       //�����׳��˴��쳣������һ��Ҫ����һ��throw e
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		try{
			System.out.println("a�����ڣ����Բ����ҵ���");
			FileReader f =new FileReader("a");
		}catch(FileNotFoundException e){
			System.out.println("e�������ˣ����д���");
			e.printStackTrace();
			
			//throw e;
			//�׸����õķ������к�������
		}finally{
			System.out.println("�����Ƿ��׳��쳣��finally����ִ���ˣ�");
		}
		System.out.println("����������У�");
	}

}
