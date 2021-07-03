package event1;

import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
// mouse ������Ӧ��
public class KeyMove {
	JPanel p;
	JButton btn;
	JFrame f;
	JTextArea ta;
	//MoveCarд�� KeyMove���С��Ǹ��ڲ��ࡣʵ�ֶ�keyListener�ļ��� 
	class MoveCar implements KeyListener{
		@Override
		public void keyTyped(KeyEvent e) {
			
		}
		@Override
		public void keyPressed(KeyEvent e) {
			// ��ȡ���¼��̵���ֵ		
			int key = e.getKeyCode();
			// ��ð�ť��ǰ��x,y������
			int x = btn.getX();
			int y = btn.getY();
			
			if (key == KeyEvent.VK_RIGHT) {
				// ���ң�x����������
				btn.setLocation(x + 5, y);
				ta.setText(ta.getText()+"1");
			} else if (key == KeyEvent.VK_LEFT) {
				// ���ң�x���������
				btn.setLocation(x - 5, y);
				ta.setText(ta.getText()+"2");
			} else if (key == KeyEvent.VK_UP) {
				// ���ң�x���������
				btn.setLocation(x, y-5);
				ta.setText(ta.getText()+"3");
			} else if (key == KeyEvent.VK_DOWN) {
				// ���ң�x���������
				btn.setLocation(x, y+5);
				ta.setText(ta.getText()+"4");
			} 
		}
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub	
		}
	}
	//���캯��û�з���ֵ����������һ����
	public KeyMove(){
		//�����ƶ���button
		ta = new JTextArea(5,20);
		
		btn = new JButton("С��");
		JPanel p2 = new JPanel(null);//�ĳ�null���֣�
		//---------------------------------------------------------------
		btn.addKeyListener(new MoveCar());//����ťbtnע����MoveCar������
		btn.setLocation(100,30 );
		btn.setSize(60, 30);
		//btn.setBounds(x, y, width, height);
		//--------------------------------------------------------------
		p = new JPanel();
		f = new JFrame("�ƶ�С��");
		p.setLayout(new GridLayout(2,1));//����1��
		
		p2.add(btn);
		p.add(p2);//��һ��һ��
		p.add(ta);//�ڶ��е�һ��
		f.add(p);	
		f.setSize(500,600);
		f.setLocation(300,300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}	
	public static void main(String[] args){
		new KeyMove();
	}
	
}