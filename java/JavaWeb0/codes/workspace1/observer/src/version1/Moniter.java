package version1;

import java.util.ArrayList;
import java.util.List;

//Subject�����Observer֪ͨ����
public class Moniter {
	private List<Student> list = 
			new ArrayList<Student>();
	public void attach(Student stu){
		list.add(stu);
		System.out.println(stu.getName()+"���ҹ�ϵ����������Ҫ֪ͨ��");
	}
	public void dettach(Student stu){
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
		
		for(Student stu:list){
			stu.update(newState);
		}
	}
}
