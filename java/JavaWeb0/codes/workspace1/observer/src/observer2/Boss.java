package observer2;

public class Boss extends Subject{

	public void change(String newState){
		this.setState(newState);
		System.out.println("��״̬��"+newState);
		this.nodify(newState);//�Լ���״̬�ı��ˣ�֪ͨ��ע�������ͬ��
	}
}
