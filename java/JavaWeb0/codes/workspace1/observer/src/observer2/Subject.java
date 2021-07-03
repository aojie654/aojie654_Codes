package observer2;

import java.util.ArrayList;
import java.util.List;
//���������Ҫ�����Ǹ���action�����֪ͨ��λС���ѣ�
public class Subject {
	//����õ���Ϣ��
	private String state;
	public String getState(){
		return state;
	}
	public String setState(String state){
		return this.state=state;
	}
	//�����ϵ�õ�ͬ�µ�List
	private List<Observer> list = new ArrayList<Observer>();
	//�󶨹�ϵ�õ�ͬ��
	public void attach(Observer o){
		list.add(o);
		System.out.println(o.getName()+"����һ��Ҫ֪ͨ��ͬ��");
	}
	//֪ͨÿ���ˣ��������
	public void nodify(String newState){
		for(Observer o:list){
			o.update(newState);
		}
	}
}
