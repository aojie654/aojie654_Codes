package layout2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutTest {
	//����
	private JFrame frame;
	//panle���
	private JPanel panel;
	//���캯���й��촰�ڣ�
	public BorderLayoutTest(){
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
		//��ʼ��panel Ĭ�ϲ�����ʽFlow
		panel = new JPanel();//������ʾ��д�����ˣ�
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.setLayout(new BorderLayout(10,10));//ʹ��BorderLayout���ֹ�����
		//panel.add(new JButton("��"),BorderLayout.EAST);
		panel.add(new JButton("��"),BorderLayout.WEST);
		panel.add(new JButton("��"));//Ĭ����BorderLayout.CENTER
		panel.add(new JButton("��"),BorderLayout.SOUTH);
		panel.add(new JButton("��"),BorderLayout.NORTH);
		
		//��panel�ŵ�frame��
		frame.add(panel);

		
		//------------------------------------------------------��ʾ����
		frame.setVisible(true);			
		
	}
	public static void main(String[] args){
		new BorderLayoutTest();//��ʾ����
	}
	
}
