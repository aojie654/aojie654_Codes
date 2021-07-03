package event2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MoveColor {

	//Frame Panel Button
	
	JFrame f;
	public JPanel p;
	JButton b1,b2,b3;
	
	//���캯��û�з���ֵ��
	public MoveColor(){
		b1 = new JButton("��ɫ");
		b2 = new JButton("��ɫ");
		b3 = new JButton("��ɫ");
		p = new JPanel();
		f = new JFrame("����");
		p.add(b1);
		p.add(b2);
		p.add(b3);
		f.add(p);
		f.setSize(200, 300);
		f.setLocation(50, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);//��ʼ���ú���ʾ���ڣ�
		//����������ϼ�����
		addListener();
	}
	public static void main(String[] args){
		new MoveColor();
	}
	//���Ӽ�����
	public void addListener(){
		this.b1.addActionListener(new b1Listener() );//��b1ע�������
		this.b2.addActionListener(new b2Listener() );//��b2ע�������
		this.b3.addActionListener(new b3Listener() );//��b3ע�������
		this.b1.addKeyListener(new MoveListener());
		this.b2.addKeyListener(new MoveListener());
		this.b3.addKeyListener(new MoveListener());
	}
	//�ڲ��� �����������ʵ�ֽӿ�
	class b1Listener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		p.setBackground(Color.RED);
	}
	}
	class b2Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			p.setBackground(Color.GREEN);
		}
	}
	class b3Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			p.setBackground(Color.YELLOW);
		}
	}
	
	class Move2Listener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			
		}
	}
	class MoveListener implements KeyListener{
		@Override  //this.b1.addKeyListener(new MoveListener());
		public void keyTyped(KeyEvent e) {//
		}
		@Override //�����̰���ȥ��
		public void keyPressed(KeyEvent e) {
			int key =e.getKeyCode();//�õ���������
			Object o= e.getSource();
			int x =((JButton)o).getX();
			int y =((JButton)o).getY();
			if(key==KeyEvent.VK_LEFT){//���������
				((JButton)o).setLocation(x-5, y);//��ť���Ƶ���
			}
			if(key==KeyEvent.VK_RIGHT){
				((JButton)o).setLocation(x+5, y);//��ť���Ƶ���				
			}
			if(key==KeyEvent.VK_UP){
				((JButton)o).setLocation(x, y-5);
			}
			if(key==KeyEvent.VK_DOWN){
				((JButton)o).setLocation(x, y+5);
			}
		}
		@Override
		public void keyReleased(KeyEvent e) {
		}
	}
}