package observer;

//͵��СְԱ��
public class Observer {
	private  String name;
	public Observer(String name){
		this.name=name;
	}
	//��������֪ͨ�ı�״̬��
	public void update(String action){
		if(action.equals("�ϰ���")){
			System.out.println(this.name+"�ϰ��ڣ��úù�����");
		}
		if(action.equals("�ϰ岻��")){
			System.out.println(this.name+"�ϰ岻�ڣ���ʼ͵��������Ʊ������Ϸ����");
		}
	}
	public String getName() {
		return name;
	}
	
}
