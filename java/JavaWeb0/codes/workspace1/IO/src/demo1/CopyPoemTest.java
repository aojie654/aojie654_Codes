package demo1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
//�����ı�����Ҫ��Reader Writer��
public class CopyPoemTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader reader=null;//��������ʹ�ã�
		Writer writer =null;//�����
		//��������ָ��һ���ļ���
		//�Գ�����˵input��Ҳ���Ǵ��ļ���ȡ���ݣ�
		try {//"d://poem.txt"����·�� "src/demo1/InputStreamTest.java"���·����
			reader = new FileReader("poem.txt");
			//��ʼ��writer
			writer = new FileWriter("poem2.txt");
			int readNum;//���ļ��ж��˶����ַ���
			//ˮ������Ҩˮ�����ļ�poem��Ҩˮ����ˮ�������ݣ�
			char[] bottle = new char[100];//ˮ����С1024�ַ���
			//��������ȡ���ݡ�read������
			while((readNum=reader.read(bottle))>0){//�׳�IO�쳣��������ʱ�쳣����Ҫ����
				//readNum>0˵���������ݣ�1024+481�ֽڣ�
				System.out.println("readNum:"+readNum);
				System.out.println(new String(bottle,0,readNum));
				writer.write(new String(bottle,0,readNum));
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
				reader.close();//�ر���������
				writer.close();//�ر��������
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
