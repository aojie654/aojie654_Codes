package homework;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class A {
	//����A�࣬������������menthoda��menthodb��a���׳�����ʱ�쳣��b���׳�������ʱ�쳣��
	public void methodA()throws ArithmeticException{
		try{
		int a=0,b=1;
		int c=b/a;
		}catch(ArithmeticException e){
			System.out.println("methoda �������쳣��");
			throw e;
		}
	}
	
	public void methodB() throws FileNotFoundException {
		
		
		try {
			FileReader f = new FileReader("a");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("mehtodb�׳��˷�����ʱ�쳣��");
			//e.printStackTrace();
			throw e;
		}
	}

}
