package demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderTest {

	public static void main(String[] args) {
		//ָ��һ���ļ�
		Reader input = null;
		try {//"src//demo//InputStreamTest.java"
			input = new FileReader("poem2.txt");//���·��������
			int readNum=0;//�������ݵ�������
			//Reader��λ��char�ַ��������������ַ���
			char [] bottle = new char[100];//���ݷŵ�ˮ���
			//ʹ��input������poem.txt�ж����ݣ�
			//�����ܶ�Ķ����ݡ������ݷŵ�bottle�С�
			//���˶������ݷ��ظ�readNum��������֪��bottle�ж������ݣ�
			while((readNum=input.read(bottle))>0){
			//Ҫ�Ѹ��е�ˮ��ҡ�������Ǿ�Ҫһưһư��ͣ��ҡ��֪��ҡ�ꡣ
			System.out.println("readNum"+readNum);
			System.out.println(new String(bottle,0,readNum));
			}//poem2 �ĵ��и�483�ַ���
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				input.close();//�ر�input��������Դ��
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
