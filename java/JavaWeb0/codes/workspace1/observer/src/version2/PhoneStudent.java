package version2;

public class PhoneStudent extends Observer{

	public PhoneStudent(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	//����״̬�ı�۲��ߵ���Ϊ��
	public void update(String newState){
		if(newState.equals("��ʦ����")){
			System.out.println("��ʦ���ڣ�"
		+this.getName()+"��ʼ���ֻ���");
		}
		if(newState.equals("��ʦ��")){
			System.out.println("��ʦ�ڣ�"
		+this.getName()+"�ú�ѧϰ��");
		}
	}
}
