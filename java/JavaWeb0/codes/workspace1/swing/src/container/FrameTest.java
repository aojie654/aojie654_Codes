package container;

import javax.swing.JFrame;

public class FrameTest {

	private JFrame frame;
	
	public FrameTest(){
		frame = new JFrame("С����");
		frame.setSize(500, 300);//�������ô�С����500����300
		frame.setLocation(200, 100);// ������x ,y 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Ĭ�ϵ�رպ��˳�����
		//��ʼ��ui�����Ժ���������չʾ��
		
		frame.setVisible(true);//�ô��ڿɼ���
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FrameTest();
	}

}
