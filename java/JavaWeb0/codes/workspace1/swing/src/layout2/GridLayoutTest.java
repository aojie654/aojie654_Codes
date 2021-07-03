package layout2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GridLayoutTest {
	//����
	private JFrame frame;
	//panle���
	private JPanel panel;
	//���캯���й��촰�ڣ�
	public GridLayoutTest(){
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
		panel.setLayout(new GridLayout(3,2,15,15));//ʹ��BorderLayout���ֹ�����
		
		JButton b1 =new JButton("��");
		b1.addActionListener(new ButtonListener());
		panel.add(b1);
		panel.add(new JButton("��"));
		panel.add(new JButton("��"));//Ĭ����BorderLayout.CENTER
		panel.add(new JButton("��"));
		panel.add(new JButton("��"));
		panel.add(new JButton("��"));
		
		//��panel�ŵ�frame��
		frame.add(panel);

		
		//------------------------------------------------------��ʾ����
		frame.setVisible(true);			
		
	}
	class ButtonListener implements ActionListener {
		// ��дActionListener�ӿ��е��¼�������actionPerformed()
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "����ţ�� ", "�� ", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	public static void main(String[] args){
		new GridLayoutTest();//��ʾ����
	}
	
}
