package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo3 {

	//1�˽⸴ϰ�����쳣
	//2ѧϰ���catch���ʹ�á�
	public static void main(String[] args){
		try{//jre 1.7
			//1 �����쳣 ����ʱ�쳣��
			int a=0,b=1,c=0;
			//c=b/a;
			//2 ����ת���쳣��
			int num = Integer.parseInt("abc");
		}catch(NumberFormatException |ArithmeticException e){
			System.out.println("���������g������������ת���쳣��");
			boolean result=e instanceof ArithmeticException;
			if(result){
				System.out.println(e+"��һ�����g������");
			}else{
				System.out.println(e+"��һ�������D�Q������");
			}
		}
		try{
			//3 ��ָ���쳣��
			String str= null;
			str.charAt(0);
			//4 ����Խ���쳣��
			String[] strs =new String[3];
			//strs[3]="abc";
			//5 ������쳣��
			Class.forName("java.lang.Object");
			//6 �ļ��Ҳ����쳣 
			FileReader f = new FileReader("a");
		}catch(ClassNotFoundException e){
			System.out.println("��������δ�����쳣��");
		}catch(FileNotFoundException e){
			System.out.println("�������ļ�δ�ҵ��쳣��");
		}catch(NullPointerException e){
			System.out.println("�����˿�ָ���쳣��");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("����������Խ���쳣��");
		}catch(RuntimeException e){//Exception ���������������ʱ�쳣�ͷ�����ʱ�쳣�����ᱻ����
			System.out.println("�����������������������쳣��");
		}//Խ�����Խ����š�ԽС�������쳣���ͣ���ǰ�š�
		
		System.out.println("�������������У�");
	}
}
