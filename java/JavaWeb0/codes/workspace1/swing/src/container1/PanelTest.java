package container1;

import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelTest {
	//����
	private JFrame frame;
	//panle���
	private JPanel panel;
	//���캯���й��촰�ڣ�
	public PanelTest(){
		//ѧϰ��γ�ʼ��һ�����ڣ�
		//1���캯��
		frame = new JFrame("�ҵ�С����");
		//2 ���ô�С
		frame.setSize(300,400);//���ַ�ʽ�����ԡ���300����400
        //������ʾ�ĳ�ʼλ��
		frame.setLocation(200, 100);//x,y 
		//ʹ��Ĭ���˳���Ϊ
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//-----------------------------------------------------frame
		//��ʼ��panel
		panel = new JPanel();
		panel.add(new JButton("��"));
		//panel.add(new JButton("��"));
		//panel.add(new JButton("��"));
		//��panel�ŵ�frame��
		frame.add(panel);

		//------------------------------------------------------��ʾ����
		frame.setVisible(true);			
		
	}
	public static void main(String[] args){
		new PanelTest();//��ʾ����
	}
	
}
