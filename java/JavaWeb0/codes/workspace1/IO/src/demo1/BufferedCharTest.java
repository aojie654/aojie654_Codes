package demo1;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class BufferedCharTest {

	public static void main(String[] args) {
		// �������������
		BufferedReader breader = null;
		//��BufferedOutputStream�Ƚϣ�����println������������ʵ�ָ�ʽ�����
		PrintWriter  pw=null;
		try {//��������Ҫ��װ�ڵ�����ʹ�ô�����ȥ����������������io������
			breader = new BufferedReader(new FileReader("poem.txt"));
			//ps ��������װ�˽ڵ�����
			pw = new PrintWriter(new FileWriter("poem2.txt"));
			/*char[] bottle = new char[1024];
			int readNum=0;
			while((readNum=breader.read(bottle))>0){
				System.out.println(new String(bottle,0,readNum));
				//ʹ��print������Ҳ����ѡ��write������
				pw.print(new String(bottle,0,readNum));
			}*/
			//ʹ��readLine��Լд����
			String line=null;
			while((line=breader.readLine())!=null){
				pw.println(line);//line���������з���ʹ��println������
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				breader.close();
				pw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
