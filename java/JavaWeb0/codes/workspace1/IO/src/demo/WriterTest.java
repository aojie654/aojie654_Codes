package demo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterTest {

	public static void main(String[] args){
		Writer writer=null;
		//��ҵ2 ��poem2�еĹ��£�д��write�С��Զ�д��
		try {
			//����ĵ������ڣ�������Ǵ���һ���ļ���
			writer = new FileWriter("write.txt");
			writer.write("ʮ��������ãã����˼������������");
			writer.write("\n");//ʵ�ֻ��У�
			writer.write("ǧ��·أ��޴���������");
			writer.write("\n");
			writer.write("��ʹ���Ӧ��ʶ�������棬����˪��");
			writer.write("\n");
			writer.write("ҹ�����κ����硣С����������ױ��");
			writer.write("\n");
			writer.write("������ԣ�Ω����ǧ�С��ϵ����곦�ϴ�������ҹ�����ɸԡ� ");
			writer.write("\n");
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				writer.close();//ˢ�»�������������д���ĵ���
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
