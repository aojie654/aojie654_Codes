package version2;

import java.util.ArrayList;
import java.util.List;

//Subject�����Observer֪ͨ����
public abstract class Subject {
	private List<Observer> list = 
			new ArrayList<Observer>();
	public void attach(Observer stu){
		list.add(stu);
		System.out.println(stu.getName()+"���ҹ�ϵ����������Ҫ֪ͨ��");
	}
	public void dettach(Observer stu){
		list.remove(stu);
		System.out.println("����"+stu.getName()+"���ˣ�����Ҳ��������");
	}
	
	private String state;//�೤��ʱ����״̬��
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	//֪ͨ��λ���ĵĶ�������Լ�����Ϊ��
	public void inform(String newState){
		for(Observer stu:list){
			stu.update(newState);
		}
	}
}
