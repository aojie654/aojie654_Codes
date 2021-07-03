package layout2;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutTest {
	//����
	private JFrame frame;
	//panle���
	private JPanel panel;
	//���캯���й��촰�ڣ�
	public FlowLayoutTest(){
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
		panel = new JPanel(new FlowLayout(FlowLayout.LEFT,20,20));//������ʾ��д�����ˣ�
		panel.add(new JButton("��"));
		panel.add(new JButton("��"));
		panel.add(new JButton("��"));
		
		for(int i=0;i<=50;i++){
			panel.add(new JButton("button"+i));
		}
		
		//��panel�ŵ�frame��
		frame.add(panel);

		
		//------------------------------------------------------��ʾ����
		frame.setVisible(true);			
		
	}
	public static void main(String[] args){
		new FlowLayoutTest();//��ʾ����
	}
	
}
