package item2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
//��ҵui���3ѡ1
//1 ����һ�������ҽ��棡�����Chat�� 
//2 ����һ�����������档 GridBagLayout
//3 ����һ�����±�ҳ�棡ѧϰ�˵�������ο���
public class LabelDemo extends JFrame{
	
	
	JLabel l1,l2,l3;
	JTextField  t1,t2 ,t3;
	JTextArea ta;
	JButton b1,b2;
	public LabelDemo(){
	
		l1 = new JLabel("��ð�");
		
		l2 = new JLabel(new ImageIcon("images//logo.png"));
		l3 = new JLabel("�緹����û");
		l3.setForeground(Color.BLUE);
		
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t3 = new JTextField(10);
		ta = new JTextArea(2,20);
		
		b1 =new JButton("��ť1");
		b2 =new JButton("��ť2");
		
		this.setLayout(new FlowLayout());
		this.add(l1);
		this.add(l2);
		this.add(l3);
		this.add(t1);
		this.add(t2);
		this.add(t3);
		this.add(ta);
		this.add(b1);
		this.add(b2);
		this.setTitle("��ǩ");//���ô������֣�
		this.setSize(300, 300);
		this.setLocation(100, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		b1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String str="t1:"+t1.getText()+
						" t2:"+t2.getText()+" t3:"+t3.getText();
				ta.setText(ta.getText()+str);
			}
		});
		
		b2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(
						b2, "�ղ������˰�ť2", "��Ϣ", JOptionPane.INFORMATION_MESSAGE);
		}});
	}
	
	
	
	public static void main(String[] args){
		new LabelDemo();
	}
}
