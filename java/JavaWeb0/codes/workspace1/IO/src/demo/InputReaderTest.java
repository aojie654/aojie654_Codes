package demo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class InputReaderTest {

	public static void main(String[] args) {
		InputStreamReader reader = null;
		BufferedReader br =null;
		try {
			//��Ĭ������ĵ��ĵ��У�
			System.setIn(new FileInputStream("poem.txt"));
			//ת������װ�ͼ���  ��system.in�ֹ����D�Q�����ַ�����
			reader = new InputStreamReader(System.in);//System.in ���̣�
			br = new BufferedReader(reader);//�ٴΰ�װ�ַ���reader ��ɴ�������ַ�����
			String line=null;
			//������̨����ĵ�һ���ĵ��У�
			System.setOut(new PrintStream(new FileOutputStream("console.txt")));
			while((line=br.readLine())!=null){//ʹ�� readline���������㣡
				System.out.println(line);
				if(line.equals("exit")){
					System.exit(1);//������exitʱ�����������
				}
			}
		}catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				reader.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
