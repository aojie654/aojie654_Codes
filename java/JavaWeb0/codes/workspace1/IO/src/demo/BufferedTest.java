package demo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class BufferedTest {

	public static void main(String[] args) {
		
		//ʹ��bufferedЧ�ʸ��ߣ�����IO���ʴ�����
		BufferedInputStream bi=null;
		InputStream input = null;
		try {//"src//demo//InputStreamTest.java"
			input = new FileInputStream("poem.txt");//���·��������
			//��������װ �ڵ������������� bi�Ǵ��������������ֽ�����
			bi = new BufferedInputStream(input);
			//ͨ���㿴����bi�ĳ�ʼ�����£�
			//bi = new BufferedInputStream(new FileInputStream("poem.txt"));
			
			bi.mark(0);//��������ָ���λ�á�
			bi.reset();//������ָ��ָ��mark�ĳ�ʼλ�ã�
	
			int readNum=0;//�������ݵ�������
			byte [] bottle = new byte[1024];//���ݷŵ�ˮ���
			//ʹ��input������poem.txt�ж����ݣ�
			//�����ܶ�Ķ����ݡ������ݷŵ�bottle�С�
			//���˶������ݷ��ظ�readNum��������֪��bottle�ж������ݣ�	
			while((readNum=bi.read(bottle))>0){
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
				input.close();//�ر�input��������Դ�� �ȹ��ȴ򿪵ġ�
				bi.close();//��غ�򿪵ġ�
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
				
	}

}
