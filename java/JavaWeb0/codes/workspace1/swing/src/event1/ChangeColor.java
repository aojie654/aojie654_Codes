package event1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChangeColor {

	private JButton b1,b2,b3;
	private JPanel p1;
	private JFrame f1;
	
	public ChangeColor(){
		b1 = new JButton("��ɫ");
		b2 = new JButton("��ɫ");
		b3 = new JButton("��ɫ");
		
		p1 = new JPanel();
		f1 = new JFrame("��ɫ����");
		
		//b1ע��һ������������
		b1.addActionListener(new ActionListener(){
			//����ActionListener����� actionPerformed����
			//��������
			public void actionPerformed(ActionEvent e){
				p1.setBackground(Color.RED);//���p1����ɫ�ߺ�
				
			}
		});//b2ע��һ������������
		b2.addActionListener(new ActionListener(){
			//����ActionListener����� actionPerformed����
			//��������
			public void actionPerformed(ActionEvent e){
				p1.setBackground(Color.GREEN);
			}
		});//b3ע��һ������������ 
		b3.addActionListener(new ActionListener(){
			//����ActionListener����� actionPerformed����
			//��������
			public void actionPerformed(ActionEvent e){
				p1.setBackground(Color.YELLOW);
			}
		});
		
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		f1.add(p1);
		f1.setSize(500,600);
		f1.setLocation(300,300);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setVisible(true);
	}
	

	public static void main(String[] args) {
		new ChangeColor();
	}

}
