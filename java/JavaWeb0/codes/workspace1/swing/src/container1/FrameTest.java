package container1;

import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JFrame;

public class FrameTest {
	//����
	private JFrame frame;
	
	//���캯���й��촰�ڣ�
	public FrameTest(){
		//ѧϰ��γ�ʼ��һ�����ڣ�
		//1���캯��
		frame = new JFrame("�ҵ�С����");
		//2 ���ô�С
		frame.setSize(new Dimension(300,400));
		frame.setSize(300,400);//���ַ�ʽ�����ԡ���300����400
        //������ʾ�ĳ�ʼλ��
		frame.setLocation(200, 100);//x,y 
		frame.setLocation(new Point(200,100));
		//ʹ��Ĭ���˳���Ϊ
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//��ʾ����
		frame.setVisible(true);		
	}
	public static void main(String[] args){
		new FrameTest();//��ʾ����
	}
	
}
