package demo1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
//��ҵ����poem.txt�е�ʫcopy��poem2.txt�У�
public class WriterTest {

	public static void main(String[] args) {
		Writer writer =null;
		//������������writePoem.txt
		try {//���û��wirtePoem.txt��ϵͳ���Զ�����һ����
			writer = new FileWriter("writePoem.txt");
			
			writer.write("Ϊ��дһ��ʫ\n");
			writer.write("һ�׼򵥵�ʫ\n");
			writer.write("javaѧϰҪŬ��\n");
			writer.write("ÿ��һ��С����\n");
			writer.write("��н�������Σ�\n");
			writer.write("����Ŭ����Ŭ����\n");
			writer.flush();//��һ�£�������д���ĵ���
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				writer.close();//�ر�ʱ�������ݻ�����ˢ�¹�����
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
