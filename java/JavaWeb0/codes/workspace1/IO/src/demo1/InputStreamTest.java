package demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream input=null;//��������ʹ�ã�
		//��������ָ��һ���ļ���
		//�Գ�����˵input��Ҳ���Ǵ��ļ���ȡ���ݣ�
		try {//"d://poem.txt"����·�� "src/demo1/InputStreamTest.java"���·����
			input = new FileInputStream("code.txt");
			
			int readNum;//���ļ��ж��˶����ֽڣ�
			//ˮ������Ҩˮ�����ļ�poem��Ҩˮ����ˮ�������ݣ�
			byte[] bottle = new byte[12];//ˮ����С1024�ֽ�
			//��������ȡ���ݡ�read������
			while((readNum=input.read(bottle))>0){//�׳�IO�쳣��������ʱ�쳣����Ҫ����
				//readNum>0˵���������ݣ�1024+481�ֽڣ�
				System.out.println("readNum:"+readNum);
				System.out.println(new String(bottle,0,readNum));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//������ζ�Ҫ�ر�ˮ��ͷ��
			try {
				input.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
