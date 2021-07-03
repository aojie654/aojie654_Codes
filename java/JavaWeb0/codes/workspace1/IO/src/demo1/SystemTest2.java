package demo1;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
//�Ӽ������뵽�ĵ��У� ͨ���޸�Ĭ�ϵ����������ɵģ� System.in ���̣� System.out ����̨��
public class SystemTest2 {
	//�ı�ϵͳĬ�����������������洢��console.txt�ļ��У�ÿ������һ�м����ַ������洢��
	public static void main(String[] args) {
		// �����������ֽ��� System.in��ϵͳĬ�������������Ǽ�������������ø��ģ�
		//ת���������ֽ���ת�����ַ�����ע�⣡û�н��ַ���ת�����ֽ������࣡
		InputStreamReader reader =new  InputStreamReader(System.in);//System.in�������뱾�����ַ����룡
		//reader���ַ��� ����������װ�������˻�������װ
		BufferedReader br = new BufferedReader(reader);//��������װ���������������װ��������в�ҪŪ�죡
		String line=null;
		try {
			//�޸�Ĭ�ϵ��������sysout�����console.txt�ĵ��У�
			System.setOut(new PrintStream(new FileOutputStream("console.txt")));
			while((line=br.readLine())!=null){
				if(line.equals("exit")){
					System.exit(1);
				}
				System.out.println(line);//��line��ӡ���ĵ��У�
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				reader.close();//�ر��ȴ򿪵���
				br.close();//�ڹرպ�򿪵�����
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
