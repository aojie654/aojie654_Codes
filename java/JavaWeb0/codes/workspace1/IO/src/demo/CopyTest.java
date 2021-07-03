package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyTest {

	public static void main(String[] args) {
		//ָ��һ���ļ�
		InputStream input = null;
		OutputStream output=null;
		try {//"src//demo//InputStreamTest.java"
			//��ʼ����������
			input = new FileInputStream("poem.txt");//���·��������
			//��ʼ���������
			output = new FileOutputStream("poem1.txt");//���·��������
			int readNum=0;//�������ݵ�������
			byte [] bottle = new byte[1024];//���ݷŵ�ˮ���
			//ʹ��input������poem.txt�ж����ݣ�
			//�����ܶ�Ķ����ݡ������ݷŵ�bottle�С�
			//���˶������ݷ��ظ�readNum��������֪��bottle�ж������ݣ�
			while((readNum=input.read(bottle))>0){
			//Ҫ�Ѹ��е�ˮ��ҡ�������Ǿ�Ҫһưһư��ͣ��ҡ��֪��ҡ�ꡣ
			System.out.println("readNum"+readNum);
			System.out.println(new String(bottle,0,readNum));
			output.write(bottle, 0, readNum);//��bottle�е����������output�У�
			}//poem �ĵ���1024+1024+83���ֽڣ�
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				input.close();//�ر�input��������Դ��
				output.close();//�ر�output�������
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
