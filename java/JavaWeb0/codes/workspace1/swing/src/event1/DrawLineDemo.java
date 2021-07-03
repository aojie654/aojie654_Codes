package event1;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class DrawLineDemo extends JFrame{
	//�����������걣��
	int x =-1;
	int y = -1;
	int prex=-1;
	int prey=-1;
	public DrawLineDemo(){
		super("����");//����
		
		this.addMouseListener(new DrawLine());
		
		this.setSize(500, 600);
		this.setLocation(100, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args){
		new DrawLineDemo();
	}
 //���»���������	
 public void paint(Graphics g){
	 if(prex>0 && prey>0){
		 g.drawLine(prex, prey, x, y);
		 prex = x;
		 prey = y;
	 }
 }
 class 	DrawLine implements MouseListener{
	@Override
	public void mouseClicked(MouseEvent e) {

	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		//button3 ����Ҽ�
		x = e.getX();
		y = e.getY();
		DrawLineDemo.this.repaint();
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		//���»�������
		//button3 ����Ҽ�
		prex = e.getX();
		prey = e.getY();
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	 
 }
}
