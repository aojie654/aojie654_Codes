package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("hello! boys and girls");
		
		try{//��һ�� ���쳣�������׳�ȥ��
			System.out.println("lets play a game!");
			System.out.println("catch ball! go!");
			int a =0,b=1,c;
			//c=b/a;//�׳���һ���쳣��
			//1 try catch 2 throws
			
			try {
				FileReader f = new FileReader("a");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				//1 �����쳣�����д�����ɲ��ִ�����׳��ñ��˴���
				throw e;
			}	
				
			//�½�һ���ļ���
			System.out.println("����һ��");
			System.out.println("����һ��a ��");
			System.out.println("����һ��b ��");
			System.out.println("����һ��c ��");
			
		}catch(RuntimeException e){//���Խ�ס��������ʱ�쳣������
			e.printStackTrace();//��ӡ��ջ��Ϣ��
			//��ѧ�쳣����һ������ʱ�쳣��
			System.out.println("yes i got your ball��");
			
		}finally{//������Σ�������û�д���Ҫִ�У�
			System.out.println("lets play go on!");
		}
		
		System.out.println("������ĺܿ��ģ��ݰݣ�");
		
	}

}
