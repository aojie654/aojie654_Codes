package observer;

import java.util.ArrayList;
import java.util.List;
//���������Ҫ�����Ǹ���action�����֪ͨ��λС���ѣ�
public class Secretary {
	//����õ���Ϣ��
	private String state;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	//�����ϵ�õ�ͬ�µ�List
	private List<Observer> list = new ArrayList<Observer>();
	//�󶨹�ϵ�õ�ͬ��
	public void attach(Observer o){
		list.add(o);
		System.out.println(o.getName()+"���ҹ�ϵ�ã�������Ҫ֪ͨ����");
	}
	//֪ͨÿ���ˣ��������
	public void nodify(){
		for(Observer o:list){
			o.update(this.state);
		}
	}
}
