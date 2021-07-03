package demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyPicTest {

	public static void main(String[] args) {
		//��������������������
		BufferedInputStream input = null;
		BufferedOutputStream output=null;//1
		try {//"src//demo//InputStreamTest.java"
			//��ʼ���������� ��������װ��ͨ����ʵ�ֻ��壡
			input =new BufferedInputStream( new FileInputStream("123.jpg"));//���·��������
			//��ʼ�����������������װ��ͨ����ʵ�ֻ��壡
			output =new BufferedOutputStream( new FileOutputStream("copy.jpg"));//2
			int readNum=0;//�������ݵ�������
			byte [] bottle = new byte[1024];//���ݷŵ�ˮ���
			//ʹ��input������poem.txt�ж����ݣ�
			//�����ܶ�Ķ����ݡ������ݷŵ�bottle�С�
			//���˶������ݷ��ظ�readNum��������֪��bottle�ж������ݣ�
			while((readNum=input.read(bottle))>0){
			//Ҫ�Ѹ��е�ˮ��ҡ�������Ǿ�Ҫһưһư��ͣ��ҡ��֪��ҡ�ꡣ
			System.out.println("readNum"+readNum);
			System.out.println(new String(bottle,0,readNum));
			output.write(bottle, 0, readNum);//3    ��bottle�е����������output�У�
			output.flush();//��һ�»����������򵱻��������˲�flush����ر�ǰ��flush
			}//poem �ĵ���1024+1024+83���ֽڣ�
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				input.close();//�ر�input��������Դ��
				output.close();//4        �ر�output�������
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
