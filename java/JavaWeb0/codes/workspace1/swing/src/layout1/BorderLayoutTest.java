package layout1;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import container.PanelTest;

public class BorderLayoutTest {

	private JFrame frame;//����
	private JPanel panel;//�����뱻�������м����������Է��ø��������
	
	public BorderLayoutTest(){
		frame = new JFrame("boderlayout����");
		frame.setSize(500, 300);//�������ô�С����500����300
		frame.setLocation(200, 100);// ������x ,y 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Ĭ�ϵ�رպ��˳�����
		//��ʼ��ui�����Ժ���������չʾ��
		
		//��frame�з���panel panel���Էŵ����������С�������һ����Frame��
		panel = new JPanel();
		//����
		BorderLayout blayout = new BorderLayout();
		panel.setLayout(blayout);//���ò��ֹ�������
		
		JPanel jp1 = new JPanel();
		jp1.add(new JButton("��ť6"));
		jp1.add(new JButton("��ť7"));
		jp1.add(new JButton("��ť8"));
		jp1.add(new JButton("��ť9"));
		jp1.add(new JButton("��ť10"));
		jp1.add(new JButton("��ť11"));
		jp1.add(new JButton("��ť12"));
		
		//������з����������ť
		
		panel.add(new JButton("��ť1"),BorderLayout.NORTH);
		panel.add(new JButton("��ť2"),BorderLayout.EAST);
		panel.add(new JButton("��ť3"),BorderLayout.WEST);
		panel.add(jp1,BorderLayout.CENTER);
		panel.add(new JButton("��ť5"),BorderLayout.SOUTH);
		 
		//�����ŵ�frame��
		frame.add(panel);
		
		//չʾ���ڣ�
		frame.setVisible(true);//�ô��ڿɼ���
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BorderLayoutTest();
	}


}
