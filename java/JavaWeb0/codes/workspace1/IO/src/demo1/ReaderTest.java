package demo1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
//�����ı�����Ҫ��Reader Writer��
public class ReaderTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader input=null;//��������ʹ�ã�
		//��������ָ��һ���ļ���
		//�Գ�����˵input��Ҳ���Ǵ��ļ���ȡ���ݣ�
		try {//"d://poem.txt"����·�� "src/demo1/InputStreamTest.java"���·����
			input = new FileReader("code.txt");
			
			int readNum;//���ļ��ж��˶����ַ���
			//ˮ������Ҩˮ�����ļ�poem��Ҩˮ����ˮ�������ݣ�
			char[] bottle = new char[12];//ˮ����С1024�ַ���
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
