package layout2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class DemoTest {
	//����
	private JFrame frame;
	//panle���
	private JPanel p1;
	//���캯���й��촰�ڣ�
	public DemoTest(){
		//ѧϰ��γ�ʼ��һ�����ڣ�
		//1���캯��
		frame = new JFrame("�ҵ�С����");
		//2 ���ô�С
		frame.setSize(500,400);//���ַ�ʽ�����ԡ���300����400
        //������ʾ�ĳ�ʼλ��
		frame.setLocation(200, 100);//x,y 
		//ʹ��Ĭ���˳���Ϊ
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//-----------------------------------------------------frame
		
		//��ʼ��panel Ĭ�ϲ�����ʽFlow
		p1 = new JPanel();//������ʾ��д�����ˣ�
		Border emptyBorder =BorderFactory.createEmptyBorder(10, 10, 10, 10);
		Border llineBorder = BorderFactory.createLineBorder(Color.red);  
		Border etchedBorder = BorderFactory.createEtchedBorder();  
		Border raisedBorder = BorderFactory.createRaisedBevelBorder(); 
		
		p1.setBorder(emptyBorder);
		
		p1.setLayout(new GridLayout(2,2,20,20));
		//p2�����м�
		JPanel p2 =new JPanel(new GridLayout(2,3,10,10));//p2ʹ��Grid����
		p2.add(new JButton("��"));
		p2.add(new JButton("��"));
		p2.add(new JButton("��"));
		p2.add(new JButton("��"));
		p2.add(new JButton("��"));
		p2.add(new JButton("��"));
		p1.add(p2);
		
		//p3��������
		JPanel p3 =new JPanel();//Ĭ�Ͼ���Flow����
		p3.add(new JLabel("bipeng"));
		p3.add(new JTextField(25));
		p3.add(new JLabel("java"));
		p1.add(p3);
		
		JPanel p4 =new JPanel();
		JLabel name =new JLabel("bipeng");
		JTextField text = new JTextField(30);
		JButton send =new JButton("����");
		p4.add(name);
		p4.add(text);
		p4.add(send);
		p1.add(p4);
		
		//p5�����·���
		JPanel p5 =new JPanel();
		p5.setLayout(null);
		JButton b1 =new JButton("bipeng");
		// ����setBounds()���ð�ť������ʹ�С
		b1.setBounds(20, 20, 100, 25);
		p5.add(b1);
		p1.add(p5);
		frame.add(p1);
		
		//���ʹ��borderlayout���֡���ônull����ֻ������center�С�����λ�ò����á�
		
		//------------------------------------------------------��ʾ����
		frame.setVisible(true);			
		
	}
	public static void main(String[] args){
		new DemoTest();//��ʾ����
	}
}
