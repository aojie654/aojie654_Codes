package demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class BufferedCharTest {

	public static void main(String[] args) {
		//BufferedReader �� BufferedInputStream����������readLine����������һ��һ�еĶ���
		//ʹ��bufferedЧ�ʸ��ߣ�����IO���ʴ�����
		BufferedReader bi=null;
		Reader input = null;
		BufferedWriter writer =null;
		try {//"src//demo//InputStreamTest.java"
			input = new FileReader("poem.txt");//���·��������
			//��������װ �ڵ������������� bi�Ǵ��������������ֽ�����
			bi = new BufferedReader(input);//�߼���BufferedReader��װ�˵ͼ�����������ֻ����������װ��������
			
			//ֻ����������װ���������װ��Ļ��Ǹ������
			//ͨ���㿴����bi�ĳ�ʼ�����£�
			//bi = new BufferedReader(new FileReader("poem.txt"));
			writer = new BufferedWriter(new FileWriter("poem2.txt"));
			String line =null;
			while((line=bi.readLine())!=null){
				System.out.println(line);
				writer.write(line);
				writer.flush();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				input.close();//�ر�input��������Դ�� �ȹ��ȴ򿪵ġ�
				bi.close();//��غ�򿪵ġ�
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
				
	}

}
