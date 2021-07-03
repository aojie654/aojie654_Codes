package demo1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class BufferedTest {
	//ʹ��InputStreamʵ�ֶ�ͼƬ�Ŀ��������������ļ������ԣ�
	public static void main(String[] args) {
		// �������������
		BufferedInputStream buffer = null;
		//��BufferedOutputStream�Ƚϣ�����println������������ʵ�ָ�ʽ�����
		PrintStream  ps=null;
		try {//��������Ҫ��װ�ڵ�����ʹ�ô�����ȥ����������������io������
			buffer = new BufferedInputStream(new FileInputStream("123.jpg"));
			//ps ��������װ�˽ڵ�����
			ps = new PrintStream(new FileOutputStream("copy123.jpg"));
			byte[] bottle = new byte[1024];//ÿ��copy1024�ֽڣ�
			int readNum=0;
			while((readNum=buffer.read(bottle))>0){
				//ʹ��print������Ҳ����ѡ��write������
				ps.write(bottle, 0, readNum);
				ps.flush();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				buffer.close();
				ps.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
