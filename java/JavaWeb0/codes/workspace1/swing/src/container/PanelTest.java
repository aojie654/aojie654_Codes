package container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelTest {

	private JFrame frame;//����
	private JPanel panel;//�����뱻�������м����������Է��ø��������
	
	public PanelTest(){
		frame = new JFrame("С����");
		frame.setSize(500, 300);//�������ô�С����500����300
		frame.setLocation(200, 100);// ������x ,y 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Ĭ�ϵ�رպ��˳�����
		//��ʼ��ui�����Ժ���������չʾ��
		
		//��frame�з���panel
		panel = new JPanel();

		//������з����������ť
		panel.add(new JButton("��ť1"));
		panel.add(new JButton("��ť2"));
		panel.add(new JButton("��ť3"));
		
		for(int i=0;i<=100;i++){
			panel.add(new JButton("button"+i));
		}
		
		//�����ŵ�frame��
		frame.add(panel);
		
		//չʾ���ڣ�
		frame.setVisible(true);//�ô��ڿɼ���
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PanelTest();
	}

}
