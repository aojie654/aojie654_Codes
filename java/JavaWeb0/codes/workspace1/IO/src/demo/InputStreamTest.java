package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {
	//��poem.txt�ļ��������������̨��
	public static void main(String[] args) {
		//ָ��һ���ļ�
		InputStream input = null;
		try {//"src//demo//InputStreamTest.java"
			input = new FileInputStream("poem.txt");//���·��������
			int readNum=0;//�������ݵ�������
			byte [] bottle = new byte[1024];//���ݷŵ�ˮ���
			//ʹ��input������poem.txt�ж����ݣ�
			//�����ܶ�Ķ����ݡ������ݷŵ�bottle�С�
			//���˶������ݷ��ظ�readNum��������֪��bottle�ж������ݣ�
			while((readNum=input.read(bottle))>0){
			//Ҫ�Ѹ��е�ˮ��ҡ�������Ǿ�Ҫһưһư��ͣ��ҡ��֪��ҡ�ꡣ
			System.out.println("readNum"+readNum);
			System.out.println(new String(bottle,0,readNum));
			}//poem �ĵ���1024+1024+83���ֽڣ�
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
