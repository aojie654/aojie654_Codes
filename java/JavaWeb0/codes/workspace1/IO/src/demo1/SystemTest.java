package demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
//ʹ��Scanner�ࡣ�ر��ã�һ��ʹ��Scanner��ȡ�������룡
public class SystemTest {
	//ʹ��scanner�࣬�޸�Ĭ�ϵ�ϵͳ��������������copy��
	public static void main(String[] args) {
		Scanner scanner =null;
		try {
			//�޸�system.in �޸ĵ���ͨ�ĵ��С�
			//InputStream input = System.in;
			System.setIn(new FileInputStream("poem.txt"));
			//System.setIn(input);
			scanner = new Scanner(System.in);//scanner������Դӿ���̨ȡ�õ����ݣ�
			String line=null;
			//�޸�Ĭ�ϵ��������sysout�����console.txt�ĵ��У�
			System.setOut(new PrintStream(new FileOutputStream("console.txt")));
			while(scanner.hasNextLine()){ 
				line =scanner.nextLine();
				System.out.println(line);//��line��ӡ���ĵ��У�
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			scanner.close();//�ڹرպ�򿪵�����
		}
	}
}
