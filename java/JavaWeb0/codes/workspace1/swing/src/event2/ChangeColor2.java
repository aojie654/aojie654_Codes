package event2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChangeColor2 {

	//Frame Panel Button
	
	JFrame f;
	public JPanel p;
	JButton b1,b2,b3;
	
	//���캯��û�з���ֵ��
	public ChangeColor2(){
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
		//���������ϼ����� 
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				p.setBackground(Color.red);
			}});
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				p.setBackground(Color.green);
			}});
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				p.setBackground(Color.YELLOW);
			}});
	}
	public static void main(String[] args){
		new ChangeColor2();
	}
	
}