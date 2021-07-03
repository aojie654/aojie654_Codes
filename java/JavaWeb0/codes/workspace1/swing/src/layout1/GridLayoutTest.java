package layout1;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import container.PanelTest;

public class GridLayoutTest {

	private JFrame frame;//����
	private JPanel panel;//�����뱻�������м����������Է��ø��������
	private JButton btn1;
	public GridLayoutTest(){
		
		//��ʼ��ui�����Ժ���������չʾ��
		btn1 = new JButton("1");
		//��frame�з���panel panle����ŵ���������У������м����������ܶ������ڣ�
		panel = new JPanel();
		//���񲼾�
		GridLayout glayout = new GridLayout(3,3);//3�У�2��
		panel.setLayout(glayout);//���ò��ֹ�����������panelʹ��Ĭ��flow����
		
		//������з����������ť ��
		panel.add(btn1);
		panel.add(new JButton("��ť2"));
		panel.add(new JButton("��ť3"));
		panel.add(new JButton("��ť4"));
		panel.add(new JButton("��ť5"));
		panel.add(new JButton("��ť6"));
		panel.add(new JButton("��ť7"));

		
		frame = new JFrame("boderlayout����");
		frame.setSize(500, 300);//�������ô�С����500����300
		frame.setLocation(200, 100);// ������x ,y 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Ĭ�ϵ�رպ��˳�����
		//�����ŵ�frame��
		frame.add(panel);
		
		//չʾ���ڣ�
		frame.setVisible(true);//�ô��ڿɼ���
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutTest();
	}


}
