package demo;

public class ExceptionDemo {
	//JVM ����main ���쳣�׳���jvm jvm��δ�����ӡ�쳣��ջ��Ϣ��e.printStackTrace();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello everyone!");
		
		System.out.println("lets play basketball!");
		int score =0;
		try{
		//1 Ͷ��1��
		int a=0,b=1;
		int c=b/a;//RuntimeException �ɴ���ɲ�����
	
		//�������һ������ĳ���Ա����Ĵ����ǲ����׳�runtimeexception�ģ����Բ���Ҫһ������
		}catch(ArithmeticException e){//�����쳣��
			System.out.println("Ͷ���ˣ���2��");
			score +=2;
		}finally{
			System.out.println("Ͷ��һ�Σ�");
		}
		
		try{//��һ�Կ��ܻ��׳��쳣��
			//1 Ͷ��2��
			int n= Integer.parseInt("abc");
			
		}catch(NumberFormatException e){//��ס�쳣���ܲ��ܽ�ס���׵��쳣����һ�²ſ��Խ�ס�������쳣��
			System.out.println("Ͷ���ˣ���2��");
			score +=2;
		}finally{//�����Ƿ�����쳣��finally����ִ�С�finally ���Բ�д��
			System.out.println("Ͷ��һ�Σ�");
		}
		
		System.out.println("�ܷ���"+score);
	}

}
