package event1;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CopyOfKeyMove {
	JPanel p;
	JButton btn;
	JFrame f;
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
				} else if (key == KeyEvent.VK_LEFT) {
					// ���ң�x���������
					btn.setLocation(x - 5, y);
				} 
			}
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub	
			}
		}
	//���캯��û�з���ֵ����������һ����
	public CopyOfKeyMove(){
		//�����ƶ���button
		btn = new JButton("С��");
		//---------------------------------------------------------------
		btn.addKeyListener(new MoveCar());//����ťbtnע����MoveCar������
		//--------------------------------------------------------------
		p = new JPanel();
		f = new JFrame("�ƶ�С��");
		p.setLayout(new FlowLayout(FlowLayout.LEFT));
		p.add(btn);
		f.add(p);	
		f.setSize(500,600);
		f.setLocation(300,300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}	
	public static void main(String[] args){
		new CopyOfKeyMove();
	}
	
}

