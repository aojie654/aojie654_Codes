package version2;

public class GameStudent extends Observer{

	public GameStudent(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	//����״̬�ı�۲��ߵ���Ϊ��
	public void update(String newState){
		if(newState.equals("��ʦ����")){
			System.out.println("��ʦ���ڣ�"
		+this.getName()+"��ʼ����Ϸ��");
		}
		if(newState.equals("��ʦ��")){
			System.out.println("��ʦ�ڣ�"
		+this.getName()+"�ú�ѧϰ��");
		}
	}

}
