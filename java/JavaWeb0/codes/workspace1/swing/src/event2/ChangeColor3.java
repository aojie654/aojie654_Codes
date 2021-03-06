package event2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChangeColor3 {

	//Frame Panel Button
	
	JFrame f;
	public JPanel p;
	JButton b1,b2,b3;
	
	//构造函数没有返回值！
	public ChangeColor3(){
		b1 = new JButton("红色");
		b2 = new JButton("绿色");
		b3 = new JButton("黄色");
		p = new JPanel();
		f = new JFrame("窗口");
		p.add(b1);
		p.add(b2);
		p.add(b3);
		f.add(p);
		f.setSize(200, 300);
		f.setLocation(50, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);//初始化好后，显示窗口！
		//给组件添加上监听器
		addListener();
	}
	public static void main(String[] args){
		new ChangeColor3();
	}
	//添加监听器
	public void addListener(){
		this.b1.addActionListener(new b1Listener() );//给b1注册监听器
		this.b2.addActionListener(new b1Listener() );//给b2注册监听器
		this.b3.addActionListener(new b1Listener() );//给b3注册监听器
	}
	//内部类 构造监听器！实现接口
	class b1Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Object o =e.getSource();//得到事件源。也就是某个被Action的组件
			if(o==b1){
				p.setBackground(Color.RED);
			}
			if(o==b2){
				p.setBackground(Color.GREEN);
			}
			if(o==b3){
				p.setBackground(Color.YELLOW);
			}
		}
	}
}