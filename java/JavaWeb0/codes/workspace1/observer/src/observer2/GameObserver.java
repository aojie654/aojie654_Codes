package observer2;

//͵��СְԱ��
public class GameObserver extends Observer{
	public GameObserver(String name) {
		super(name);
	}
	//��������֪ͨ�ı�״̬��
	public void update(String action){
		if(action.equals("�ϰ���")){
			System.out.println(this.getName()+"�ϰ��ڣ��úù�����");
		}
		if(action.equals("�ϰ岻��")){
			System.out.println(this.getName()+"�ϰ岻�ڣ���ʼ͵��������Ϸ����");
		}
	}
	
	
}